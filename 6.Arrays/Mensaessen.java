import java.util.Scanner;
public class Mensaessen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		String array[]={"Angebot 1\nSpaghetti Aglio Oilo mit Tomaten-Gemüsesugo",
						"Angebot 2\nKönigsberger Klopse mit Möhrensalat und Salzkartoffeln oder Langkornreis",
						"Angebot 3\\nFangfrisches Seelachsfilet mit Orangen-Pfeffersauce und Fenchel-Tomaten-Gemüse, dazu Mandelkartoffeln oder bunte Farfalle",
						"Angebot 4\\nFrühlingsrolle auf asiatischem Gemüse mit scharfem Kokosreis"};
		
		System.out.println("::::Mensa Brandenburg an der Havel::::\n\nBitte geben Sie die Angebotsnummer ein?");
		x=sc.nextInt();
		sc.close();
		
		if(x>=1 && x<=4) {
			 x--;
			System.out.println(array[x]);
			}
		else
			System.out.println("Essensangebot-Nr."+x+" gibt es leider in der Mensa nicht.");		
	}

}
