class Vehicle1{
	void move(){
		System.out.println("움직인다.");
	}
}

interface Flyable{
	void fly();
}

class Interface2Impl extends Vehicle1 implements Flyable{
	public void fly(){
		System.out.println("날고있다.");
	}
}

public class InterfaceTest2{
	public static void main(String args[]){
		Interface2Impl im2 = new Interface2Impl();
		
		im2.fly();
		im2.move();
	}
}