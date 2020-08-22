import java.util.Scanner;

public class DeleteAction implements Action {
	public void excute(Scanner sc) {
		System.out.println("삭제할 회원의 이름을 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		deleteMember(name);
	}
	private void deleteMember(String name){
		int deleteIndex = -1;
		MemberVO[] members = MemberMain.members;
		MemberVO[] temp = null;
		
		for(int i=0; i<members.length;i++){
			if(members[i].getName().equals(name)){
				deleteIndex = 1;
			}
		}
		
		if(deleteIndex == -1){
			System.out.println("회원을 찾을 수 없습니다.");
			return;
		}
		if(members.length >= 1){
			temp = new MemberVO[members.length -1]; //하나 줄어드니까
			for(int j = 0; j<members.length; j++){
				if(j == deleteIndex){
					continue;
				}
				else if(j > deleteIndex){
					temp[j-1] = members[j];
				}
				else{
					temp[j] = members[j];
				}
			}
			
		}
		
		MemberMain.members = temp;
	}
}