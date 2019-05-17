import java.util.Scanner;
public class Uberlauf {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int x,y;
		
		System.out.println("Bitte geben Sie eine ganzzahlige Zahl?");
		x=sc.nextInt();
		
		System.out.println("Bitte geben Sie eine ganzzahlige Zahl?");
		y=sc.nextInt();
			
		if(x>0 && x<=2147483647 && y>0 && y<=2147483647) {
			x=x+y;
				if(x>0 && x<=2147483647)
					System.out.println(x);
		}	
			else
				System.out.println("es wurde eine nigative Zahl eingegeben oder einen Überlauf aufgetroffen.");
	}
}
