package notas;

import java.util.ArrayList;

import notas.Clasico;
import notas.Test;
import notas.Tipo;

public class Notas extends Tipo {
	
ArrayList <Tipo> notas = new ArrayList <Tipo>(5);
	
	public Notas(Clasico clasico1, Clasico clasico2, Clasico clasico3,Test test1, Test test2) {
		notas.add(clasico1);
		notas.add(clasico2);
		notas.add(clasico3);
		notas.add(test1);
		notas.add(test2);
	}
	

	public Tipo getExamen1() {
		return notas.get(0);
	}

	public Tipo getExamen2() {
		return notas.get(1);
	}

	public Tipo getExamen3() {
		return notas.get(2);
	}

	public Tipo getExamen4() {
		return notas.get(3);
	}

	public Tipo getExamen5() {
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
}
