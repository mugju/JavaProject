public class multi_array{
	
	public static void main(String args[]){
		int multiarray[][] = new int [3][2];
		
		char c  = 'A';
		for(int i =0; i<multiarray.length;i++){
			for(int j=0; j<multiarray[i].length;j++){
				multiarray[i][j] = c++;
			}
		}
		
		for(int i =0; i<multiarray.length;i++){
			for(int j=0; j<multiarray[i].length;j++){
				System.out.println((char)multiarray[i][j]);
			}
		}
	}
}