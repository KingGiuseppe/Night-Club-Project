package bags;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import model_for_scheduling.ShiftObject;

public class ScheduleList implements Serializable {

	private static ArrayList<ShiftObject> shift;

	public ScheduleList() {
		super();
		this.shift = new ArrayList<ShiftObject>();
		shift.add(new ShiftObject());
		shift.add(new ShiftObject());
	}

	public void addManager(ShiftObject so) {
		shift.add(so);
	}

	public ShiftObject getIndex(int i) {
		return shift.get(i);
	}

	public ArrayList<ShiftObject> getShift() {
		return this.shift;
	}

	public void saveToFile() {
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream("ShiftList.dat"));
			for (ShiftObject e : shift) {
				outputStream.writeObject(e);
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (outputStream != null) {
					outputStream.flush();
					outputStream.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public void loadEvents() {
		ShiftObject e = null;
		ArrayList<ShiftObject> myList = new ArrayList<>();
		try {
			FileInputStream fileIn = new FileInputStream("ShiftList.dat");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			while (true) {
				try {
					e = (ShiftObject) in.readObject();
				} catch (EOFException f) {
					break;
				}
				myList.add(e);
			}
			in.close();
			fileIn.close();
			this.shift = myList;

		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
	}
}
