class Student4{
	String name;
	int number;
	public Student4(String name, int number){
		super();
		this.name = name;
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student4 st = null;
		
		if(obj instanceof Student4){
			st = (Student4)obj;
		}
		return (st != null && st.name.equals(name) && st.number == number);
		
	}
	
	
}

public class equalTest{
	public static void main(String args[]){
		Student4 st1 = new Student4("������",1);
		Student4 st2 = new Student4("������",1);
		
		System.out.println("�������̵��� equal�޼ҵ�");
		System.out.println(st1.equals(st2));
	}
}