package domaci_11282019_ucionica;

import java.util.ArrayList;

public class GlavniProgramPolaznikLaptop {

	public static void main(String[] args) {

		Polaznik polaznik1 = new Polaznik("Pera", "Peric");
		Polaznik polaznik2 = new Polaznik("Mika", "Mikic");

		Laptop laptop1 = new Laptop("Lenovo");
		laptop1.addPolaznici(polaznik1);
		laptop1.addPolaznici(polaznik2);

		Polaznik polaznik3 = new Polaznik("Laza", "Lazic");

		Laptop laptop2 = new Laptop("HP");
		laptop2.addPolaznici(polaznik3);

		System.out.println(laptop1.ispis());
		System.out.println(laptop2.ispis());
	}

}
