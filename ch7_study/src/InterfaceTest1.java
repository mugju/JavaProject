interface Interface1{
	int interVar = 10;
	void interface1Method();
}

class Interface1Impl implements Interface1{
	public void interface1Method(){
		System.out.println("interfacemethod1 ����");
	}
}

public class InterfaceTest1{
	public static void main(String args[]){
		Interface1Impl im1 = new Interface1Impl();
		
		im1.interface1Method();
		
		System.out.println(Interface1.interVar);
		System.out.println(Interface1Impl.interVar);
	}
}