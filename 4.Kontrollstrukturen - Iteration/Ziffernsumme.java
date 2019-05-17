import java.util.Scanner;
public class Ziffernsumme {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		int x,c,sum=0; // c ist Counter
		
		System.out.println("Geben Sie bitte einen Positiven Wert");		
		x=sc.nextInt();
		
		c=x;
		
		while(c!=0) {
						
			x=c%10;
			
			sum+=x;
			
			c=c/10;
		}		
		
		System.out.println("\nDie Summe von der gewünschter Zahl ist: "+sum);		
	}
}
