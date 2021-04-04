package notas;

import java.util.ArrayList;

public class Trabajos extends Notas{

	ArrayList <Boolean> entregados = new ArrayList <Boolean>(3);
	
	
	public Trabajos(boolean trabajo1, boolean trabajo2, boolean trabajo3) {
		entregados.add(trabajo1);
		entregados.add(trabajo2);
		entregados.add(trabajo3);
	}
	
	public void trabajosHechos() {
		if (entregados.get(0) ==false ||entregados.get(1) ==false || entregados.get(2)==false) {
			nota_global=3;
		}
	}
}
