public class Student extends Person{
	private String schoolkid;
	private String grade;
	
	public String getSchoolkid() {
		return schoolkid;
	}
	public void setSchoolkid(String schoolkid) {
		this.schoolkid = schoolkid;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void showSleepStyle(){
		System.out.println("�л����� ���� ��Ÿ���� ��Ģ���̴�.");
	}
}