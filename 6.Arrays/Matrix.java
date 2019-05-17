public class Matrix {

	public static void main(String[] args) {
			char [] [] matrix = 
			{
					{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
			    	{' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' '},
					{' ',' ',' ',' ','X','X','X',' ',' ',' ',' '},
					{' ',' ',' ','X','X','X','X','X',' ',' ',' '},
					{' ',' ','X','X','X','X','X','X','X',' ',' '},
					{' ','X','X','X','X','X','X','X','X','X',' '},
					{'X','X','X','X','X','X','X','X','X','X','X'},
					{' ','X','X','X','X','X','X','X','X','X',' '},
					{' ',' ','X','X','X','X','X','X','X',' ',' '},
					{' ',' ',' ','X','X','X','X','X',' ',' ',' '},
					{' ',' ',' ',' ','X','X','X',' ',' ',' ',' '},
					{' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' '},
					{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}
			};
		
			char [][] matrix2= new char[13][11];
		
			matrixwechsel(matrix,matrix2);
			
			System.out.println("Das orginale Muster");
			arrayausgeben(matrix);
			
			System.out.println("Das copiede Muster\n");
			arrayausgeben(matrix2);
		}
		
		// Methode für Wechsel der Form des Arrays 
		public static void matrixwechsel(char[][]matrix,char matrix2[][]) {
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				if(matrix[i][j]=='X')
					matrix2[i][j]=' ';		
				else 
					matrix2[i][j]='X';			
			}
		}				
	}
	
		// Mehtode fürs Ausgeben des Arrays
		public static void arrayausgeben(char array[][]){

			
			for(int i=0;i<array.length;i++) {
				for(int j=0;j<array[i].length;j++) {
					System.out.print(array[i][j]);					
				}
				System.out.println();
			}
		}
		

		
}	

