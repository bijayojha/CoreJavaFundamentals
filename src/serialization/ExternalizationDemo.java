package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

enum Dinda{
	DINDA;
}
public class ExternalizationDemo implements Externalizable {
	private static final long serialVersionUID = 1L;
	String name;
	int sal;
	int age;
	transient boolean isMale=true;

	public ExternalizationDemo() {
		System.out.println("I am in No-arg Constructor");
	}

	public ExternalizationDemo(String name, int sal, int age) {

		this.name = name;
		this.sal = sal;
		this.age = age;
	}


	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(sal);
		out.writeBoolean(isMale);
		System.out.println("oops");

	}


	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		sal = in.readInt();
		System.out.println(in.readBoolean());

	}

	public static void main(String[] args) throws Exception {
		
		//Serialization
		ExternalizationDemo edemo=new ExternalizationDemo("Bijay", 10,32);
		FileOutputStream fos= new FileOutputStream("D://Project//Core Java//src//serialization//abc.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(edemo);
		
		//Deserialization
		
		FileInputStream fis=new FileInputStream("D://Project//Core Java//src//serialization//abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ExternalizationDemo edemo1= (ExternalizationDemo) ois.readObject();
		System.out.println("Name= "+edemo1.name+"     Sal=  "+edemo1.sal+"    Age=  "+edemo1.age);
		
		

	}

}
