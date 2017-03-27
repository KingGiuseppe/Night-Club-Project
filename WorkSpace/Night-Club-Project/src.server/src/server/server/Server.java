package src.server.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

public class Server {

	private ObjectInputStream inputFromClient;
	private ObjectOutputStream outputToClient;
	private Object object;

	public static void main(String[] args) throws SQLException {
		new Server();
	}

	public Server() throws SQLException {

		try {
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(8000);
			System.out.println("Server Started!");

			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println(socket.getInetAddress());

				inputFromClient = new ObjectInputStream(socket.getInputStream());
				outputToClient = new ObjectOutputStream(socket.getOutputStream());
				object = inputFromClient.readObject();

				ServerMethods.getServerMethod(object, outputToClient);

				inputFromClient.close();
				outputToClient.close();

			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
