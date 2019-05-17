import java.util.Scanner;

public class Testtreiber {
	
	// Methode fürs Einlesen der elementen des Arrays
	public static String[][] nameeinlesen(String Name[][]) {
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<Name.length;i++) {
			for(int j=0;j<Name[i].length;j++) {			
				
				if(j==0) {
					System.out.println("Bitte geben Sie einen Vorname?");
					Name[i][j]=sc.nextLine();
				}				
				else {
					System.out.println("Bitte geben Sie dazu einen Nachname?");
					Name[i][j]=sc.nextLine();
				}
			}
		}
		return Name;
	}
	
	// Methode fürs Ausgabe des Arrays
	public static void namenausgeben(String Name[][]) {
		int c=1;
		
		for(int i=0;i<Name.length;i++) {
			System.out.print("\n"+c+++".");
			for(int j=0;j<Name[i].length;j++) {
				System.out.print(Name[i][j]+" ");
			}	
		}		
	}	
}
