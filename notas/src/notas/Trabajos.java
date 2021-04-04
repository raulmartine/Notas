package notas;

import java.util.ArrayList;

public class Trabajos {

	ArrayList <Boolean> entregados = new ArrayList <Boolean>(3);
	
	public Trabajos() {
		
	}
	
	public Trabajos(boolean trabajo1, boolean trabajo2, boolean trabajo3) {
		entregados.add(trabajo1);
		entregados.add(trabajo2);
		entregados.add(trabajo3);
	}
	
	public boolean trabajosHechos() {
	boolean aprob=true;
		if (entregados.get(0) ==false ||entregados.get(1) ==false || entregados.get(2)==false) {
			aprob=false;
		}
		else {
			aprob=true;
		}
		return aprob;
	}
	
	public double calcularTrabajo (boolean aprsus) {
		double nota=0;
		
		if (aprsus=false) {
			nota=3;
		}
		return nota;
	}
	

}
