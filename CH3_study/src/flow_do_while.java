import java.util.InputMismatchException;
import java.util.Scanner;
public class flow_do_while{
	/*
	 * 20-08-03
	 * �ۼ��� : �赿�� 
	 * 
	 */
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random()*100);
		int inputNum = 0;
		
		do{
			System.out.println("���ڸ� �Է��ϼ���");
			try{
				inputNum = sc.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("������ �ƴմϴ�..");
				sc = new Scanner(System.in);
				continue;
			}
			
			if(inputNum == number){
				System.out.println("�������ϴ�");
				break;
			}
			else if(inputNum > number){
				System.out.println("���ڰ� Ů�ϴ�");
				
			}
			else if(inputNum<number){
				System.out.println("���ڰ� �۽��ϴ�");
			}
		
		}while(true);
	}
}
	