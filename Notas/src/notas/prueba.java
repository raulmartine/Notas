package notas;

import java.util.ArrayList;

public class prueba {

	public static void main(String[] args) {
		
		ArrayList<Alumnos> alumnos=new ArrayList<Alumnos>(10);
		alumnos.add(new Notas("pepe", "palotes",new Clasico(6),new Clasico(7),new Clasico(8), new Test(30,0), new Test(27,3)));
	}

}
