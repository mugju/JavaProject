abstract class AbstractClass{
	int age;
	
	void generalMethod(){
		System.out.println("일반 메소드");
	}
	
	abstract void abstractMethod();
}

class AbstractChildClass extends AbstractClass{

	void abstractMethod(){
		System.out.println("추상 메소드 구현");
	}
}

public class AbstractTest{
	
	public static void main(String args[]){
		
		AbstractChildClass abb = new AbstractChildClass(); // 자식으로 객체를 생성해야한다..
		abb.generalMethod();
		
		abb.abstractMethod();
		
		System.out.println(abb.age);
	}
}