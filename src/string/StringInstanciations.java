package string;

public class StringInstanciations {
	public static void main(String[] args) {
		String fstString="Bijay"; // this method is called instantiations by literal methods. in this case JVM will check the constant pool if the same string value is already presents then JVM won't create a new object instead it will point to the same object.
		String secString= new String("Bijay"); // in this case without checking in the string constant pool JVM will create a new object in the heap. if you want the JVM to check the constant pool explicitly  then call the intern() method during the object creations.
		String thirdString="Bijay";
		
		
		System.out.println("First String == "+fstString);
		System.out.println("Second String == "+secString);
		System.out.println("HashCode of fstString  ==  "+fstString.hashCode());
		System.out.println("HashCode of secString  ==  "+secString.hashCode());
		System.out.println("HashCode of thirdString  ==  "+thirdString.hashCode());
		System.out.println("Comparing the hashcode of fstString and secString == "+(secString.hashCode()==fstString.hashCode()));
		System.out.println("Comparing the Object reference of fstString and secString == "+ (fstString==secString));
		System.out.println("Comparing the content of fstString and secString == "+(fstString.equals(secString)));
		
		System.out.println("Comparing the Object reference of fstString and thirdString == "+ (fstString==thirdString));
	}


}