public class overloading{
	int temp;
	
	void tempUp(){
		temp++;
	}
	
	void tempUp(int amount){
		temp = temp + amount;
	}
	
	
	public static void main(String args[]){
		
		overloading over = new overloading();
		
		System.out.println(over.temp);
		
		over.tempUp();
		System.out.println(over.temp);
		over.tempUp(20);
		System.out.println(over.temp);
	}
}