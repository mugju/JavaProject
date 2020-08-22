class Student {
	SchoolType school;

	public Student(SchoolType school) {
		this.school = school;
	}
}

enum SchoolType {
	Elementary, Middle, High, Collage
}

public class enumTest {
	public static void main(String args[]) {
		Student st1 = new Student(SchoolType.Elementary);
		System.out.println("상수값을 출력한경우");
		System.out.println(st1.school);
		
		if(st1.school == SchoolType.Elementary){
			System.out.println("당신은 초등학생입니다");
		}
	}
}