package notas;



public class Trabajos extends Notas{

	protected boolean trabajo;
	protected int retraso;

	
	
	public Trabajos(boolean trabajo, int retraso) {
		this.trabajo=trabajo;
		this.retraso=retraso;
		
	}
	
	public void trabajosHechos() {
		if (retraso>5) {
			trabajo=false;
		}
		else {
			for (int i = 0; i < retraso && retraso!=0 && retraso < 6; i++) {
				nota_global-=0.1;
			}
		}
		
		
		if (trabajo==false) {
			setNota_global(3);
		}
	}
	@Override
	public String toString() {
		if (trabajo==true) {
			return "entregado";
		}

		else {
			return "no entregado";
		}
		
	}
}

