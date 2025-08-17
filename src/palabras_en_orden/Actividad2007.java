package palabras_en_orden;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Actividad2007 {

	public String devolverEnOrden(ArrayList<String> palabras) {
		if (palabras.isEmpty())
			return "";

		ArrayList<String> listaOrdenada = new ArrayList<>();

		for (int j = palabras.size() - 1; j >= 0; j--) {
			
			String palabra = palabras.get(j);
			boolean insertada = false;
			
			for (int i = 0; i < listaOrdenada.size(); i++) {
				
				if (palabra.length() > listaOrdenada.get(i).length()) {
					listaOrdenada.add(i, palabra);
					insertada = true;
					break;
				}
			}
			if (!insertada) {
				listaOrdenada.add(palabra);
			}
		}

		return String.join(",", listaOrdenada);
	}

}
