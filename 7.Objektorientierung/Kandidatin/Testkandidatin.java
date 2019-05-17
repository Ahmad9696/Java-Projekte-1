
public class Testkandidatin {

	public static void main(String[] args) {
		
		Kandidatin[] array=new Kandidatin[3];
		
		array[0]=new Kandidatin("Cindy",1.80f,61.5f);
		array[1]=new Kandidatin("Claudia",1.79f,57.0f);
		array[2]=new Kandidatin("Chantal",1.85f,70.2f);
				
		for(int i=0;i<array.length;i++)
		{				
			array[i].berechneEinladen();
			if(array[i].getEinladen()==true)
					System.out.println(array[i].getName()+" wird eingeladen");
			else 
				System.out.println(array[i].getName()+" wird nicht eingeladen");
		}
//		System.out.print(array[0].getName()+" ");
//		array[0].berechneEinladen();
//		
//		System.out.print("\n"+array[1].getName()+" ");
//		array[1].berechneEinladen();
//		
//		System.out.print("\n"+array[2].getName()+" ");
//		array[2].berechneEinladen();
	}

}
