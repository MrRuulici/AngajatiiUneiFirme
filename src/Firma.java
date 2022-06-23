import java.util.ArrayList;

public class Firma {

	private ArrayList<Angajat> listaAngajati;

	public boolean angajeaza(Angajat angajat) {
		if (angajat.nume.equals(angajat.nume))
			return false;
		else {
			listaAngajati.add(angajat);
			return true;
		}
	}

}
