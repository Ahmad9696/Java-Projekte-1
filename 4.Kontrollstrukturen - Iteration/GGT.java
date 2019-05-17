package ggt;
import java.util.Scanner;
public class GGT {
	public static void main(String args[]) {
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println(".......Program für die Rechnung der GGT........");
		int x,y;		
		
		System.out.println("\nGeben Sie einen postiven Wert.");
		x=sc.nextInt();
		
		System.out.println("Geben Sie einen anderen postiven Wert.");
		y=sc.nextInt();
		
		if(x>0 && y>0)
		{
		while(x!=y)
		{
		 if(x>y) 
		 {
			 x=x-y;
		 }
		 else {
			 y=y-x;
		 }
		}
		
		System.out.println("\nDer GGT ist: "+x);
		}
		else {System.out.println("Sie haben leider eine nigative Zahl eingegeben.");}
				
	}	
}
