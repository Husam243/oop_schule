package AB9_OOP;

import java.time.LocalDate;

public class TZSchueler extends Schueler {

	private String ausbilderMail;
	private String beruf;
	private String betrieb;
	public TZSchueler(String vorname, String nachname,  LocalDate geburtsdatum, String ausbilderMail, String beruf, String betrieb) {
		super(vorname, nachname,  geburtsdatum); 
		this.ausbilderMail= ausbilderMail; 
		this.beruf= beruf; 
		this.betrieb= betrieb; 
	}

	public String getBeruf() {
		return beruf;
	}

	public void setBeruf(String beruf) {
		this.beruf = beruf;
	}

	public String getBetrieb() {
		return betrieb;
	}

	public void setBetrieb(String betrieb) {
		this.betrieb = betrieb;
	}


	public String getAusbilderMail() {
		return ausbilderMail;
	}

	public void setAusbilderMail(String ausbilderMail) {
		this.ausbilderMail = ausbilderMail;
	}

	@Override
	public boolean erstelleEmail() {
		setMail(getVorname() + "." + getNachname()+ "@zgs-konstanz.de");
		
		return true;
	}

	public String toString() {
		return "TZSchueler [vorname=" + getVorname() + ", nachname=" + getNachname() + ", email=" + getMail()
				+ ", geburtsdatum=" + getGeburtsdatum() + ", alter=" + getAlter() + " Schuluniform: "
				+ getSchuluniform() + " Betrieb: "+getBetrieb()+" Beruf: "+getBeruf()+" Ausbilder E-Mail: "+ getAusbilderMail()+"]\n";
	}


}
