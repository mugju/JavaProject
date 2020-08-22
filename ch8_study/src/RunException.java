public class RunException{
	public void exceptionMethod() throws Exception{
		throw new Exception();
	}
	
	public static void main(String args[]){
		RunException rx = new RunException();
		
	
		try{
			rx.exceptionMethod();
		}
		catch(Exception e){
			System.out.println("예외처리함");
		}
	}
}