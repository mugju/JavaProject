public class staticMethod{
	
	int memVar;
	static int staticVar;
	
	void memMethod1(){
		int local= memVar;
		local = staticVar;
		staticMethod1();
		
		memMethod2();
		
		System.out.println("memMethod1");
	}
	
	void memMethod2(){
		System.out.println("memMethod2");
	}
	
	static void staticMethod1(){
		//int local = memVar;
		//memMethod1();
		staticMethod st = new staticMethod();
		int local = st.memVar;
		st.memMethod2();
		staticMethod2();
		System.out.println("staticMethod1");
	}
	
	static void staticMethod2(){
		System.out.println("staticMethod2");
	}
	
	public static void main(String args[]){
		
		//staticMethod.memMethod1();
		staticMethod st = new staticMethod();
		st.memMethod1();
		
		staticMethod.staticMethod2();
		staticMethod2();
		int local = staticVar;
	}
}