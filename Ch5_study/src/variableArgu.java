public class variableArgu{
	
	void printInfo(String...infos){
		if(infos.length != 0){
			for(String info : infos){
				System.out.println(info);	
			}
			
		}
	}
	
	
	public static void main(String[] args){
		
		variableArgu var = new variableArgu();
		
		var.printInfo("말도안돼","이럴수가","세상에나");
	}
}