class Args{
	
	int x;
	void add(int x){
		x += 50;
	}
	
	void add(Args arg){
		arg.x = arg.x + 40;
	}
	
	void addNew(Args arg){
		arg = new Args();
	}
	
	void add(int[] arr){
		arr[0]++;
	}
}

public class ArgsTest{
	
	public static void main(){
		
		Args arg = new Args();
		arg.x = 100;
		
		int arr[] = new int[1]; //1ĭ¥�� �迭��ü ������ذ�

		arg.add(arg.x);
		System.out.println("arg.x = " + arg.x);
		
		arg.add(arg);
		System.out.println("arg.x = " + arg.x);
		
		arg.addNew(arg);
		System.out.println("arg.x = " + arg.x);
		
		arg.add(arr);
		System.out.println("arr[0] = " + arr[0]);
		
	}
	
}