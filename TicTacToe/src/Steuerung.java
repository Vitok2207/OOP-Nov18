
public class Steuerung {
	// Attribute
	private Oberflaeche dieOberflaeche = new Oberflaeche();
	private Spieler[] spieler = new Spieler[2];
	
	// Konstruktor
	public Steuerung() {
		// Begrüßungstext
		dieOberflaeche.gebeText("TicTacToe V1.0", true);
		
		// Objekte Spieler[0] und Spieler[1] erstellen
		spieler[0] = new Spieler("Hans", 'X');
		spieler[1] = new Spieler("Peter", 'O');
	}
	
	// Methoden
	public void start() {
		// Hier kommt unser Programmablauf rein
		
		// Geben Sie mit der Oberflaeche die Namen der Spieler aus
		// Nutzen Sie die Getter der Spieler
		dieOberflaeche.gebeText(spieler[0].getName(), true);
		dieOberflaeche.gebeText(spieler[1].getName(), true);
		
	}

}
