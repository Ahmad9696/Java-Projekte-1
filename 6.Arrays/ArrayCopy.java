class ArrayCopy {
public static void main(String[ ] args) {

	float masterArray [ ] = {1.0f,1.1f,1.2f,1.3f,1.4f};
	float copiedArray [ ] = new float[5];
	
	for(int i=0;i<masterArray.length;i++)
		copiedArray[i]=masterArray[i];
	
	System.out.println("Das MasterArray lautet: ");
	arrayausgaben(masterArray);
	
	System.out.println("\nDas CopiedArray lautet: ");
	arrayausgaben(copiedArray);
	
}
	public static void arrayausgaben(float array[]) {
		
		for(float element : array)
		System.out.print(element+" ");	
	}
}