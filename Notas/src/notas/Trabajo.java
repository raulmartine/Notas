package notas;

/**
 *<h2> Clase Trabajo </h2> 
 * Esta clase simula ser un trabajo
 * 
 * @author Raul
 * @version 3.0
 * 
 */

public class Trabajo{

	/**
	 * Atributo dias_retraso
	 * 
	 * Indica los dias de retraso de un trabajo 
	 * 
	 */
	
	protected int dias_retraso;
	
	/**
	 * Atributo estado
	 * 
	 * Indica el estado de un trabajo 
	 * 
	 */
	
	protected boolean estado;
	
	/**
	 * 
	 * @param estado Estado del trabajo
	 * @param dias_retraso Dias de retraso del trabajo
	 * 
	 */
	
	public Trabajo(boolean estado, int dias_retraso) {
		this.estado=estado;
		this.dias_retraso=dias_retraso;
		
	}

	/**
	 * 
	 * @return Devuelve el estado y dias de retraso del trabajo 
	 * 
	 */
	
	@Override
	public String toString() {
		return "Trabajo [dias_retraso=" + dias_retraso + ", estado=" + estado + "]";
	}

	/**
	 * 
	 * @param nota_global Nota global del alumno	 
	 * 
	 */
	
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