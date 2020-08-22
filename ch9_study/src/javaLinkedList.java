import java.util.LinkedList;
public class javaLinkedList{
	public static void main(String args[]) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("그랜져");
		ll.add("K5");
		ll.add("아반떼");
		ll.add("에쿠스");
		ll.add("그랜져");
		ll.add(2,"K9");
		ll.set(3,"K");
		
		for(int i =0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
	}
}