import java.util.Scanner;

public class ExceptionTest2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		
		try{
			int result = 10/Num;
			System.out.println("result : " + result);
		}
		catch(ArithmeticException e){
			System.out.println("������ �߻���");
			return;
		}
		finally{
			System.out.println("�̰� ������ ����");
		}
	}
}