package arrayList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialAndDeSerialArraylist {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");

		try {
			// Serialization
			FileOutputStream fileOutputStream = new FileOutputStream("d");
			ObjectOutputStream obj = new ObjectOutputStream(fileOutputStream);
			obj.writeObject(al);
			obj.close();
			fileOutputStream.close();

			// De-serialization
			FileInputStream fileInputStream = new FileInputStream("d");
			@SuppressWarnings("resource")
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			@SuppressWarnings("unchecked")
			ArrayList<String> list = (ArrayList<String>) objectInputStream.readObject();
			System.out.println(list);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
