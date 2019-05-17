
public class TicTacToe {

	public static void main(String[] args) {
		
		char[][] tictac= {{'X','X','O'},{'O','X','X'},{'O','X','O'}};
		
		for(int i=0;i<tictac.length;i++) {
			for(int j=0;j<tictac[i].length;j++)
			{
				System.out.print(tictac[i][j]+" ");			
			}
		System.out.println();
		}
		char gewinner=gewinner(tictac);
		System.out.println("Der Gewinner ist "+gewinner);
	}
	
	public static char gewinner(char[][]tictac) {
			
		char gewinner=' ';
		
		// Überprüfung der Zeile
		for(int i=0;i<tictac.length;i++) {
			for(int j=0,cx=0,co=0;j<tictac[i].length;j++)
			{
				if(tictac[i][j]=='X')
					cx++;
				else 
					co++;
				
				if(cx==3) 
				{
					gewinner='X';
					j=tictac[i].length-1;
					i=tictac.length-1;
				}
				if(co==3) 
				{
					gewinner='O';
					j=tictac[i].length-1;
					i=tictac.length-1;
				}
			}
			}
			
		if(gewinner==' ')
		{
		// Überprüfung der Spalten	
		for(int i=0;i<tictac.length;i++) {
			for(int j=0,cx=0,co=0;j<tictac[i].length;j++)
			{
				if(tictac[j][i]=='X')
					cx++;
				else 
					co++;
				
				if(cx==3) 
				{
					gewinner='X';
					j=tictac[i].length-1;
					i=tictac.length-1;
				}
				if(co==3) 
				{
					gewinner='O';
					j=tictac[i].length-1;
					i=tictac.length-1;
				}
			}
			}	
		}	
		return gewinner;
	}	
}
