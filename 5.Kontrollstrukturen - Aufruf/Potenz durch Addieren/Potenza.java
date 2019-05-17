import java.util.Scanner;
public class Potenza {
	public static void main(String args[]) {
		
	Scanner sc=new Scanner(System.in);
	int b,p;
	
	System.out.println("Bitte geben Sie die Basis ein?");
	b=sc.nextInt();
	
	System.out.println("Bitte geben Sie die Potenz ein?");
	p=sc.nextInt();
	
	System.out.println("Das Ergebnis lautet: "+potenz(b,p));
		
	}

	public static int multiplikation(int x,int y) {
		int ergebnis=0;
		for(int i=1;y>=i;i++) {
		ergebnis +=x;
		}
		return ergebnis;
	}
	public static int potenz(int b, int p) {
		int ergebnis=b;
		for(int i=1;p>i;i++)
		{		
		ergebnis=multiplikation(b,ergebnis);													
		}
		return ergebnis;
	}
}
