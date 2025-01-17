import java.util.Scanner;

class ArgsException extends Exception{
	private int argsNumber;
	public int getArgsNumber(){
		return argsNumber;
	}
	public void setArgsNumber(int argsNumber){
		this.argsNumber = argsNumber;
	}
	public ArgsException(String msg){
		super(msg);
	}
}
public class UserError{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			if(args.length != 2){
				ArgsException ae = new ArgsException("인자를 두개 입력해야 합니다");
				ae.setArgsNumber(args.length);
				throw ae;
			}
			else{
				System.out.println("숫자1 입력");
				int num1 = sc.nextInt();
				System.out.println("숫자2 입력");
				int num2 = sc.nextInt();
				
				System.out.println(num1 + num2);
			}
		}
		catch(ArgsException a){
			System.out.println(a.getMessage());
			System.out.println("입력한 인자 갯수는 " + a.getMessage()+ "0");
		}
	}
}