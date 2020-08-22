public class LoginTest{
	public static void main(String args[]){
		String id = args[0];
		String pw = args[1];
		
		if(!id.equals("Java"))
			System.out.println("id가 틀렸습니다");
		else if(!pw.equals("1q2w3e4r"))
			System.out.println("pw가 틀렸습니다");
		else
			System.out.println("환영합니다.");
	}
}