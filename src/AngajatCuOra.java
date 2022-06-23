
public class AngajatCuOra extends Angajat {

	private int numarOre;
	private int numarOrePlus = 0;

	public AngajatCuOra(String nume, double salariu, int numarOre) {
		super(nume, salariu);
		this.numarOre = numarOre;
	}

	public int getNumarOre() {
		return numarOre;
	}

	public void adaugaOre(int numarOrePlus) {
		this.numarOrePlus = numarOrePlus;
	}

	public void schimbaSalarPeOra(double salariu) {
		this.salariu = salariu;
	}

	public double calculSalar() {
		return (numarOre + numarOrePlus) * salariu;
	}

}
