public class Employee extends Person{
	private String department;
	int x = 20;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void sleep(){
		System.out.println("�������� �Ϲ������� 7�ð��� �ܴ�.");
	}
	public void showSleepStyle(){
		System.out.println("�����ε��� �Ͽ� �i�� ������ �����ϴ�.");
	}
}
