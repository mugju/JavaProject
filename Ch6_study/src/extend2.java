class Super{
	static int x = 90;
	void superMethod(){
		System.out.println("super Method");
	}
	
	void superadd(){
		this.x ++;
	}
}

class Sub extends Super{
	int y = 10;
	void subMethod(){
		System.out.println("sub Method");
	}
}
class Subsub extends Sub{
	int z = 20;
	void subSubMethod(){
		System.out.println("subsub Method");
	}
}

public class extend2{
	public static void main(String args[]){
		Subsub ss = new Subsub();
		
		System.out.println("ss.x = " + ss.x);
		System.out.println("ss.y = " + ss.y);
		System.out.println("ss.z = " + ss.z);
		
		ss.superadd();
		System.out.println("ss.x = " + ss.x);
		
		Subsub xc = new Subsub();
		System.out.println("xc.x = " + xc.x);
	}
}