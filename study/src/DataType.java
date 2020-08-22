public class DataType{	//public class의 경우 클래스명과 파일명이 같아야한다.
	public static void main(String args[]){
		//boolean
		boolean var_boolean = true;
		
		//byte
		byte var_byte = 127;
		//short
		short var_short = 32767;
		//char
		char var_char = 'A';
		//int 
		int var_int  = 100000;
		//long 
		long var_long  = 1000000;
		//float
		float var_float = 3.14f;
		//double
		double var_double = 3.14;
		
		
		System.out.println("var_boolean = "+ var_boolean);
		System.out.println("var_byte = "+ var_byte);

		System.out.println("var_short = "+ var_short);

		System.out.println("var_char = "+ var_char);

		System.out.println("var_int = "+ var_int);
		System.out.println("var_double = "+ var_double);
		System.out.println("var_float = "+ var_float);
	}
}