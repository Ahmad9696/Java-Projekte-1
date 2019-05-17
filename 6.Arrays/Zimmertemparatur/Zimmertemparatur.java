import java.util.Scanner;
public class Zimmertemparatur {
	
	public static void arrayeinlesen(int[]zaher) 
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<zaher.length;i++)
		{		
			System.out.println("Bitte geben Sie eine Temparatur?");
			zaher[i]=sc.nextInt();
			
			while((zaher[i]<15 || zaher[i]>30) && zaher[i]>0) 
			{			
				System.out.println("Bitte geben Sie die Temparatur wieder?, es ist ungültige Grad");
				zaher[i]=sc.nextInt();				
			}
			if(zaher[i]<0)
				i=zaher.length;
		}	
	}
	
	public static void arrayausgeben(int[]zaher) 
	{	
		System.out.print("Die gültige Temparaturen sind: ");
		
		for(int e:zaher)
		{
			if(e>0)
			System.out.print(e+" ");
		}
	}
}
