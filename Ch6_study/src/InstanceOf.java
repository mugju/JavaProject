public class InstanceOf{
	
	public static void main(String args[]){
		
		President president1 = new President();
		
		Person person1 = president1;
		
		if(person1 instanceof President){
			President presidcent = (President)person1;
			System.out.println("person1�� PresidentŸ������ ĳ���� ����");
		}
		else
			System.out.println("person1�� PresidentŸ������ ĳ���� �Ұ�");
	}
}