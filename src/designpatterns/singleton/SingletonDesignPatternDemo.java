package designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class SingletonDesignPatternDemo implements Serializable, Cloneable{
	
	private static SingletonDesignPatternDemo soleInstance = new SingletonDesignPatternDemo();
	private SingletonDesignPatternDemo(){
		System.out.println("I am creating...");
	}
	
	public static SingletonDesignPatternDemo getInstance(){
		return soleInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}


 class TestClass{
	public static void main(String[] args)throws Exception {
		SingletonDesignPatternDemo s1= SingletonDesignPatternDemo.getInstance();
		SingletonDesignPatternDemo s2= SingletonDesignPatternDemo.getInstance();
		System.out.println("s1  "+s1.hashCode());
		System.out.println("s2  "+s2.hashCode());
		
		// Violate the ST Design pattern by using Reflection API
//		
//		 Class clazz= Class.forName("designpatterns.SingletonDesignPatternDemo");
//		 Constructor<SingletonDesignPatternDemo> ctor=clazz.getDeclaredConstructor();
//		 ctor.setAccessible(true);
//		 SingletonDesignPatternDemo s3=ctor.newInstance();
//		 System.out.println("s3  "+s3.hashCode());
		 
		// S3 Will Show a Different values which means we have more that one object of our Singleton class
		 
		
		
		// Violate the ST Design pattern by using Serilization
		
//		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("C:/radha/s2.ser"));
//		oos.writeObject(s2);
//		
//		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("C:/radha/s2.ser"));
//		SingletonDesignPatternDemo s3=(SingletonDesignPatternDemo)ois.readObject();
//		System.out.println("s3  "+s3.hashCode());
		
		
		// Violate the ST Design pattern by using Clone
		
//		SingletonDesignPatternDemo s3= (SingletonDesignPatternDemo)s2.clone();
//		System.out.println("s3  "+s3.hashCode());
		
		
		// Violate the ST Design pattern by using multi class loader.
		
	/*	In environment like we have a web container and a app container and they are not directly dependent then both will end up creating two instances.
		*/
		
		// Violate the ST Design pattern by using Garbage collector.
		
		/*It has been addressed after java 1.2 version, what happens is there was, at certain time the ST object gets garbage collected then when called 
		it end up with creating another object*/
System.out.println("Dheet.................");
		 
		
	}
}