public class CastingTest{
	//캐스팅 테스트
	
	public static void main(String args[]){
		President president1 = new President();
		
		Person person1 = president1;
		
		President president2 = (President)person1;  //다운 캐스팅....
		
		
		
		Person person2 = new Person();
		
		President president3 = (President)person2;
		
		//Student student = (Student)president2;
	}
}