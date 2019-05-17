import java.util.Scanner;

public class Testtreiber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int x;
		
		System.out.println("Bitte geben Sie die Anzahl der Zimmertemparatur");
		x=sc.nextInt();
		
		int[] zaher=new int[x];
		
		Zimmertemparatur.arrayeinlesen(zaher);
		
		Zimmertemparatur.arrayausgeben(zaher);
		
	}

}
