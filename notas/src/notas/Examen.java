package notas;

import java.util.ArrayList;

public class Examen{
	
	protected double nota;
	
	
	
	ArrayList <Examen> notas = new ArrayList <Examen>(5);
	
	
	public Examen() {
	}
	
	public Examen(Clasico c1, Clasico c2, Clasico c3, Test t1, Test t2) {
		notas.add(c1);
		notas.add(c2);
		notas.add(c3);
		notas.add(t1);
		notas.add(t2);
	}
	
	public double calcExam1() {
		return  notas.get(0).nota *0.1;
	}
	public double calcExam2() {
		return  notas.get(1).nota *0.2;
	}
	public double calcExam3() {
		return  notas.get(2).nota *0.2;
	}
	public double calcExam4() {
		return  notas.get(3).nota *0.25;
	}
	public double calcExam5() {
		return  notas.get(4).nota *0.25;
	}
	
	public double calcularNotaGlobal(){
			return calcExam1()+calcExam2()+calcExam3()+calcExam4()+calcExam5();
		}
	
	@Override
	public String toString() {
		return "Notas= " + notas;
	}
}
