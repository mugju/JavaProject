import java.util.Scanner;
public class MemberService{
	void process(Action action, Scanner sc){
		action.excute(sc); //다형성 이용.
	}
}