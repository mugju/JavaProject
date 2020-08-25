import java.util.Random;
import java.util.Scanner;

public class Dicemain {
	public static void main(String args[]) {

		UpperPoint up = new UpperPoint();
		LowerPoint lp = new LowerPoint();

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		Dice[] dice = new Dice[5];
		
		boolean isStop = false;
		
		for (int i = 0; i < 5; i++) {
			dice[i] = new Dice();
		}

		int fixDice = 0;
		
		int count = 0;
		do {
			count ++;
			System.out.println("주사위를 굴립니다.");
			for (int i = 0; i < 5; i++) {
				if (dice[i].isFixed == false) {// 고정 안하는 경우
					System.out.println((i + 1) + "번째 다이스 숫자");
					dice[i].number = random.nextInt(6) + 1;
					System.out.println(dice[i].number);

				}
				else{
					System.out.println((i + 1) + "번째 다이스 숫자");
					System.out.println(dice[i].number);
				}
			}

			System.out.println("고정 시킬 주사위를 정해주세요");
			fixDice = sc.nextInt();
			
			System.out.println("고정시킬 다이스는" + fixDice + "번쨰 입니다. 고정하고 나머지를 굴립니다."); // 예외처리
																				// 들어가야함.
			dice[fixDice - 1].isFixed = true;
		}while(!isStop && count == 3 );
		up.checkScore(dice);
		lp.checkScore(dice);
	}
}