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

		int fixDice = 0; // 더이상 굴리지않을 주사위를 정하기 위함

		int count = 0; // 반복문을 위함 주사위 3번 반복

		int Scoreset; // 족보점수를 정하기 위해
		do {
			do {
				count = 0;
				count++;
				System.out.println("주사위를 굴립니다.");
				for (int i = 0; i < 5; i++) {
					if (dice[i].isFixed == false) {// 고정 안하는 경우
						System.out.println((i + 1) + "번째 다이스 숫자");
						dice[i].number = random.nextInt(6) + 1;
						System.out.println(dice[i].number);

					} else {
						System.out.println((i + 1) + "번째 다이스 숫자");
						System.out.println(dice[i].number);
					}
				}

				System.out.println("고정 시킬 주사위를 정해주세요");
				System.out.println("고정 시킬것이 더이상 없고 돌리기를 그만 두고 싶다면 9를 입력하세요 ");
				System.out.println("전부 돌리고 싶다면 8을 입력하세요 ");
				fixDice = sc.nextInt();

				if (fixDice == 9) {
					break;
				} else if (fixDice == 8) {
					System.out.println("주사위를 전부 리롤합니다. ");
				} else {
					System.out.println("고정시킬 다이스는" + fixDice + "번쨰 입니다. 고정하고 나머지를 굴립니다."); // 예외처리
					// 들어가야함.
					dice[fixDice - 1].isFixed = true;
				}
			} while (count < 3);
			System.out.println("주사위 굴리기를 종료합니다");
			System.out.println("점수 예상표");
			up.checkScore(dice, 0); // 여기는 점수 예상하는것
			lp.checkScore(dice, 0);
			System.out.println("현재 점수표");
			System.out.println(up.toString());
			System.out.println(lp.toString());

			System.out.println("점수를 등록할 족보의 번호를 입력주세요");
			System.out.println("1. onePoint, 2. twoPoint, 3. threePoint, 4. fourPoint, 5. fivePoint, 6. sixPoint");
			System.out.println("7. fourkind, 8. fullHouse, 9. smallStraight, 10. largeStraight, 11. chance, 12. yachu");
			Scoreset = sc.nextInt();

			if (Scoreset < 7)
				up.setScore(dice, Scoreset);
			else if (Scoreset >= 7)
				lp.setScore(dice, Scoreset);
			else
				System.out.println("잘못된 입력입니다");
		} while (true);
	}
}