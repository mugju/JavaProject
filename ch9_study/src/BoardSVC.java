import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC{
	ArrayList<BoardVO> boardList;
	public BoardSVC(){
		boardList  = new ArrayList<BoardVO>();
		
	}
	
	public void writeArticle(Scanner sc){
		System.out.println("�Խ��� ���� �ۼ��ϼ���.");
		System.out.print("�ۼ��� : ");
		String register = sc.next();
		System.out.println("�̸��� : ");
		String email = sc.next();
		System.out.println("��й�ȣ : ");
		String passwd = sc.next();
		System.out.println("���� : ");
		String subject = sc.next();
		System.out.println("�� ���� : ");
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
			System.out.println("��ϵ� ���� �����ϴ�");
		}
	}
	public void removeArticle(Scanner sc){
		System.out.println("������ ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���");
		
		System.out.print("�ۼ��� : ");
		String register = sc.next();
		
		System.out.println("��й�ȣ : ");
		String passwd = sc.next();
		
		removeArticle(register,passwd);
	}
	private void removeArticle(String register, String passwd){
		if(boardList.size()>0){
			int index = -1;
			for(int i = 0; i <boardList.size();i++){
				if(boardList.get(i).getRegister().equals(register) && boardList.get(i).getPasswd().equals(passwd)){
					boardList.remove(i);
					index  = i; //�����ٴ� ����.
				}
				else{
					System.out.println("�ۼ��� Ȥ�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}
		}
		else{
			System.out.println("�ۼ��ȱ��� �������� �ʽ��ϴ�.");
		}
	}
}