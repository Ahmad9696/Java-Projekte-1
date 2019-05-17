package zufallfakul;
import java.util.Random;
public class Zufallfakul {

	public static void main(String[] args) {
		
		Random zufallzahl=new Random();
		
		int x,sum=1;
		
		x=zufallzahl.nextInt(10);
		
		sum=fakul(x,sum);	
		System.out.println(sum);
	}
	
	public static int fakul(int x,int sum) {
		
		sum=sum*x--;
		
		if(x!=1)
			return fakul(x,sum);
		
		return sum;
	}
}
