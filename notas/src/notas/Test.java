package notas;

public class Test extends Examen{

	
	protected int correctas;
	protected int incorrectas;
	protected int nocontestadas;
	
	public Test(int correctas, int incorrectas, int nocontestadas) {
		this.correctas=correctas;
		this.incorrectas=incorrectas;
		this.nocontestadas=nocontestadas;
		calcularNota();
	}
	
	@Override
	public String toString() {
		return "nota: "+nota;
	}

	public void calcularNota() {
		int total=correctas+incorrectas+nocontestadas;
        if (total==30) {
            for (int i = 0; i < correctas; i++) {
                nota++;
            }
            for (int i = 0; i < incorrectas; i++) {
                nota-=(1/3);
            }
            nota=nota/30*10;  
        }
        else {
        	System.out.println("Nota inválida, pon 30 en total.");
		}
    }
}