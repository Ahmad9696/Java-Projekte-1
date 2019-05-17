import java.lang.Math;
import java.util.Scanner;
public class Taschenrechner{
	 
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		float bruttoKiloPreis,gewicht,MWST_SATZ,brutto,netto,Mwst;
		int gratisbananen=0;
		
		System.out.println("Tragen Sie den Brutto-Kilopreis von Bananen in Cent ein");
		
		bruttoKiloPreis= sc.nextFloat();
		
		System.out.println("Tragen Sie das Gewicht einer Menge von Bananen in Gramm ein");
		
		gewicht= sc.nextFloat();
		
		System.out.println("Tragen Sie den Mehrwertsteuersatz in Prozent ein");
		
		MWST_SATZ= sc.nextFloat();
		
		if(bruttoKiloPreis>0 && gewicht>0 && MWST_SATZ>0) {
		
		//Berechnungen
 		
		brutto=bruttoKiloPreis/100 *gewicht/1000.0f;
		
		// brutto = netto + netto * mwst
		// brutto = netto(1+mwst);

		netto= brutto/(1+MWST_SATZ/100);
		
		Mwst=brutto-netto;
		
		//Umrechnungen
		
		brutto=(float) Math.round(brutto*100)/100;
		netto=(float) Math.round(netto * 100)/100;
		Mwst=(float) Math.round(Mwst * 100)/100;
		
		//Gratis Bannane rechnen
		if(brutto>10) 
		{
			gratisbananen=(int)brutto/5 -2;	// ab 10 Euro wird für jede 5 Euro eine Bananne extra		
		}
			
		System.out.println("brutto:"+ brutto +" Euro "+" netto:"+ netto+" Euro "+" Mwst:"+Mwst+" Euro "+"Gratis-Bananen: "+gratisbananen);	
		}		
		else {
			System.out.println("Sie haben leider ein negative Zahl eingegeben.");			
		}
	}
	
}