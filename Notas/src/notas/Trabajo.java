package notas;

import java.util.ArrayList;

public class Trabajo extends Examen{

	
	static protected boolean estado_final=true;
	protected int dias_retraso;
	protected boolean estado;
	
	public Trabajo(boolean estado, int dias_retraso) {
		this.estado=estado;
		this.dias_retraso=dias_retraso;
		calcularNota();
	}

	@Override
	public String toString() {
		return "Trabajo [dias_retraso=" + dias_retraso + ", estado=" + estado + "]";
	}

	@Override
	public void calcularNota() {
		if (estado&&estado_final) {
			nota_global-=(dias_retraso/10);
		}
		else {
			estado_final=false;
			nota_global=3;
		}
	}
}