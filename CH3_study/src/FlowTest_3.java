public class FlowTest_3{
	public static void main(String args[]){
		int year = Integer.parseInt(args[0]);
		
		boolean isLeap = false;
		isLeap = (year%4 == 0 && year%100 !=0 || year%400 ==0);
		if(isLeap)
			System.out.println("¿±≥‚¿‘¥œ¥Ÿ.");
		else
			System.out.println("¿±≥‚¿Ã æ∆¥’¥œ¥Ÿ.");
	}
}