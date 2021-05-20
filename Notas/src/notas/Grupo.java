package notas;

import java.util.ArrayList;

public class Grupo{

	private ArrayList <Alumno> clase = new ArrayList <Alumno>(10);
	
	public Grupo(){}
	
	public Grupo(Alumno a1,Alumno a2,Alumno a3,Alumno a4,Alumno a5,Alumno a6,Alumno a7,Alumno a8,Alumno a9,Alumno a10) {
		clase.add(a1);
		clase.add(a2);
		clase.add(a3);
		clase.add(a4);
		clase.add(a5);
		clase.add(a6);
		clase.add(a7);
		clase.add(a8);
		clase.add(a9);
		clase.add(a10);
		
	}
	
	@Override
	public String toString() {
		return "Clase:"+"\n"+clase;
	}
	
	
}
