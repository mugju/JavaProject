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
		System.out.println("������� ����Ѱ��");
		System.out.println(st1.school);
		
		if(st1.school == SchoolType.Elementary){
			System.out.println("����� �ʵ��л��Դϴ�");
		}
	}
}