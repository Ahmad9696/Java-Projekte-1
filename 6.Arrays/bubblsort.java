import java.util.Scanner;
public class bubblsort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int x;
		int []array;
		
		System.out.println("Geben Sie bitte die lange des Arrays BZW die Anzahl der Zahlen");
		x=sc.nextInt();
		
		array=new int[x];
		
		for(int i=0;i<array.length;i++) 
		{
			System.out.println("Bitte geben Sie einen Wert ein?");
			array[i]=sc.nextInt();			
		}
		
		array=buble(array);
		arrayausgeben(array);

	}	
	public static int[] buble(int array[]) {
		
		int tempo=0;
		
		for(int i=1;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j]>array[j+1])
				{
				tempo=array[j];
				array[j]=array[j+1];
				array[j+1]=tempo;	
				}
			}	
		}	
		return array;
	}
	public static void arrayausgeben(int array[]) {
		
		for(int i=0; i<array.length;i++)
			System.out.print(array[i]+" ");
		
	}
}
