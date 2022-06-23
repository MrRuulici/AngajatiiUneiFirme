
public class AngajatCuSalarFix extends Angajat {

	public AngajatCuSalarFix(String nume, double salariu) {
		super(nume, salariu);
	}

	public String getNume() {
		return nume;
	}

	public double calculSalar() {
		return salariu;
	}

	public void schimbaSalarFix(double salariu) {
		this.salariu = salariu;
	}

}
