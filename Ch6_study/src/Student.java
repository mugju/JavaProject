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
		System.out.println("학생들의 수면 스타일은 규칙적이다.");
	}
}