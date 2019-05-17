import java.util.Random;

public class ArrayMethoden {
	
	public static int[] arrayinstall(int[]array) {
		Random zufallzahl=new Random();
		
		for(int i=0;i<array.length;i++)
			array[i]=zufallzahl.nextInt(100);
				
		return array;
	}
	
	public static void arrayausgeben(int[]array) {
		
		for(int e: array)
			System.out.print(e+" ");	
	}

}
