import java.util.Scanner;

public class LoginMain{
	public static void main(String args[]) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		
		LoginSVC loginSVC = new LoginSVC();
		
		do {
			System.out.println("로그인 화면입니다.");
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String passwd = sc.next();
			
			User user = loginSVC.login(id, passwd);
			if(user == null) {
				System.out.println("아이디나 비밀번호가 틀립니다.");
				
			}
		
			else {
				System.out.println(user);
				isStop = true;
			}
		}while(!isStop);
	}
}