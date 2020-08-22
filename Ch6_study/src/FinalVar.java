class VarClass{
	final int x;
	
	static final int y = 20;
	
	public VarClass(int x){
		this.x = x;
	}
}

public class FinalVar{
	public static void main(String args[]){
		VarClass vc = new VarClass(10);
		
		//vc.x = 32; final¿Ã∂Û æ»µ .
		//VarClass.y = 32; final¿Ã∂Û æ»µ .
	}
}