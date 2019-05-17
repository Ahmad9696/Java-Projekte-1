
public class ArraymitZahlen {

	public static void main(String[] args) {
		
		int [][] matrix=new int[3][4];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++)
			{
				if(i==0)
				matrix[i][j]=j+1;
				if(i==1)
				matrix[i][j]=2*(j+1);
				if(i==2)
				matrix[i][j]=2*(2*(j+1));	
			}
		}	
		arrayAusgabe(matrix);
		System.out.println();
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0,jj=3;j<matrix[i].length;j++,jj--)
			{				
				if(i==0)
				matrix[i][j]=2*(2*(jj+1));
				if(i==1)
				matrix[i][j]=2*(jj+1);
				if(i==2)
				matrix[i][j]=jj+1;					
			}
		}	
		arrayAusgabe(matrix);	
		
	}
	
	public static void arrayAusgabe(int[][]matrix) {
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++)
			{
			System.out.print(matrix[i][j]+" ");	
			}
			System.out.println();
		}	
	}

}
