public class array{
	public static void main(String args[]){
		
		
		//배열선선
		int ages[];
		String names[];
		
		//배열 객체 선언
		ages = new int[3];
		names = new String[3];
		
		//초기화 
		ages[0] = 0;
		ages[1] = 1;
		ages[2] = 2;
		
		names[0] = "홍길동";
		names[1] = "ㅋ보드";
		names[2] = "마우스";
		
		for(int i = 0; i<3 ; i++){
			
			System.out.println(ages[i]);
			System.out.println(names[i]);
		}
	}
}