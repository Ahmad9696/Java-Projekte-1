import java.util.Scanner;
public class Ziffersumme {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x,y,sum=0;
		
		System.out.println("Bitte geben Sie eine Positive Zahl ein?");
		x=sc.nextInt();
		y=x;
		
		sum=summe(x,y,sum);
		
		System.out.println("\nDie Summe von der gewünschter Zahl ist: "+sum);	
	}
	public static int summe(int x,int y,int sum) {
		
		System.out.println("\nDie gewünschte Zahl ist: "+x);
		
		while(y!=0) {						
			
			x=y%10;
			
			sum+=x;
			
			y=y/10;
		}
				
		return sum;
	}
}
