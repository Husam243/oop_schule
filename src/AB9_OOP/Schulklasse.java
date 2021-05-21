package AB9_OOP;

import java.util.List;

public class Schulklasse {
	
	private String klassenName;
	private Lehrer lehrer;
	private List<Schueler> schueler;

	public Schulklasse(String klassenName, Lehrer lehrer, List<Schueler> schueler) {
		this.klassenName = klassenName;
		this.lehrer = lehrer;
		this.schueler = schueler;
	}

	public String getKlassenName() {
		return klassenName;
	}

	public void setKlassenName(String klassenName) {
		this.klassenName = klassenName;
	}

	public Lehrer getLehrer() {
		return lehrer;
	}

	public void setLehrer(Lehrer lehrer) {
		this.lehrer = lehrer;
	}

	public List<Schueler> getSchueler() {
		return schueler;
	}

	public void setSchueler(List<Schueler> schueler) {
		this.schueler = schueler;
	}

	@Override
	public String toString() {
		return "Schulklasse KlassenName=" + klassenName + ",\nLehrer diser Klasse=" + getLehrer() + ", \nSchueler=" + getSchueler();
	}

}
