package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) throws Exception {
		
		Dog d1 = new Dog();
		
		//Serialization Start
		FileOutputStream fot = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fot);
		oos.writeObject(d1);
		////Serialization End
		
		//Deserialization Start
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		//Deserialization Start
		System.out.println(d2.i+"----"+d2.j);

	}

}
