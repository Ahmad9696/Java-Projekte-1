
public class Zeit1 {
		
	private int stunde;
	private int minute;
	private int sekunde;
	
	public Zeit1(int stunde,int minute, int sekunde) {
		this.setStunde(stunde);
		this.setMinute(minute);
		this.setSekunde(sekunde);
	}

	public boolean setZeit(int stunde, int minute, int sekunde) {
		
		if(stunde>=0 && stunde<=23 && minute>=0 && minute<60 && sekunde>=0 && sekunde<60) {
			this.stunde=stunde;
			this.minute=minute;
			this.sekunde=sekunde;	
			return true;
		}
		else
		return false;
	}
	
	public String toString() {
		
		return this.stunde+":"+this.minute+":"+this.sekunde;
	}
	
	public long inSekunden() {
		
		return stunde*3600+minute*60+sekunde;
	}
	
	// Setter und Getter
	
	public void setStunde(int stunde) {
		this.stunde=stunde;		
	}
	public int getStunde() {		
		return stunde;
	}
	public void setMinute(int minute) {
		this.minute=minute;	
	}
	public int getMinute() {
		return minute;
	}
	public void setSekunde(int sekunde) {
		this.sekunde=sekunde;
	}
	public int getSekunde() {
		return sekunde;
	}	
}
