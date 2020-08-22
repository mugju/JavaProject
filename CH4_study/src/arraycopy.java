public class arraycopy{
	public static void main(String args[]){
		
		int arr[] = {1,2,3,4,5,6};
		
		int arr_2[] = {1,2,3,4,5,6,6,7};
		
		int arr_3[] = new int[arr.length + arr_2.length];
		
		
		System.arraycopy(arr, 0, arr_3, 0, arr.length);
		System.arraycopy(arr_2, 0, arr_3, arr.length, arr_2.length);
		
		for(int ki : arr_3){
			System.out.println(ki);
		}
	}
}
