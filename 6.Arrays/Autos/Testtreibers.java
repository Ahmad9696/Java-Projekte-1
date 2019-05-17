import java.util.Scanner;
public class Testtreibers {
	
	public static int[] einlesen(int []num) {
	
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<num.length;i++) {
				
		num[i]=sc.nextInt();
		
		if(num[i]<1 || num[i]>300)
		i=num.length;
	}		
	return num;
	}
	public static void ausgeben(int []num2) {
		
		for(int i=0;i<num2.length;i++) {
			
			if(num2[i]>=1 && num2[i]<=300 )
				System.out.print(num2[i]+" ");				
		}
	}
}
