import java.util.StringTokenizer;
public class StringTokenizer1{
	public static void main(String args[]){
		String source1 = "111-111 / ������ / ��õ�� / 2726�δ� / 2�ߴ�";
		StringTokenizer st1 = new StringTokenizer(source1, "/");
		String zip = st1.nextToken();
		String dow = st1.nextToken();
		String si = st1.nextToken();
		String budae = st1.nextToken();
		
		System.out.println(zip);
		System.out.println(dow);
		System.out.println(si);
	}
	
}