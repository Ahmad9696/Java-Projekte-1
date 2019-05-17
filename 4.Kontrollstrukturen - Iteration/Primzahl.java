import java.util.Scanner;
public class Primzahl {

	public static void main(String[] args) {
				
		int x;
		
		System.out.println("Bitte geben Sie eine positive ganzzahlige Zahl ein?");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		sc.close();
		
		if(x>0) 
		{
			while(x%2==0 || x%3==0 || x%5==0 || x%7==0) {
				x++;		
			}
			System.out.println(x);			
		}
		else 
			System.out.println("Sie haben leider eine negative Zahl eingegeben.");		
	}
	
}
