public class StringTest{
	public static void main(String args[]){
		String string1 = "String";
		String string2 = "String";
		
		System.out.println("String1 == String2 : " + (string1 == string2));
		
		String string3 = new String("String");
		String string4 = new String("String");
		
		System.out.println("String3 == String4 : " + (string3 == string4));
		System.out.println("String3 == String4 : " + string3.equals(string4));
	}
}