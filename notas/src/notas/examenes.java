package notas;

import java.util.ArrayList;

public abstract class examenes {
	
	ArrayList <Double> notas = new ArrayList <Double>(5);

	public examenes(ArrayList<Double> notas){
		this.notas=notas;
		//falta hacer cosas
	}
	
	//o hacer clasico y test el mismo y hacerlo abstracto
	public abstract double tipoExamen();
	
	
	public double clasico() {
		double nota=0;
		if (nota>10 && nota<0) {
			//me cago en tu puta madr
		}
		else {
			//está en el rango
		}
		return nota;
	}
	
	public double  test(int bien, int mal) {
		double nota=0;
		int total=bien+mal;
		if (total==30) {
			for (int i = 0; i < bien; i++) {
				nota++;
			}
			
			for (int i = 0; i < mal; i++) {
				nota-=bien/3;
			}
			
		}
		else {
			
		}
		
		return nota;
	}
	
}