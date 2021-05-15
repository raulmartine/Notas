package notas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesterNotas {
	private static Alumno a1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 a1= new Alumno("David", "Pereda Hernández", "12345",new Examen(new Clasico(6), new Clasico(7), new Clasico(8), new Teste(25, 3, 2), new Teste(25, 3, 2)),new Trabajo(true, 5),new Trabajo(true, 0),new Trabajo(true, 0));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Pruebas realizadas");
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() { //En esta prueba solo probamos la nota global, pero al sacar la nota global prueba todos los métodos creados
		double n1=7.2666666666666675;
		assertEquals(n1,a1.getNota_global());
	}

}
