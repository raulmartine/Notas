package notas;

public class prueba {

	public static void main(String[] args) {
		
		Notas notas=new Notas(new Clasico(6),new Clasico(7),new Clasico(8), new Test(15,15), new Test(15,15));
		
		System.out.println(notas.getExamen1());
		
	}

}
