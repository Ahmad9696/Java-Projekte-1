import java.util.Arrays;

public class Testreiber {
	public static void main(String[] args) {
		
		int[] array;
		
		array=new int[100];
		
		Array1.arrayausgeben(array);
		System.out.println();
		
		Array1.arrayinstall(array);
		System.out.println();
		
		Array1.arrayausgeben(array);
		System.out.println();
		
		Arrays.sort(array);
		Array1.arrayausgeben(array);
		
	}
}
