public class var{
	//변수선언
	int vvar;
	
	static int staticvar;
	
	public static void main(String args[]){
		
		int localvar; //로컬변수
		var some = new var();
		
		System.out.println(some.vvar);
		System.out.println(some.staticvar);
		
		var.staticvar++;
		
		System.out.println(staticvar);
		var.staticvar = 20;
		System.out.println(var.staticvar);
		System.out.println(staticvar);
		var some2 = new var();
		
		System.out.println(some2.staticvar);
	}
	
}