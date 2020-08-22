class Sawon{
	String name;
	String dept;
	int salary;
	
	String displayInfo(){
		return "name : " + name + "dept : " + dept + "salary : " + salary;
	}
}

class Sales extends Sawon{
	int commition;
	
	String displayInfo(){
		return super.displayInfo() + "commition" + commition;
	}
}

public class supertest{
	public static void main(String args[]){
		Sales sa = new Sales();
		
		System.out.println(sa.displayInfo());
	}
}