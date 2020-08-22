class Parent{
	int parentvar;
	void parentMethod(){
		System.out.println("Parent Method");
	}
}
class Child extends Parent{
	int childvar;
	void childMethod(){
		System.out.println("Child Method");
	}
}

public class extend{
	//상속 테스트
	public static void main(String args[]){
		Child child = new Child();
		
		System.out.println("child.parentvar = " + child.parentvar);
		System.out.println("child.childvar = " + child.childvar);
		
		child.childMethod();
		
		child.parentMethod();
	}
}