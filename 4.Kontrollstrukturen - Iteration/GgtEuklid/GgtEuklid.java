
public class GgtEuklid {
	public static int ggtMethod(int x, int y, int z) {
						
		while(z!=0) {
			z=x%y;
			x=y;
			y=z;		
		}					
		return x;
	}
}
