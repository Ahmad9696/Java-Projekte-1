
public class Testtreiber {

	public static void main(String[] args) {
		
		boolean b;
		String uhrZeit;
		long sekunden;
		
		Zeit1 meinezeit=new Zeit1(11,11,11);
		
		b=meinezeit.setZeit(11,11,11);
		System.out.println(b);
		
		uhrZeit=meinezeit.toString();
		System.out.println(uhrZeit);
		
		sekunden=meinezeit.inSekunden();
		System.out.println(sekunden);
		
		System.out.println(meinezeit.getStunde());
		
	}

}
