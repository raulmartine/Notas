package notas;

public class prueba {

	public static void main(String[] args) {
		Alumno  a1= new Alumno("David", "Pereda Hernández", "12345",
				new Examen(new Clasico(10), new Clasico(10), new Clasico(10), new Teste(0, 30, 0), new Teste(5, 20, 5)),
				new Trabajo(true, 5),new Trabajo(true, 1),new Trabajo(true, 1));
		
		Alumno  a2= new Alumno("Raúl", "Martinez Garcia", "23456",
				new Examen(new Clasico(8), new Clasico(10), new Clasico(9), new Teste(10, 10, 10), new Teste(20, 5, 5)),
				new Trabajo(true, 3),new Trabajo(false, 1),new Trabajo(true, 1));
		
		Alumno  a3= new Alumno("Pepe", "Pereda Lazaro", "632187",
				new Examen(new Clasico(10), new Clasico(10), new Clasico(10), new Teste(0, 30, 0), new Teste(5, 20, 5)),
				new Trabajo(true, 7),new Trabajo(true, 6),new Trabajo(true, 1));
		
		Alumno  a4= new Alumno("Daniel", "Gonzalez llorent", "68499",
				new Examen(new Clasico(10), new Clasico(3), new Clasico(5), new Teste(20, 5, 5), new Teste(5, 20, 5)),
				new Trabajo(true, 5),new Trabajo(true, 1),new Trabajo(true, 1));
		
		Alumno  a5= new Alumno("Paula", "Garcia Pino", "371283",
				new Examen(new Clasico(10), new Clasico(10), new Clasico(3), new Teste(14, 10, 6), new Teste(10, 15, 5)),
				new Trabajo(true, 5),new Trabajo(true, 1),new Trabajo(true, 1));
		
		Alumno  a6= new Alumno("Anselmo", "Mucho texto", "146723",
				new Examen(new Clasico(10), new Clasico(10), new Clasico(10), new Teste(1, 29, 0), new Teste(4, 21, 5)),
				new Trabajo(false, 20),new Trabajo(false, 1),new Trabajo(false, 1));
		
		Alumno  a7= new Alumno("Adriana", "de la torre", "176217",
				new Examen(new Clasico(4), new Clasico(4), new Clasico(7), new Teste(30, 0, 0), new Teste(5, 20, 5)),
				new Trabajo(true, 0),new Trabajo(true, 0),new Trabajo(true, 0));
		
		Alumno  a8= new Alumno("Franchesco", "Virgolini", "346439",
				new Examen(new Clasico(10), new Clasico(5), new Clasico(6), new Teste(10, 20, 0), new Teste(5, 20, 5)),
				new Trabajo(true, 0),new Trabajo(false, 1),new Trabajo(true, 1));
		
		Alumno  a9= new Alumno("Moises", "Apruebanos", "12345",
				new Examen(new Clasico(10), new Clasico(10), new Clasico(10), new Teste(30, 0, 0), new Teste(30, 0, 0)),
				new Trabajo(true, 0),new Trabajo(true, 0),new Trabajo(true, 0));
		
		Alumno  a10= new Alumno("Maricarmen", "dios mio", "12345",
				new Examen(new Clasico(4), new Clasico(5), new Clasico(8), new Teste(14, 16, 0), new Teste(15, 0, 15)),
				new Trabajo(false, 5),new Trabajo(true, 1),new Trabajo(true, 1));
		Grupo g1= new Grupo(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10);
		System.out.println(g1);
		
	}

}
