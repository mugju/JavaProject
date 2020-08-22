import java.util.Scanner;

public class ListAction implements Action{
	public void excute(Scanner sc){
		MemberVO[] members = MemberMain.members;
		if(members.length >= 1){
			for(int i=0; i<members.length; i++){
				System.out.println("이름 : " + members[i].getName() + "\n나이 " + members[i].getAge() +  "\n이메일 : " + members[i].getEmail());
			}
		}
		else{
			System.out.println("회원정보가 없습니다.");
		}
	}
}