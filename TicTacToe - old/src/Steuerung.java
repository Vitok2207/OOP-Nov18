
public class Steuerung {
	// Attribute
	private Oberflaeche dieOberflaeche = new Oberflaeche();
	private Spieler[] spieler = new Spieler[2];
	private Spielfeld dasSpielfeld = new Spielfeld();

	// Konstruktor
	public Steuerung() {
		// Begrüßungstext
		dieOberflaeche.gebeText("TicTacToe V1.0", true);

		spielerEinlesen();

	}

	// Methoden
	public void start() {
		// Hier kommt unser Programmablauf rein
		spielfeldAusgeben();
		feldSetzen();
		spielfeldAusgeben();
	}

	private void feldSetzen() {
		dieOberflaeche.gebeText("X: ", false);
		int tempX = dieOberflaeche.leseZahl();
		dieOberflaeche.gebeText("Y: ", false);
		int tempY = dieOberflaeche.leseZahl();
		dasSpielfeld.setzeFeld(tempX, tempY, 1);
	}

	private void spielfeldAusgeben() {
		dieOberflaeche.gebeSpielfeld(dasSpielfeld.getSpielfeld(), spieler[0].getSpielStein(),
				spieler[1].getSpielStein());
	}

	private void spielerEinlesen() {
		// Spieler 1 ausgeben
		dieOberflaeche.gebeText("Spieler 1", true);
		// Name und Zeichen einlesen
		dieOberflaeche.gebeText("Name: ", false);
		String tempString = dieOberflaeche.leseText();
		dieOberflaeche.gebeText("Zeichen: ", false);
		char tempChar = dieOberflaeche.leseZeichen();

		// Objekt spieler[0] erstellen
		spieler[0] = new Spieler(tempString, tempChar);

		// Neue Zeile
		dieOberflaeche.neueZeile(1);

		// Spieler 2 ausgeben
		dieOberflaeche.gebeText("Spieler 2", true);
		// Name und Zeichen einlesen
		dieOberflaeche.gebeText("Name: ", false);
		tempString = dieOberflaeche.leseText();
		dieOberflaeche.gebeText("Zeichen: ", false);
		tempChar = dieOberflaeche.leseZeichen();

		// Objekt spieler[1] erstellen
		spieler[1] = new Spieler(tempString, tempChar);

		// Neue Zeile
		dieOberflaeche.neueZeile(1);
	}

}
