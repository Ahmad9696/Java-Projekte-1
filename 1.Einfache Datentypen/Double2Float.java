class Double2Float{
	
public static void main(String args[]){
	
	double smallDouble = 9.999999999;
	double bigDouble = 1.23E145;
	float smallFloat = (float) smallDouble;
	float bigFloat = (float) bigDouble;
	System.out.println("smallDouble: " + smallDouble + " in float: " + smallFloat);
	System.out.println("bigDouble: " + bigDouble + " in float: " + bigFloat);
	
}
}