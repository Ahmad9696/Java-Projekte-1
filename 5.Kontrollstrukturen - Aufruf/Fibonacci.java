
public class Fibonacci {

	public static void main(String[] args) {
		
		int x=0,y=1,sum=0;
		
		while(sum<100) {
			sum=x+y;
			x=y;
			y=sum;
			
			System.out.print(sum+" ");		
		}
	}

}
