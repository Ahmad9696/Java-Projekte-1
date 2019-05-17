import java.util.Scanner;
public class GgtTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int x,y,z=1;
		
		System.out.println("Bitte geben Sie eine ganzzahlige ein?");
		x=sc.nextInt();
		
		System.out.println("Bitte geben Sie eine zweite ganzzahlige ein?");
		y=sc.nextInt();
				
		if (x>0 && y>0)
		{	
		x=Ggteuklid.ggtMethod(x,y,z);	
		System.out.println("Das GGT ist: "+x);
		}
		else 
			System.out.println("0");
	}

}
