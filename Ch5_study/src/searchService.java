public class searchService{
	Member[] members = new Member[5];
	public searchService(){
		members[0] = new Member("오정원",167,77,"대한민국");
		members[1] = new Member("오상원",168,76,"대한민국");
		members[2] = new Member("오자원",169,75,"대한민국");
		members[3] = new Member("오미원",170,74,"대한민국");
		members[4] = new Member("오구원",171,73,"대한민국");
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