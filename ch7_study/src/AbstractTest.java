abstract class AbstractClass{
	int age;
	
	void generalMethod(){
		System.out.println("�Ϲ� �޼ҵ�");
	}
	
	abstract void abstractMethod();
}

class AbstractChildClass extends AbstractClass{

	void abstractMethod(){
		System.out.println("�߻� �޼ҵ� ����");
	}
}

public class AbstractTest{
	
	public static void main(String args[]){
		
		AbstractChildClass abb = new AbstractChildClass(); // �ڽ����� ��ü�� �����ؾ��Ѵ�..
		abb.generalMethod();
		
		abb.abstractMethod();
		
		System.out.println(abb.age);
	}
}