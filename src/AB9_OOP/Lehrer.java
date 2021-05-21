package AB9_OOP;

public class Lehrer extends Person {

	private String kurzel; 
	
	public Lehrer(String vorname, String nachname, String kurzel) {
		super(vorname, nachname); 
		this.kurzel = kurzel;
	}

	public String getKurzel() {
		return kurzel;
	}

	public void setKurzel(String kurzel) {
		this.kurzel = kurzel;
	}

	
	

	public boolean erstelleEmail() {
	setMail( getVorname().substring(0,1)+"."+getNachname()+"@zgk-konstanz.de"); 
		return true; 
	}

	@Override
	public String toString() {
		return "Lehrer [vorname=" + getVorname()+ ", nachname=" + getNachname()+ ", email=" + getMail() + "]";
	}
	


}
