import java.util.Scanner;
public class Menssaessen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		final String Angebot1="Burger";
		final String Angebot2="Pommes";
		final String Angebot3="Fisch";
		final String Angebot4="Pizza";
		
		int x;		
		System.out.println("Bitte geben Sie die Anzhal des Angebot");
		x=sc.nextInt();
		
		if(x>0 && x<5)
		
		switch(x){
			
		case 1: System.out.println(Angebot1);
			break;
		case 2: System.out.println(Angebot2);
			break;
		case 3:	System.out.println(Angebot3);
			break;
		case 4:	System.out.println(Angebot4);
			break;
		}	
		else 
			System.out.println("Essensangebot-Nr "+x+" gibt es leider in der Mensa nicht.");
		
		
		
		
	}

}
