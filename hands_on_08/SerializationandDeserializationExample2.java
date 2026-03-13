package hands_on_08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
//Static variable and transient variable cannot be serialized

class Employee2 implements java.io.Serializable {
	private static final long serialversionUID = 129348938L;
	transient int empId;
	static int deptId;
	String name;
	int age;

	public Employee2(String name, int age, int id, int deptid) {
		this.name = name;
		this.age = age;
		empId = id;
		deptId = deptid;
	}
	
	public static void printdata(Employee2 object) {
		System.out.println("Name: "+object.name);
		System.out.println("Age: "+object.age);
		System.out.println("Employee Id: "+object.empId);
		System.out.println("Department Id: "+Employee2.deptId);
	}
}

public class SerializationandDeserializationExample2 {

	public static void main(String[] args) {
		Employee2 object = new Employee2("Ram", 29, 2, 1000);
		String filename = "Ram.txt";
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized\n" + "Data Before Deserialzied");
			Employee2.printdata(object);
//			object.deptId = 2000;
			object.age = 100;
		} catch (IOException ex) {
			System.out.println("IOExceptionis caught");
		}
		object = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			object = (Employee2) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
			Employee2.printdata(object);
		} catch (IOException ex) {
			System.out.println("IOExceptionis caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}
}
