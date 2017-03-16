package server;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

import bags.DataBase;
import controller.GetEventsController;
import model_for_login.LoginObject;

public class Server {

	public static void main(String[] args) {
		new Server();
	}

	private static DataBase db;
	private ObjectInputStream inputFromClient;
	private ObjectOutputStream outputToClient;
	private Object object;
	private static Socket socket;
	
	public Server() {

		try {
			ServerSocket serverSocket = new ServerSocket(8000);
			System.out.println("Server started");

			while (true) {
				Socket socket = serverSocket.accept();

				inputFromClient = new ObjectInputStream(socket.getInputStream());
				outputToClient = new ObjectOutputStream(socket.getOutputStream());
				object = inputFromClient.readObject();

				if (object.getClass() == LoginObject.class) {
					try {
						sendLoginValidation(outputToClient, object);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				} else if(object.toString().equals("Get Events")) {
					try {
						getEventsList(outputToClient);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		finally {
			try {
				inputFromClient.close();
				outputToClient.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}

	public static void sendLoginValidation(ObjectOutputStream out, Object object)
			throws ClassNotFoundException, SQLException, IOException {
		db = new DataBase();
		if (db.getLoginVerification(((LoginObject) object).getUsername(),
				((LoginObject) object).getPassword()) == true) {
			System.out.println(db.getAccount(((LoginObject) object).getUsername(), ((LoginObject) object).getPassword()).getFirstName() + " Server");
			out.writeObject(db.getAccount(((LoginObject) object).getUsername(), ((LoginObject) object).getPassword()));
			out.flush();
		} else {
			out.writeObject(null);
		}
	}
	
	public static void getEventsList(ObjectOutputStream out) throws ClassNotFoundException, SQLException, IOException {
		db = new DataBase();
		if(db.getEvents() != null) {
			out.writeObject(db.getEvents());
			out.flush();
		} else {
			out.writeObject(null);
		}
	}
}
