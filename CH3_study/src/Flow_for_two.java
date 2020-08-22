public class Flow_for_two{
	/*
	 * 20-08-03
	 * ÀÛ¼ºÀÚ : ±èµ¿Çõ 
	 * 
	 */
	public static void main(String args[]){
		//int i;
		int num = 0;
		for(int i =0;i<=5;i++){
			for(int j=0;j<=i;j++){
				System.out.println(++num + " ");
			}
			System.out.println();
		}
		num = 0;
		
		for(int i = 1;i<=5;i++){
			for(int j=1;j<=(6-i);j++){
				System.out.println(++num + " ");
			}
		}
	}
}