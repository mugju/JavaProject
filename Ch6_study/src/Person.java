public class Person{
	private int age;
	private String name;
	private String addr;
	int x =10;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void sleep(){
		System.out.println("����� ���� 10�ð� �ܴ�");
	}
	
	public void showSleepStyle(){
		System.out.println("������� ���� ��Ÿ���� �پ��ϴ�.");
	}
}