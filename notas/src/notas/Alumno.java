package notas;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String nia;
	private Examen examen;
	
	ArrayList <Trabajo> trabajos = new ArrayList <Trabajo>(3);
	
	protected double nota_global;
	
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

	@Override
	public String toString() {
		
		return "Nombre: "+nombre+"\n"+"Apellidos: "+apellidos+"\n"+"Nia: "+nia+"\n"+"Notas: "+examen+"\n"+"Trabajos: "+trabajos+"\n"+"Nota Global: "+nota_global;
	}
}
