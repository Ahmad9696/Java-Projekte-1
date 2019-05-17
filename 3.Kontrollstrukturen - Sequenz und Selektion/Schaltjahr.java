import java.util.Scanner;
public class Schaltjahr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Bitte geben Sie die Anzahl des Jahres Tages");
		 
		x=sc.nextInt();
		
		sc.close();
		
		if(x>0) {
		
		//alle Vielfachen von 400 Schaltjahre	
		if(x%400==0)
			System.out.print("Das Jahr "+ x +" ist ein Schaltjahr");
		
		//Ein Schaltjahr ist durch 4 teilbar, aber nicht durch 100
		else if(x%4==0 && x%100!=0)
			System.out.print("Das Jahr "+ x +" ist ein Schaltjahr");
		else 
			System.out.println("Es ist kein Scahltjahr");
		}	
		else 
			System.out.println("Sie haben eine negative Zahl eingegeben");
	}
}
