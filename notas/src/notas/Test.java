package notas;

public class Test extends Notas{

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
				nota-=(1/3);
			}
			
		}
		
		return nota/30*10;
	}
	
	@Override
	public String toString() {
		return "bien: "+bien+", mal: "+mal+", "+ "nota: "+nota;
	}
	
}
