package AB9_OOP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Spielwiese {

	public static void main(String[] args) {

		// Lehrer erstellen und Eigenschaften zuweisen:
		Lehrer lehrer_1 = new Lehrer("Max", "Mustermann", "MUS");
		lehrer_1.erstelleEmail();

		// Schueler erstellen und Eigenschaften zuweisen:
		Schueler.setSchuluniform("Deutsche Uniform");
		// ich muss noch das alles anpassen 
		Schueler schueler_1 = new TZSchueler("John", "Wick", LocalDate.of(1993, 1, 10), "ausbilder_1@hotmail.com", "Fachinformatiker", "Sybit");
		schueler_1.erstelleEmail();
		schueler_1.getAlter();

		Schueler schueler_2 = new TZSchueler("Husam", "Alnasr", LocalDate.of(1990, 3, 4), "ausbilder_2@hotmail.com", "Fachinformatiker", "SÜDKURIER");
		schueler_2.erstelleEmail();
		schueler_2.getAlter();

		Schueler schueler_3 = new TZSchueler("Mike", "Lorenz", LocalDate.of(1995, 12, 30),"ausbilder_3@hotmail.com", "Fachinformatiker", "Alu-Singen" );
		schueler_3.erstelleEmail();
		schueler_3.getAlter();
		
		Schueler schueler_4= new VZSchueler("Vincent", "Brunner", LocalDate.of(1999, 3, 6)); 

		// Alle TZSchueler in einer Liste speichern:
		List<Schueler> tzSchuelerList = new ArrayList<>();
		tzSchuelerList.add(schueler_1);
		tzSchuelerList.add(schueler_2);
		tzSchuelerList.add(schueler_3);

		// Die Schuelklasse für TZ Schueler erstellen und Lehrer, Schueler hinzufuegen:
		Schulklasse schulklasse_1 = new Schulklasse("E3IT1", lehrer_1, tzSchuelerList);

		// Alle VZSchueler in einer Liste speichern:
				List<Schueler> vzSchuelerList = new ArrayList<>();
				vzSchuelerList.add(schueler_4); 
			
		// Test Ausgabe:
		System.out.println(schulklasse_1);

	}

}
