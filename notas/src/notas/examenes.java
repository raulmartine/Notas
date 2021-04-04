package notas;

import java.util.ArrayList;

public abstract class examenes {
	
	ArrayList <Double> notas = new ArrayList <Double>(5);

	public examenes(Clasico n1, Clasico n2, Clasico n3, Test t1, Test t2){
		
	}
	
	//o hacer clasico y test el mismo y hacerlo abstracto
	public abstract double tipoExamen();
	

	
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