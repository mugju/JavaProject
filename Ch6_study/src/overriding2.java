class OverridingParent2{
	int money;
	void parentMethod(){
		System.out.println("parent method");
	}
}

class OverridingChild2 extends OverridinfParent{
	String money = "20¿ø";
	void childMethod(){
		System.out.println("child method");
	}
}

public class overriding2{
	public static void main(String args[]){
		OverridingChild2 over = new OverridingChild2();
		
		over.money = "90¿ø";
		System.out.println(over.money);
	}
}