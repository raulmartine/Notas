package notas;

public class Clasico extends Examen{
	
	
	public Clasico(double nota) {
		this.nota=nota;
		calcularNota();
	}
	
	@Override
	public String toString() {
		return "nota: "+nota;
	}

	@Override
	public void calcularNota() {
		if (!(nota>=0 && nota<=10)) {
		System.out.println("Nota inválida, pon una nota entre 0 y 10");
		}
		
	}
	
}
	

