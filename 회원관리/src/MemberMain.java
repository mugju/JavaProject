import java.util.Scanner;
public class MemberMain{
	static MemberVO[] members;
	
	public static void main(String args[]){
		MemberService memberservice = new MemberService();
		Scanner sc = new Scanner(System.in);
		members = new MemberVO[0];
		boolean isStop = false;
	
		do{
			System.out.println("다음 메뉴중 하나를 입력하세요");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원 목록 보기");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 종료");
			
			
			String command = sc.next();
			
			switch(command){
			case "1" : 
				AddAction writeAction = new AddAction();
				memberservice.process(writeAction, sc);
				break;
			case "2" : 
				ListAction listAction = new ListAction();
				memberservice.process(listAction, sc);
				break;
			case "3" : 
				DeleteAction deleteAction = new DeleteAction();
				memberservice.process(deleteAction, sc);
				break;
			case "4" : 
				UpdateAction updateAction = new UpdateAction();
				memberservice.process(updateAction, sc);
				break;
			case "5":
				isStop = true;
			}
		}while(!isStop);
	}
}