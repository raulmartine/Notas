package notas;

import java.util.ArrayList;

/**
 *<h2> Clase Examen </h2> 
 * Esta clase simula ser un examen
 * 
 * @author Raul
 * @version 3.0
 * 
 */

public class Examen{
	
	/**
	 * Atributo nota
	 * 
	 * Indica la nota del examen de un alumno 
	 * 
	 */
	
	protected double nota;
	
	/**
	 * Atributo notas
	 * 
	 * Indica las notas de los examenes de un alumno 
	 * 
	 */
	
	ArrayList <Examen> notas = new ArrayList <Examen>(5);
	
	
	public Examen() {
	}
	
	/**
	 * 
	 * @param c1 Nota del primer examen clasico
	 * @param c2 Nota del segundo examen clasico
	 * @param c3 Nota del tercer examen clasico
	 * @param t1 Nota del primer examen test
	 * @param t2 Nota del segundo examen test
	 * 
	 */
	
	public Examen(Clasico c1, Clasico c2, Clasico c3, Teste t1, Teste t2) {
		notas.add(c1);
		notas.add(c2);
		notas.add(c3);
		notas.add(t1);
		notas.add(t2);
	}
	
	/**
	 * 
	 * @return Devuelve la nota del primer examen clasico
	 * 
	 */
	
	public double calcExam1() {
		return  notas.get(0).nota *0.1;
	}
	
	/**
	 * 
	 * @return Devuelve la nota del segundo examen clasico
	 * 
	 */
	
	public double calcExam2() {
		return  notas.get(1).nota *0.2;
	}
	
	/**
	 * 
	 * @return Devuelve la nota del tercer examen clasico
	 * 
	 */
	
	public double calcExam3() {
		return  notas.get(2).nota *0.2;
	}
	
	/**
	 * 
	 * @return Devuelve la nota del primer examen test
	 * 
	 */
	
	public double calcExam4() {
		return  notas.get(3).nota *0.25;
	}
	
	/**
	 * 
	 * @return Devuelve la nota del segundo examen test
	 * 
	 */
	
	public double calcExam5() {
		return  notas.get(4).nota *0.25;
	}
	
	/**
	 * 
	 * @return Devuelve la nota global
	 * 
	 */
	
	public double calcularNotaGlobal(){
			return calcExam1()+calcExam2()+calcExam3()+calcExam4()+calcExam5();
		}
	
	/**
	 * 
	 * @return Devuelve las notas de los examenes
	 * 
	 */
	
	@Override
	public String toString() {
		return "Notas= " + notas;
	}
}
