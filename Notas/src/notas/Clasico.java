package notas;

/**
 *<h2> Clase Clasico </h2> 
 * Esta clase simula ser un examen clasico
 * 
 * @author Raul
 * @version 3.0
 * 
 */

public class Clasico extends Examen{
	/**
	 * 
	 * @param nota Nota del alumno
	 * 
	 */
	
	public Clasico(double nota) {
		this.nota=nota;
		validarNota();
	}
	
	/**
	 * 
	 * @return Devuelve la nota del examen clasico
	 * 
	 */
	
	@Override
	public String toString() {
		return "nota: "+nota;
	}

	public void validarNota() {
		if (!(nota>=0 && nota<=10)) {
		System.out.println("Nota inválida, pon una nota entre 0 y 10");
		}
		
	}
	
}
	

