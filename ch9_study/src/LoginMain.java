import java.util.Scanner;

public class LoginMain{
	public static void main(String args[]) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		
		LoginSVC loginSVC = new LoginSVC();
		
		do {
			System.out.println("�α��� ȭ���Դϴ�.");
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String passwd = sc.next();
			
			User user = loginSVC.login(id, passwd);
			if(user == null) {
				System.out.println("���̵� ��й�ȣ�� Ʋ���ϴ�.");
				
			}
		
			else {
				System.out.println(user);
				isStop = true;
			}
		}while(!isStop);
	}
}