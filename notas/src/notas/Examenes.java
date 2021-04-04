package notas;


public abstract class Examenes extends Trabajos {
	
	protected boolean aprobado;
	
	public Examenes() {
		aprobado=trabajosHechos();
		calcularTrabajo (aprobado);
	}
	
	
	
		
	
	
	
}