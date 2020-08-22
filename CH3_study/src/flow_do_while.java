import java.util.InputMismatchException;
import java.util.Scanner;
public class flow_do_while{
	/*
	 * 20-08-03
	 * 작성자 : 김동혁 
	 * 
	 */
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random()*100);
		int inputNum = 0;
		
		do{
			System.out.println("숫자를 입력하세여");
			try{
				inputNum = sc.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("정수가 아닙니다..");
				sc = new Scanner(System.in);
				continue;
			}
			
			if(inputNum == number){
				System.out.println("맞혔습니다");
				break;
			}
			else if(inputNum > number){
				System.out.println("숫자가 큽니다");
				
			}
			else if(inputNum<number){
				System.out.println("숫자가 작습니다");
			}
		
		}while(true);
	}
}
	