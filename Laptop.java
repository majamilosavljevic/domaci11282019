package domaci_11282019_ucionica;

import java.util.ArrayList;

public class Laptop {
	/*
	 * Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju
	 * prilikom kreiranja. Marka moze samo da se dohvati. Lista polaznika koji
	 * koriste laptop moze da se prosiri. Moze da se ispise u obliku (koristiti
	 * metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
	 */

	ArrayList<Polaznik> polaznici;

	private String brand;

	public Laptop(String brand) {
		this.brand = brand;
		polaznici = new ArrayList<Polaznik>();
	}

	public String getBrand() {
		return brand;
	}

	public void addPolaznici(Polaznik polaznik) {
		polaznici.add(polaznik);
	}

	public ArrayList<Polaznik> getPolaznici() {
		return polaznici;
	}

	public Polaznik getPolaznik(int IDNumber) {
		for (int i = 0; i < polaznici.size(); i++) {
			Polaznik polaznik = polaznici.get(i);
			if (polaznik.getIDNumber() == (IDNumber)) {
				return polaznik;
			}
		}
		return null;
	}

	public String ispis() {
		String result = "";

		for (int i = 0; i < polaznici.size(); i++) {
			Polaznik polaznik = polaznici.get(i);
			result += polaznik.ispis();

			if (i < polaznici.size() - 1) {
				result += ", ";
			}
		}

		return brand + "{" + result + "}";
	}

}
