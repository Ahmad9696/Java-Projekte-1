
public class Stupriv {

	public static void main(String[] args) {
		
		Studentpriv eins=new Studentpriv("Mollham",24,3,0);
		
//		eins.name="Mollham";
//		eins.alter=24;
//		eins.semster=3;
//		eins.laune=0;
						
		Studentpriv zwei=new Studentpriv ("Ahmad",22,1,0);
			
		eins.schwimmen();
		eins.schach();
		eins.counterStrik();
		
		zwei.schach();
		zwei.schwimmen();		
		zwei.counterStrik();
		
		System.out.printf("Der erste Student ist %s \nalter %s\nim %s Semester \nLaune %s",eins.getName(),eins.getAlter(),eins.getSemster(), eins.getLaune());
		
		System.out.printf("\n\nDer zweite Student ist %s \nalter %s \nim %s Semester\nLaune %s",zwei.getName(),zwei.getAlter(),zwei.getSemster(),zwei.getLaune());
			
}
}