public class dan{
	/*
	 * 20-08-03
	 * �ۼ��� : �赿�� 
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
			System.out.println("�߸��� �Է��Դϴ�.");
	}
	
}