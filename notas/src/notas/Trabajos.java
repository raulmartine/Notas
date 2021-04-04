package notas;

import java.util.ArrayList;

public class Trabajos {

	ArrayList <Boolean> entregados = new ArrayList <Boolean>(3);
	
	public Trabajos(boolean trabajo1, boolean trabajo2, boolean trabajo3) {
		entregados.add(trabajo1);
		entregados.add(trabajo2);
		entregados.add(trabajo3);
	}
	
public boolean trabajosHechos(boolean trab1, boolean trab2,boolean trab3) {
	boolean aprob=true;
		if (trab1==false || trab2==false || trab3==false) {
			aprob=false;
		}
		else {
			aprob=true;
		}
		return aprob;
	}
	
}
