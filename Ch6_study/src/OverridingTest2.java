public class OverridingTest2{
	public static void main(String args[]){
		Employee employee = new Employee();
		Person person = employee;
		
		System.out.println("employee.x = " + employee.x);
		System.out.println("person.x = " + person.x);
		employee.sleep();
		person.sleep();
	}
}