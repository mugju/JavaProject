import java.util.Scanner;

public class DeleteAction implements Action {
	public void excute(Scanner sc) {
		System.out.println("������ ȸ���� �̸��� �Է��ϼ���.");
		System.out.print("�̸� : ");
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
			System.out.println("ȸ���� ã�� �� �����ϴ�.");
			return;
		}
		if(members.length >= 1){
			temp = new MemberVO[members.length -1]; //�ϳ� �پ��ϱ�
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