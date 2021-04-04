package notas;

import java.util.ArrayList;
public class Alumnos {
	//private ArrayList<Alumno> alumnos=new ArrayList<Alumno>(10);
			private String nombre;
			private String apellidos;
			
			public Alumnos() {
				
			}
			public Alumnos(String nombre,String apellidos) {
				this.nombre=nombre;
				this.apellidos=apellidos;
			}

			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			
			public String getApellidos() {
				return apellidos;
			}

			public void setApellidos(String apellidos) {
				this.apellidos = apellidos;
			}
}
