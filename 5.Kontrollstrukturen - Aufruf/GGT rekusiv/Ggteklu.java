
public class Ggteklu {

	public static void main(String[] args) {
		
		int x= -1; int y=24; int z=x;
		x=ggteklreku(x,y,z);
		
		if(x==z)
			System.out.println("0");
		else
		System.out.println(x);
			
	}
	public static int ggteklreku(int x, int y, int z) {
		
		if(x>0 && y>0)
		{
		z=x%y;
		x=y;
		y=z;
		if(z!=0)
			return ggteklreku(x,y,z);
		}
		return x;
		
	}
}
