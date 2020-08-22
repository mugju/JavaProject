abstract class Abstract1{
	abstract void abMethod1();
}

abstract class Abstract2 extends Abstract1{
	abstract void abMethod2();
}

class generalClass extends Abstract2{
	
	void abMethod1(){
		System.out.println("Method1");
	}
	
	void abMethod2(){
		System.out.println("Method2");
	}
}

public class AbstractTest2{
	public static void main(String args[]){
		
		generalClass gn = new generalClass();
		
		gn.abMethod1();
		gn.abMethod2();
	}
}