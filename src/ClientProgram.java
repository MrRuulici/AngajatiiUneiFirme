
public class ClientProgram {

	public static void main(String[] args) {
		AngajatCuSalarFix a1 = new AngajatCuSalarFix("Dorel", 2300);
		Angajat a2 = new AngajatCuOra("Costel", 10, 200);

		Firma f1 = new Firma();

		f1.angajeaza(a1);
		f1.angajeaza(a2);

		a1.schimbaSalarFix(2400);

	}

}
