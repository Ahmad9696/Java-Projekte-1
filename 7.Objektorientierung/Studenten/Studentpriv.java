public class Studentpriv {
	
	private String name;
	private int alter;
	private int semster;
	private int laune;
	
	Studentpriv (String name,int alter, int semster, int laune){
		this.setName(name);
		this.setAlter(alter);
		this.setSemster(semster);
		this.setLaune(laune);
	}
	
	void schwimmen(){
		if(name=="Mollham")
		laune=laune+2;
		
		if(name=="Ahmad")
			laune++;
	}
	
	void schach() {
		if(name=="Mollham")
				laune++;
		if(name=="Ahmad")
			laune=laune+2;
	}
	
	void counterStrik() {
		if(name=="Mollham")
				laune++;
		if(name=="Ahmad")
			laune=laune+2;
	}	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAlter(int alter) {
		this.alter=alter;
	}
	public int getAlter() {
		return alter;
	}
	
	public void setSemster(int semster) {
		this.semster=semster;
	}
	public int getSemster() {
		return semster;
	}
	
	public void setLaune(int laune) {
		this.laune=laune;
	}
	public int getLaune() {
		return laune;
	}
}
	