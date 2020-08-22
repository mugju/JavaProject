public class AirConUse{
	public static void main(String args[]){
		
		AirCon airCon = new AirCon();
		
		airCon.color = "white";
		airCon.company = "samsung";
		airCon.temp = 26;
		airCon.price = 10000;
		
		
		airCon.powerOn();
		airCon.tempUp();
		
		System.out.println(airCon.color + " " +airCon.temp);
		
		AirCon airCon2 = new AirCon();
		
		airCon2 = airCon;
		
		System.out.println(airCon2.color + " " +airCon2.temp);
		
		airCon.tempDown();
		
		airCon2.tempUp();
		System.out.println(airCon.color + " " +airCon.temp);
		System.out.println(airCon2.color + " " +airCon2.temp);
	}
}