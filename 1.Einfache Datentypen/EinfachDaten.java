public class EinfachDaten {
	public static int i;
	public static long l;
	public static short s;
	public static char c; 
	public static byte b;
	public static void main(String args[]) {
		
		i= 252525255;
		l= 255555555;
		
		int m=15;
		
		System.out.println("Der Wert von int i "+i+"\n");
			
		//das führt zum Überlauf
		b=(byte)(Byte.MAX_VALUE+1);	
			
		System.out.println(b);	
				
	}

}
