package notas;

import java.util.ArrayList;


public class Notas extends Alumnos{
	protected double nota_global;
	protected double nota;
	
ArrayList <Notas> notas = new ArrayList <Notas>(5);
	
	public Notas() {
		
	}

	public Notas(String name, String surname, Clasico clasico1, Clasico clasico2, Clasico clasico3,Test test1, Test test2) {//fusionar constructor de trabajos con el de notas 
		super(name, surname);
		notas.add(clasico1);
		notas.add(clasico2);
		notas.add(clasico3);
		notas.add(test1);
		notas.add(test2);
	}
	

	public Notas getExamen1() {
		return notas.get(0);
	}

	public Notas getExamen2() {
		return notas.get(1);
	}

	public Notas getExamen3() {
		return notas.get(2);
	}

	public Notas getExamen4() {
		return notas.get(3);
	}

	public Notas getExamen5() {
		return notas.get(4);
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
	public void calcNotaGlobal() {
		nota_global=calcExam1()+calcExam2()+calcExam3()+calcExam4()+calcExam5();
	}
	public double getNota_global() {
		return nota_global;
	}
	public void setNota_global(double nota_global) {
		this.nota_global = nota_global;
	}
}
