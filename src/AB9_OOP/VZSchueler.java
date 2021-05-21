package AB9_OOP;

import java.time.LocalDate;

public class VZSchueler extends Schueler{
public VZSchueler(String vorname, String nachname,  LocalDate geburtsdatum) {
		super(vorname, nachname, geburtsdatum); 
	}

@Override
public boolean erstelleEmail() {
	setMail(getVorname() + "." + getNachname()+ "@zgs-konstanz.de");

	return true;
}
@Override
public String toString() {
	return "VZSchueler [vorname=" + getVorname() + ", nachname=" + getNachname() + ", email=" + getMail()+ ", geburtsdatum="
			+ getGeburtsdatum() + ", alter=" + getAlter() + " Schuluniform: "+getSchuluniform()+"]";
}

}
