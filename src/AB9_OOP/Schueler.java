package AB9_OOP;

import java.time.LocalDate;

public abstract class Schueler extends Person {

	private LocalDate geburtsdatum;
	private int alter;
	private static String schuluniform; 

	public Schueler(String vorname, String nachname,  LocalDate geburtsdatum) {
		super(vorname, nachname); 
		this.geburtsdatum = geburtsdatum;
		this.alter= getAlter(); 
	}

	public static String getSchuluniform() {
		return schuluniform;
	}

	public static void setSchuluniform(String schuluniform) {
		Schueler.schuluniform = schuluniform;
	}


	public LocalDate getGeburtsdatum() {

		return geburtsdatum;
	}

	public void setGeburtsdatum(LocalDate geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	public int getAlter() {
		return LocalDate.now().compareTo(geburtsdatum);
	}


	public abstract boolean erstelleEmail();

	@Override
	public String toString() {
		return "Schueler [vorname=" + getVorname() + ", nachname=" + getNachname() + ", email=" + getMail()+ ", geburtsdatum="
				+ geburtsdatum + ", alter=" + alter + " Schuluniform: "+schuluniform+"]";
	}






}
