public class searchService{
	Member[] members = new Member[5];
	public searchService(){
		members[0] = new Member("������",167,77,"���ѹα�");
		members[1] = new Member("�����",168,76,"���ѹα�");
		members[2] = new Member("���ڿ�",169,75,"���ѹα�");
		members[3] = new Member("���̿�",170,74,"���ѹα�");
		members[4] = new Member("������",171,73,"���ѹα�");
	}
	boolean searchMember(String name){
		boolean searchResult = false;
		for(int i = 0; i< members.length;i++){
			if(members[i].getName().equals(name)){
				printInfo(members[i]);
				searchResult = true;
			}
		}
		return searchResult;
	}
	private void printInfo(Member member){
		System.out.println("Name : "+ member.getName());
		System.out.println("Height : "+ member.getHeight());
		System.out.println("Weight : "+ member.getWeight());
		System.out.println("Nation : "+ member.getNation());
	}
	
}