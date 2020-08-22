class Sawon2{
	String name;
	String dept;
	int salary;
	
	public Sawon2(String name, String dept, int salary){
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		
	}
	
	String displayInfo(){
		return " name : " + name + " dept : " + dept + " salary : " + salary;
	}
}

class Sales2 extends Sawon2{
	int commition;
	
	public Sales2(String name, String dept, int salary, int commition){
		super(name,dept,salary);
		this.commition = commition;
	}
	String displayInfo(){
		return super.displayInfo() + " commition : " + commition;
	}
}

public class superCon{
	
	public static void main(String args[]){
		Sales2 sasa = new Sales2("±èµ¿Çõ", "°³¹ßºÎ", 60000000, 2000000);
		
		System.out.println(sasa.displayInfo());
	}
}