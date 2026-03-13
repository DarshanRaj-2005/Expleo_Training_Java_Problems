package Java_Basics;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;

class Employee_1 implements java.io.Serializable{
	
	public int id;
	public String name;
	
	Employee_1(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class SerializationAndDeserialization {

	public static void main(String[] args) {
		
		Employee_1 object = new Employee_1(001,"Dharshan");
		
		String filename = "file.ser";
		
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(object);
			oos.close();
			fos.close();
			System.out.println("Object has been serialized");
		}
		catch(IOException e) {
			System.out.println("IOException caught");
		}
		
		Employee_1 object1 = null;
		
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			object1 = (Employee_1)ois.readObject();
			ois.close();
			System.out.println("Object has been deserialized");
			System.out.println("Employee Id ="+object1.id +" Employee Name= "+object1.name);
		}catch(IOException ex) {
			System.out.println("IOException is caught");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("Class Not Found");
		}
	}
}
