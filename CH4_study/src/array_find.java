import java.util.Scanner;

public class array_find {

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String nations[] = { "한국", "일본", "중국", "러시아", "미국","남 아프리카 공화국" };

		int index = nations.length;
		while (true) {
			System.out.println("찾을 나라를 입력해주세요.");

			String name = sc.nextLine();

			for (int i = 0; i < nations.length; i++) {
				if (name.equals(nations[i])) {
					index = i;
				}
			}
			if (index != nations.length){
				System.out.println(nations[index] + "찾았습니다");
				index = nations.length;
			}
			else
				System.out.println("찾고자 하는 국가가 없습니다");
		}
	}
}