public class LoginTest{
	public static void main(String args[]){
		String id = args[0];
		String pw = args[1];
		
		if(!id.equals("Java"))
			System.out.println("id�� Ʋ�Ƚ��ϴ�");
		else if(!pw.equals("1q2w3e4r"))
			System.out.println("pw�� Ʋ�Ƚ��ϴ�");
		else
			System.out.println("ȯ���մϴ�.");
	}
}