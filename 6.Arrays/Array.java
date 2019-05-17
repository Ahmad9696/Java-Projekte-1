public class Array {
	public static void main(String args[]) {
	
		int [] array;
		
		array=new int[100];
		
		for(int element: array)
		System.out.print(element+" ");
		System.out.println();		
		
		for(int i=0;i<array.length;i++)
			array[i]=i+1;
		
		for(int elemnet: array)
			System.out.print(elemnet+" ");	
	}	
}
