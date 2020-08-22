import java.util.Scanner;

public class SearchMain{
	public static void main(String args[]){
		searchService sv = new searchService();
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			System.out.println("검색할 이름을 입력해주세요");
			String name = sc.next();
			boolean searchResult = sv.searchMember(name);
			if(searchResult)break;
			System.out.println("찾는 회원이 없습니다");
		}
	}
}