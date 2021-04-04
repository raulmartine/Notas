package notas;

public class Test extends Tipo{

	int bien;
	int mal;
	public Test(int bien, int mal) {
		this.bien=bien;
		this.mal=mal;
		nota=notaTest();
	}
	
	public double notaTest() {
		double nota=0;
		int total=bien+mal;
		if (total==30) {
			for (int i = 0; i < bien; i++) {
				nota++;
			}
			
			for (int i = 0; i < mal; i++) {
				nota-=bien/3;
			}
			
		}
		
		return nota;
	}
	
	@Override
	public String toString() {
		return "bien: "+bien+", mal: "+mal+", "+super.toString();
	}
	
}
