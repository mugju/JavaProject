public class MemberVO{
	private int age;
	private String name;
	private String tel;
	private String email;
	private String nation;
	
	public MemberVO(int age, String name, String tel, String email, String nation){
		super();
		this.age = age;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.nation = nation;
	}
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	
}