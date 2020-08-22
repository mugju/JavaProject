public class InstanceOf{
	
	public static void main(String args[]){
		
		President president1 = new President();
		
		Person person1 = president1;
		
		if(person1 instanceof President){
			President presidcent = (President)person1;
			System.out.println("person1을 President타입으로 캐스팅 성공");
		}
		else
			System.out.println("person1을 President타입으로 캐스팅 불가");
	}
}