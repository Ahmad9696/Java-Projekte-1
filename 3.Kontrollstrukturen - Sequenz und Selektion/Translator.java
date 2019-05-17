import java.util.Scanner;
public class Translator {

	public static void main(String[] args) {
				
		int hundreds,tens,bone,units;
		String temptext="",text="";
		
		System.out.println("Geben Sie eine ganzzahlige Zhal zwischen 999 und -999 ein");	
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		sc.close();
		
		if(x<=999 && x>=-999) {
			
			if(x==0) {
			System.out.println("null");
			}
			else {
				
			if(x<0) {
			x*=-1; text+="minus ";
			}	
			
			// Auflösung der Zahl in drei Teile
			hundreds= x/100;  tens=(x-hundreds*100)/10; units= x-((hundreds*100)+(tens*10));
			
			// Vier Bedingungen für die Konvertierung jeder einzelen Zahl.
			
			if(hundreds>0)
			{
				temptext=convertnum13text(hundreds,temptext);			
				text+=temptext+" hundred ";
			}
			if(tens!=1 && tens!=0) 
			{	
				temptext=converttens(tens,temptext);
				
				if(hundreds>0) {text+="and "+temptext;}
				else {text+=temptext;}
			}
			if(tens==1)
			{
				bone=10+units;
				temptext=converttens(bone,temptext);
				
				if(hundreds>0) {text+="and "+temptext;}
				else {text+=temptext;}
			}
			if(units>0 && tens!=1)
			{
				temptext=convertnum13text(units,temptext);
				
				if(tens>0) {text+="-"+temptext;}
				else if(hundreds>0 && tens==0) {text+="and "+temptext;}
				else {text+=temptext;}
			}
			System.out.println(text);
		}
		}
		else {System.out.println("Sie haben leider eine Zahl außer dem Umfang eingegeben.");}
	}

	// Methode für die Konvertierung der "Units" und "Hundreds" 
	public static String convertnum13text(int zahl,String a1) {
		
		 switch(zahl) {
		 
		 case 1: a1= "one";
			 break;		 
		 case 2: a1="two";
			 break;
		 case 3: a1="three";
			 break;
		 case 4: a1="four";
			 break;
		 case 5: a1="five";
			 break;
		 case 6: a1="six";
			 break;
		 case 7: a1="seven";
			 break;
		 case 8: a1="eigth";
			 break;
		 case 9: a1="nine";
			 break;
		 }
		 return a1;
	}
	
	// Methode für die Konvertierung der "Tens"
	public static String converttens(int zahl,String b1) {
		
		 if(zahl>=2 && zahl<=9) {
		 switch(zahl) {		 
		 case 2: b1="twenty";
			 break;
		 case 3: b1="thirty";
			 break;
		 case 4: b1="forty";
			 break;
		 case 5: b1="fifty";
			 break;
		 case 6: b1="sixty";
			 break;
		 case 7: b1="seventy";
			 break;
		 case 8: b1="eighty";
			 break;
		 case 9: b1="ninety";
			 break;
		 }		 
		 }
		 else {			 
			 switch(zahl) {
			 case 10: b1="ten";
			 break;
			 case 11: b1= "eleven";
				 break;		 
			 case 12: b1="twelve";
				 break;
			 case 13: b1="thirteen";
				 break;
			 case 14: b1="fourteen";
				 break;
			 case 15: b1="fifteen";
				 break;
			 case 16: b1="sixteen";
				 break;
			 case 17: b1="seventeen";
				 break;
			 case 18: b1="eighteen";
				 break;
			 case 19: b1="nineteen";
				 break;
			 }				 
		 } 
		 return b1;
	}		
}
