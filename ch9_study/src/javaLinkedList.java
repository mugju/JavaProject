import java.util.LinkedList;
public class javaLinkedList{
	public static void main(String args[]) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("�׷���");
		ll.add("K5");
		ll.add("�ƹݶ�");
		ll.add("����");
		ll.add("�׷���");
		ll.add(2,"K9");
		ll.set(3,"K");
		
		for(int i =0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
	}
}