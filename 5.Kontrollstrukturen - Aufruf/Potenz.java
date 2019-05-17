import java.util.Scanner;
public class Potenz {
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);	
	int b, p, ergebnis;
	
	System.out.println("::::::::::::Programm für die Potenzrechnung:::::::::");
		
	System.out.println("\nGeben Sie bitte der Basic ein?");	
	b = sc.nextInt();	

	System.out.println("Geben Sie bitte der Potenz?");	
	p = sc.nextInt();
	
	ergebnis =Potenz.berechnepotenz(b, p);
	
	System.out.println("Das Ergebnis lautet: "+ergebnis);
		
	}
	
	public static int berechnepotenz(int b,int p) {
		
		int ergebnis=1;
		
		for(int i=1;i<=p;i++)
		ergebnis*=b;	
			
		return ergebnis;
	}
}
