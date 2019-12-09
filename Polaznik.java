package domaci_11282019_ucionica;

public class Polaznik {
	/*
	 * Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
	 * Polaznik poseduje i identifikacioni broj koji se moze dohvatiti. Ime i
	 * prezime polaznika se moze dohvatiti ali ne i postaviti. Polaznik se ispisuje
	 * u obliku: IME_PREZIME{ID}.
	 */

	private String firstName;
	private String lastName;
	private static int IDNumberGlobal = 1;
	private int IDNumber;

	public Polaznik(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		IDNumber = IDNumberGlobal++;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getIDNumber() {
		return IDNumber;
	}

	public String ispis() {

		return firstName + "_" + lastName + " {" + IDNumber + "}";
	}

}
