public class array_init{
	
	public static void main(String args[]){
		
		String cities[]={"서울","대전","대구","부산"};
		String addit[] = new String[]{"키보드","마우스","건전지"};
		
		
		for(int i = 0;i<cities.length;i++){
			System.out.println(cities[i]);
		}
		for(int i = 0;i<addit.length;i++){
			System.out.println(addit[i]);
		}
	}
}