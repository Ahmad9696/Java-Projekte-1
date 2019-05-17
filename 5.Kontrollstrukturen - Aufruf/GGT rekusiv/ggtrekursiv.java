import java.util.Scanner;
public class ggtrekursiv {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Bitte geben Sie zwei Zahlen?");
		int x= sc.nextInt();
		int y=sc.nextInt();
		x=ggt(x,y);
		System.out.println(x);
	}
	public static int ggt(int x,int y) {
			
		if(x>y)
			x=x-y;
		else
			y=y-x;
		
		if(x!=y) 
			return ggt(x,y);
			
		return x;
	}
}
