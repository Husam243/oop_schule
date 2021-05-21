package AB9_OOP;

public abstract class Person {
	private String vorname;
	private String nachname;
	private String mail;

	public Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Person [vorname=" + getVorname() + ", nachname=" + getNachname()+ ", mail=" + getMail()+ "]";
	}

}
