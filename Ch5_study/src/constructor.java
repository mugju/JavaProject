class Person{
	int age;
	String name;
	int height;
	int weight;
	public Person(){
		
	}
	public Person(int age){
		this.age = age;
	}
	public Person(String name){
		this.name = name;
	}
}




public class constructor{
	public static void main(String args[]){
		Person person1 = new Person();
		Person person2 = new Person(30);
		Person person3 = new Person("source");
		
		
		System.out.println(person1.age + person1.height + person1.name + person1.weight);
		System.out.println(person2.age + person2.height + person2.name + person2.weight);
		System.out.println(person3.age + person3.height + person3.name + person3.weight);
	}

}