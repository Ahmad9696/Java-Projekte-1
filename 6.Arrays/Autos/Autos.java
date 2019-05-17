public class Autos {

	public static void main(String[] args) {
	
	int []gwerte= new int[5];
	
	System.out.println("Bitte geben Sie zehn Geschwindigkeiten von Autos");
	gwerte=Testtreibers.einlesen(gwerte);
	
	Testtreibers.ausgeben(gwerte);
	}

}
