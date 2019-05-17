import java.util.Scanner;
public class ArrayfürNamen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x;
	
		System.out.println(":::::Datenbank::::::\n\nBitte geben Sie die Anzhal der Namen ein?");
		x=sc.nextInt();	
		
		String [][] Name=new String[x][2];	
		
		Name=Testtreiber.nameeinlesen(Name);
		
		Testtreiber.namenausgeben(Name);
	}
}