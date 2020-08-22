interface In1 {
	int x = 10;

	void In1Method();
}

interface In2 {
	int y = 20;

	void In1Method();

	void In2Method();
}

interface In3 extends In1, In2 {
}

class ExtendsTest implements In3 {
	public void In1Method() {

	}

	public void In2Method() {

	}
}

public class InterfaceTest3{
	public static void main(String args[]){
		ExtendsTest et = new ExtendsTest();
		
		et.In1Method();
		et.In2Method();
		
		System.out.println(et.x);
		
		System.out.println(et.y);
	}
}