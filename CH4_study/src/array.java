public class array{
	public static void main(String args[]){
		
		
		//�迭����
		int ages[];
		String names[];
		
		//�迭 ��ü ����
		ages = new int[3];
		names = new String[3];
		
		//�ʱ�ȭ 
		ages[0] = 0;
		ages[1] = 1;
		ages[2] = 2;
		
		names[0] = "ȫ�浿";
		names[1] = "������";
		names[2] = "���콺";
		
		for(int i = 0; i<3 ; i++){
			
			System.out.println(ages[i]);
			System.out.println(names[i]);
		}
	}
}