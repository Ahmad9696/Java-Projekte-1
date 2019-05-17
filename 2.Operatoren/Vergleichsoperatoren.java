import java.util.Scanner;

public class Vergleichsoperatoren {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Tragen Sie ein Wert von INt ein: ");
	int x=sc.nextInt();
	System.out.print("\nTragen Sie ein Wert von Double ein: ");
	double y=sc.nextDouble();
	
	double d;
	if(x>y) {
		d = x;
	}
	else {
		d = y;
	}	
	System.out.println(d);
	}
}
