import java.util.Scanner;

public class BoardMain{
	public static void main(){
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		BoardSVC boardSVC = new BoardSVC();
		
		do{
			System.out.println("<메뉴>");
			System.out.println("1. 게시판 글 쓰기");
			System.out.println("2. 글 목록 보기");
			System.out.println("3. 글 삭제");
			System.out.println("4. 종료");
			
			String menu = sc.next();
			
			switch(menu){
			case "1":
				boardSVC.writeArticle(sc);
				break;
			case "2":
				boardSVC.listArticle(sc);
				break;
			case "3":
				boardSVC 
			case "4":
			}
		}while(isStop);
		
	}
}