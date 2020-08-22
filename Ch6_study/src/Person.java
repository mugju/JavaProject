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
		System.out.println("사람은 보통 10시간 잔다");
	}
	
	public void showSleepStyle(){
		System.out.println("사람들의 수면 스타일은 다양하다.");
	}
}