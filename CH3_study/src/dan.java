public class dan{
	/*
	 * 20-08-03
	 * 작성자 : 김동혁 
	 * 
	 */
	public static void main(String args[]){
		int DanNum = Integer.parseInt(args[0]);
		if(DanNum >= 2 && DanNum <=10){
			int num = 1;
			int result = 0;
			while(num < 10){
				result = DanNum * num;
				System.out.println(DanNum + "X" + num + "=" + result);
				num++;
			}
		}
		else
			System.out.println("잘못된 입력입니다.");
	}
	
}