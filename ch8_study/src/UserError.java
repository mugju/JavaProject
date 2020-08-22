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
				ArgsException ae = new ArgsException("���ڸ� �ΰ� �Է��ؾ� �մϴ�");
				ae.setArgsNumber(args.length);
				throw ae;
			}
			else{
				System.out.println("����1 �Է�");
				int num1 = sc.nextInt();
				System.out.println("����2 �Է�");
				int num2 = sc.nextInt();
				
				System.out.println(num1 + num2);
			}
		}
		catch(ArgsException a){
			System.out.println(a.getMessage());
			System.out.println("�Է��� ���� ������ " + a.getMessage()+ "0");
		}
	}
}