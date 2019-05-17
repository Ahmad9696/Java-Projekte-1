import java.util.Random;
import java.util.Arrays;
public class ArrayMethoden {

	public static void main(String[] args) {
		
		int[] array=new int[100];
		
		arrayAusgabe(array);
		System.out.println();
		
		zufallszahl(array);		
		arrayAusgabe(array);
		System.out.println();
		
		Arrays.sort(array);
		arrayAusgabe(array);
		System.out.println();
		
		gerade(array);
	}
	
	// Methode zum Ausgeben des Arrays 
	public static void arrayAusgabe(int array[]) {
		for(int element: array)
			System.out.print(" "+element);	
	}
	
	// Methode zum Zufallwerte Angeben fürs Array 
	public static void zufallszahl(int array[])
	{
		Random zufallsgenerator = new Random();
		
		for(int i=0;i<array.length;i++)
		{
		array[i]=zufallsgenerator.nextInt(100);										
		}
	}
	
	// Methode fürs Sortieren der gerade und ungerade Zahlen
	public static void gerade(int array[]) {
		int c=0;
		while(c<2) {
			if(c==0)
				System.out.println("Die gerade Zahlen sind:");
			else
				System.out.println("\nDie ungerade Zahlen sind:");
	
		for(int i=0;i<array.length;i++)
		{			
			if(array[i]%2==0 && c==0)
				System.out.print(array[i]+" ");	
			if(array[i]%2!=0 && c==1) 
				System.out.print(array[i]+" ");
		}		
			c++;
		}	
	}
}
