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
			System.out.println("�ֻ����� �����ϴ�.");
			for (int i = 0; i < 5; i++) {
				if (dice[i].isFixed == false) {// ���� ���ϴ� ���
					System.out.println((i + 1) + "��° ���̽� ����");
					dice[i].number = random.nextInt(6) + 1;
					System.out.println(dice[i].number);

				}
				else{
					System.out.println((i + 1) + "��° ���̽� ����");
					System.out.println(dice[i].number);
				}
			}

			System.out.println("���� ��ų �ֻ����� �����ּ���");
			fixDice = sc.nextInt();
			
			System.out.println("������ų ���̽���" + fixDice + "���� �Դϴ�. �����ϰ� �������� �����ϴ�."); // ����ó��
																				// ������.
			dice[fixDice - 1].isFixed = true;
		}while(!isStop || count==3 );
		up.checkScore(dice);
		lp.checkScore(dice);
	}
}