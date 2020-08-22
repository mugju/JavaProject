public class StringTest2{
	public static void main(String args[]){
		String originalString = new String("Java");
		String lastString = originalString.concat("String");
		
		System.out.println(originalString == lastString);
	}
}