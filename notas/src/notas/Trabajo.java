package notas;

public class Trabajo{

	protected int dias_retraso;
	protected boolean estado;
	
	public Trabajo(boolean estado, int dias_retraso) {
		this.estado=estado;
		this.dias_retraso=dias_retraso;
		
	}

	@Override
	public String toString() {
		return "Trabajo [dias_retraso=" + dias_retraso + ", estado=" + estado + "]";
	}

	public double validarTrabajo(double nota_global) {
		if (estado && nota_global!=3 && dias_retraso<=5) {
			nota_global=(nota_global-(dias_retraso*0.1));
		}
		else {
			nota_global=3;
		}
		return nota_global;
	}
}