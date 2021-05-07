package notas;

import java.util.ArrayList;
public class Alumno {
	//private ArrayList<Alumno> alumnos=new ArrayList<Alumno>(10);
			private String nombre;
			private String apellidos;
			private String nia;
			
			public Alumno() {
				
			}
			public Alumno(String nombre,String apellidos, String nia) {
				this.nombre=nombre;
				this.apellidos=apellidos;
				this.nia=nia;
			}

			public String getNia() {
				return nia;
			}
			public void setNia(String nia) {
				this.nia = nia;
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
