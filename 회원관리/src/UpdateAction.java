import java.util.Scanner;
public class UpdateAction implements Action{
	
	public void excute(Scanner sc){
		System.out.println("수정할 정보");
		 System.out.println("수정할 이름을 입력하세요");
		 String name = sc.next();
		 
		 MemberVO member = getUpdateMember(name);
		 
		 if(member == null){
			 System.out.println("수정할 항목이 존재하지 않습니다");
			 return;
		 }
		 
		 else{
			 System.out.println("전화번호 : ");
			 String tel = sc.next();
			 System.out.println("국가 : ");
			 String nation = sc.next();
			 System.out.println("나이 : ");
			 int age = sc.nextInt();
			 System.out.println("이메일 : ");
			 String email = sc.next();
			 
			 member = new MemberVO(age, name, tel, email, nation);
			 for(int i = 0; i<MemberMain.members.length;i++){
				 if(MemberMain.members[i].getName().equals(name)){
					 MemberMain.members[i] = member;
				 }
			 }
		 }
	}
	private MemberVO getUpdateMember(String name){
		MemberVO[] members = MemberMain.members;
		MemberVO member = null;
		for(int i= 0; i<members.length;i++){
			if(members[i].getName().equals(name))
				member = members[i];
		}
		return member;
	}
	
}