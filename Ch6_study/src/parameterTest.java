class PersonInfo{
	public void showSleepStyle(Person person){
		person.showSleepStyle();
	}
}

public class parameterTest{
	public static void main(String args[]){
		PersonInfo pfInfo = new PersonInfo();
		Person person = new Person();
		Employee employee = new Employee();
		President president = new President();
		Student student = new Student();
		
		
		
		pfInfo.showSleepStyle(person);
		pfInfo.showSleepStyle(president);
		pfInfo.showSleepStyle(student);
		pfInfo.showSleepStyle(employee);
	}
}