public class square_array{
	
	public static void main(String args[]){
		
		int arr[][] = new int[5][5];
		
		for(int i=0; i<arr.length;i++){
			for(int j =0; j<arr[i].length;j++){
				if(i == 0 ||i == 4 ||j==0|| j == 4)
					arr[i][j] = 1;
			}
		}
		
		
		for(int i=0; i<arr.length;i++){
			System.out.println();
			for(int j =0; j<arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
		}
	}
}