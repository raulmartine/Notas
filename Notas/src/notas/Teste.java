package notas;

/**
 *<h2> Clase Test </h2> 
 * Esta clase simula ser un examen test
 * 
 * @author Raul
 * @version 3.0
 * 
 */

public class Teste extends Examen{

	/**
	 * Atributo correctas
	 * 
	 * Indica las respuestas acertadas de un examen test
	 * 
	 */
	
	protected int correctas;
	
	/**
	 * Atributo incorrectas
	 * 
	 * Indica las respuestas fallidas de un examen test
	 * 
	 */
	
	protected int incorrectas;
	
	/**
	 * Atributo nocontestadas
	 * 
	 * Indica las respuestas no contestadas de un examen test
	 * 
	 */
	
	protected int nocontestadas;
	
	/**
	 * 
	 * @param correctas Preguntas correctas del examen test
	 * @param incorrectas Preguntas fallidas del examen test
	 * @param nocontestadas Preguntas nocontestadas del examen test
	 * 
	 */
	
	public Teste(int correctas, int incorrectas, int nocontestadas) {
		this.correctas=correctas;
		this.incorrectas=incorrectas;
		this.nocontestadas=nocontestadas;
		calcularNota();
	}
	
	/**
	 * 
	 * @return Devuelve la nota del examen test
	 * 
	 */
	
	@Override
	public String toString() {
		return "nota: "+nota;
	}

	public void calcularNota() {
		int total=correctas+incorrectas+nocontestadas;
		final int preguntastotal = 30;
		final int restaporfallo = 1/3;
        if (total==preguntastotal) {
            for (int i = 0; i < correctas; i++) {
                nota++;
            }
            for (int i = 0; i < incorrectas; i++) {
                nota-=restaporfallo;
            }
            nota=nota/preguntastotal*10;  
        }
        else {
        	System.out.println("Nota inválida, pon 30 en total.");
		}
    }
}