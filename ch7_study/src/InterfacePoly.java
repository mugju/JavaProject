public class InterfacePoly{
	public static void main(String args[]){
	
		CommandProcess cp = new CommandProcess();
		
		
		ListCommand lc = new ListCommand();
		WriteCommand wc = new WriteCommand();
		cp.process(lc);
		cp.process(wc);
	}
}