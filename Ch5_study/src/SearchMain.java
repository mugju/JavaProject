import java.util.Scanner;

public class SearchMain{
	public static void main(String args[]){
		searchService sv = new searchService();
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			System.out.println("�˻��� �̸��� �Է����ּ���");
			String name = sc.next();
			boolean searchResult = sv.searchMember(name);
			if(searchResult)break;
			System.out.println("ã�� ȸ���� �����ϴ�");
		}
	}
}