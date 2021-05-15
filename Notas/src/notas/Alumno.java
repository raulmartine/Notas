package notas;
import java.util.ArrayList;

/**
 *<h2> Clase Alumno </h2> 
 * Esta clase simula ser un alumno
 * 
 * @author Raul
 * @version 3.0
 * 
 */

public class Alumno {
	/**
	 * Atributo nombre
	 * 
	 * Indica el nombre de un alumno 
	 * 
	 */
	
	private String nombre;
	
	/**
	 * Atributo apellidos
	 * 
	 * Indica el apellido de un alumno 
	 * 
	 */
	
	private String apellidos;
	
	/**
	 * Atributo nia
	 * 
	 * Indica el nia de un alumno 
	 * 
	 */
	
	private String nia;
	
	/**
	 * Atributo examen
	 * 
	 * Indica las notas de los examenes de un alumno 
	 * 
	 */
	
	private Examen examen;
	
	/**
	 * Atributo trabajos
	 * 
	 * Indica el estado de los trabajos de un alumno 
	 * 
	 */
	
	private ArrayList <Trabajo> trabajos = new ArrayList <Trabajo>(3);
	
	/**
	 * Atributo nota_global
	 * 
	 * Indica la nota global de un alumno 
	 * 
	 */
	
	protected double nota_global;
	
	/**
	 * 
	 * @param nombre Nombre de un alumno
	 * @param apellidos Apellidos de un alumno
	 * @param nia NIA de un alumno
	 * @param examen Examenes del alumno
	 * @param tr1 Primer trabajo del alumno
	 * @param tr2 Segundo trabajo del alumno
	 * @param tr3 Tercer trabajo del alumno
	 * 
	 */
	
	public Alumno(String nombre, String apellidos, String nia, Examen examen,Trabajo tr1, Trabajo tr2, Trabajo tr3){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nia=nia;
		this.examen=examen;
		nota_global=examen.calcularNotaGlobal();
		trabajos.add(tr1);
		trabajos.add(tr2);
		trabajos.add(tr3);
		nota_global=tr1.validarTrabajo(nota_global);
		nota_global=tr2.validarTrabajo(nota_global);
		nota_global=tr3.validarTrabajo(nota_global);
	}
	
	/**
	 * 
	 * @return Devuelve el nombre, apellidos, nia, notas de los examenes y trabajos del alumno
	 * 
	 */
	
	@Override
	public String toString() {
		
		return "Nombre: "+nombre+"\n"+"Apellidos: "+apellidos+"\n"+"Nia: "+nia+"\n"+"Notas: "+examen+"\n"+"Trabajos: "+trabajos+"\n"+"Nota Global: "+nota_global;
	}

	/**
	 * 
	 * @return Devuelve la nota global del alumno
	 * 
	 */
	
	public double getNota_global() {
		return nota_global;
	}

	
}
