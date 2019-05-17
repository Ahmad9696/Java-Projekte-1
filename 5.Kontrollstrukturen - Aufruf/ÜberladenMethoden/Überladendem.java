public class Überladendem {
public static void main(String args[]){
		
		double zahl1=3.5, zahl2=5.3, max;
		
		char c1='s', c2='m', maxc;
		
		 System.out.println("Programm für die Überprüfung der Großer Zahl");
		
		 max=Maximum.max(zahl1, zahl2);
		 System.out.println("Maximumberechnung :"+max);
		 
		 maxc=Maximum.max(c1, c2);
		 System.out.println("Maximumberechnung von char:"+maxc);
	}
}
