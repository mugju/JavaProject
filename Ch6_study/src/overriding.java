class OverridinfParent{
	void parentMethod(){
		System.out.println("parent method");
	}
	
}

class OverridingChild{
	void parentMethod(){
		System.out.println("overriding method");
	}
}

public class overriding{
	
	public static void main(String args[]){
		OverridingChild ov = new OverridingChild();
		
		ov.parentMethod();
	}
	
}