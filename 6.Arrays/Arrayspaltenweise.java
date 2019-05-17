
public class Arrayspaltenweise {

	public static void main(String[] args) {
		int array[][]=new int[10][10];
		
		
		int c=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j]=c++;				
			}
		}		
		arrayausgeben(array);			
	}
	public static void arrayausgeben(int array[][]) {
				
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
			System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}	
		
		for(int[] element: array) {
			System.out.println();
			for(int element2: element)
				System.out.print(element2 + " ");
		}
	}
	
}
