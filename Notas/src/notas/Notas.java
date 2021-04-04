package notas;
public class Notas {

	private double examen1;
	private double examen2;
	private double examen3;
	private double examen4;
	private double examen5;
	
	public Notas(double examen1,double examen2,double examen3,double examen4,double examen5) {
		this.examen1=examen1;
		this.examen2=examen2; 
		this.examen3=examen3;
		this.examen4=examen4;
		this.examen5=examen5;
	}

	public double getExamen1() {
		return examen1;
	}

	public double getExamen2() {
		return examen2;
	}

	public double getExamen3() {
		return examen3;
	}

	public double getExamen4() {
		return examen4;
	}

	public double getExamen5() {
		return examen5;
	}
	
	public double calcExam1() {
		double result;
		result=examen1*0.1;
		return result;
	}
	public double calcExam2() {
		double result;
		result=examen2*0.2;
		return result;
	}
	public double calcExam3() {
		double result;
		result=examen3*0.2;
		return result;
	}
	public double calcExam4() {
		double result;
		result=examen4*0.25;
		return result;
	}
	public double calcExam5() {
		double result;
		result=examen5*0.25;
		return result;
	}
}