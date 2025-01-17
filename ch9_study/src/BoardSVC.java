import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC{
	ArrayList<BoardVO> boardList;
	public BoardSVC(){
		boardList  = new ArrayList<BoardVO>();
		
	}
	
	public void writeArticle(Scanner sc){
		System.out.println("게시판 글을 작성하세요.");
		System.out.print("작성자 : ");
		String register = sc.next();
		System.out.println("이메일 : ");
		String email = sc.next();
		System.out.println("비밀번호 : ");
		String passwd = sc.next();
		System.out.println("제목 : ");
		String subject = sc.next();
		System.out.println("글 내용 : ");
		String content = sc.next();
		
		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		addArticle(boardVO);
	}
	
	
	private void addArticle(BoardVO boardVO){
		boardList.add(boardVO);
	}
	
	public void listArticle(Scanner sc){
		if(boardList.size() > 0){
			for(int i = 0 ; i<boardList.size();i++){
				System.out.println(boardList.get(i));
			}
		}
		else{
			System.out.println("등록된 글이 없습니다");
		}
	}
	public void removeArticle(Scanner sc){
		System.out.println("제거할 글의 작성자와 비밀번호를 입력하세요");
		
		System.out.print("작성자 : ");
		String register = sc.next();
		
		System.out.println("비밀번호 : ");
		String passwd = sc.next();
		
		removeArticle(register,passwd);
	}
	private void removeArticle(String register, String passwd){
		if(boardList.size()>0){
			int index = -1;
			for(int i = 0; i <boardList.size();i++){
				if(boardList.get(i).getRegister().equals(register) && boardList.get(i).getPasswd().equals(passwd)){
					boardList.remove(i);
					index  = i; //지웠다는 증거.
				}
				else{
					System.out.println("작성자 혹은 비밀번호가 일치하지 않습니다.");
				}
			}
		}
		else{
			System.out.println("작성된글이 존재하지 않습니다.");
		}
	}
}