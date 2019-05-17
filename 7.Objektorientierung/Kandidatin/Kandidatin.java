
public class Kandidatin {
	
	private String name;
	private float groessInM;
	private float gewichtInKG;
	private boolean einladen;
	
	public Kandidatin(String name,float groessInM, float gewichtInKG) {
		this.setName(name);
		this.setGroessInM(groessInM);
		this.setGewichtInKG(gewichtInKG);
		this.setEinladen();		
	}
	public void berechneEinladen() {
		if(this.gewichtInKG/(this.groessInM*this.groessInM)<=20.0) {
			einladen=true;
		}
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setGroessInM(float groessInM) {
		this.groessInM=groessInM;
	}
	public float getGroessInM() {
		return groessInM;
	}
	public void setGewichtInKG(float gewichtInKG) {
		this.gewichtInKG=gewichtInKG;
	}
	public float setGewichtInKG() {
		return gewichtInKG;
	}	
	public void setEinladen() {
		this.einladen=false;
	}
	public boolean getEinladen() {
		return einladen;
	}
}
