import java.util.Scanner;

public class array_find {

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String nations[] = { "�ѱ�", "�Ϻ�", "�߱�", "���þ�", "�̱�","�� ������ī ��ȭ��" };

		int index = nations.length;
		while (true) {
			System.out.println("ã�� ���� �Է����ּ���.");

			String name = sc.nextLine();

			for (int i = 0; i < nations.length; i++) {
				if (name.equals(nations[i])) {
					index = i;
				}
			}
			if (index != nations.length){
				System.out.println(nations[index] + "ã�ҽ��ϴ�");
				index = nations.length;
			}
			else
				System.out.println("ã���� �ϴ� ������ �����ϴ�");
		}
	}
}