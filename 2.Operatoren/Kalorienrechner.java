import java.util.Scanner;
public class Kalorienrechner {

	public static void main(String[] args) {
	
	System.out.println("Programm für die Kalorien berechnen!!");
	Scanner sc= new Scanner(System.in);	
		
	double milch, trauben, pommes, gesamtkalorien=0;
	
	double milchk=535;
	double traubenk=69; 
	double pommesk=291;
	
	System.out.println("\nGeben Sie bitte die Kaloriensmenge von Milch in Gramm ein.");	
	milch=sc.nextInt();
	
	System.out.println("\nGeben Sie bitte die Kaloriensmenge von trauben in Gramm ein.");
	trauben=sc.nextInt();
	
	System.out.println("\nGeben Sie bitte die Kaloriensmenge von pommes in Gramm ein.");
	pommes=sc.nextInt();
	
	if(milch>=0 && milch<1000 && trauben>=0 && trauben<1000 && pommes>=0 && pommes<1000) {
		
		milch=(milch/milchk)*100;
		
		trauben=(trauben/traubenk)*100;
		
		pommes=(pommes/pommesk)*100;
		
		gesamtkalorien= milch+trauben+pommes;
		
		gesamtkalorien= (double)Math.round(gesamtkalorien*100)/100;
		
		System.out.println("Die Gesamtkalorien der eingegebene Produkte ist: "+gesamtkalorien);		
	}
	
	else {
		System.out.println("Sie haben leider entweder eine negative Zahl oder eine Zahl, die großer als 1000 eingegeben.");				
	}	
	
	}
}
