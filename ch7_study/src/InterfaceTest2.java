class Vehicle1{
	void move(){
		System.out.println("�����δ�.");
	}
}

interface Flyable{
	void fly();
}

class Interface2Impl extends Vehicle1 implements Flyable{
	public void fly(){
		System.out.println("�����ִ�.");
	}
}

public class InterfaceTest2{
	public static void main(String args[]){
		Interface2Impl im2 = new Interface2Impl();
		
		im2.fly();
		im2.move();
	}
}