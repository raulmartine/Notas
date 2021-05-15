package notas;

public class Testerdeclases {

	public static void main(String[] args) {
		 Alumno a1 = new Alumno("David", "Pereda Hernández", "12345",new Examen(new Clasico(8), new Clasico(8), new Clasico(8), new Test(25, 3, 2), new Test(25, 3, 2)),new Trabajo(true, 5),new Trabajo(true, 0),new Trabajo(true, 0));
	System.out.println(a1);
	// Alumno a2 = new Alumno("David", "Pereda Hernández", "12345",new Examen(new Clasico(8), new Clasico(8), new Clasico(8), new Test(25, 3, 2), new Test(25, 3, 2)), new Trabajo(true, 5),new Trabajo(true, 2),new Trabajo(true, 2));
	 //System.out.println(a2);
	}

	
}
