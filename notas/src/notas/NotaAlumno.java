package notas;

import java.util.*;


public class NotaAlumno{
	public static Scanner tec=new Scanner(System.in);
	protected double nota_global;
	protected double nota;
	
	private String nombre;
	private String apellidos;
	private String nia;
	
	ArrayList <NotaAlumno> notas = new ArrayList <NotaAlumno>(8);
	
	public NotaAlumno() {
		
	}
	
	@Override
	public String toString() {
		return "Notas= [" + notas + "], nota global= "+nota_global;
	}

	public void ingresarNotas() {
		System.out.println("Por favor, ingrese las notas.");
		System.out.print("Nota 1: ");
		notas.add(new Clasico(tec.nextDouble()));
		System.out.print("Nota 2: ");
		notas.add(new Clasico(tec.nextDouble()));
		System.out.print("Nota 3: ");
		notas.add(new Clasico(tec.nextDouble()));
		System.out.print("Nota 4, ingrese correctas, incorrectas y no contestadas: ");
		notas.add(new Test(tec.nextInt(),tec.nextInt(),tec.nextInt()));
		System.out.print("Nota 5, ingrese correctas, incorrectas y no contestadas: ");
		notas.add(new Test(tec.nextInt(),tec.nextInt(),tec.nextInt()));
		System.out.println("Trabajo 1, ingrese estado y dias de retraso: ");
		notas.add(new Trabajo(tec.nextBoolean(),tec.nextInt()));
		System.out.println("Trabajo 2, ingrese estado y dias de retraso: ");
		notas.add(new Trabajo(tec.nextBoolean(),tec.nextInt()));
		System.out.println("Trabajo 3, ingrese estado y dias de retraso: ");
		notas.add(new Trabajo(tec.nextBoolean(),tec.nextInt()));
		calcNotaGlobal();
	}

	public NotaAlumno getExamen1() {
		return notas.get(0);
	}

	public NotaAlumno getExamen2() {
		return notas.get(1);
	}

	public NotaAlumno getExamen3() {
		return notas.get(2);
	}

	public NotaAlumno getExamen4() {
		return notas.get(3);
	}

	public NotaAlumno getExamen5() {
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
		if (!(nota_global==3)) {
			nota_global=calcExam1()+calcExam2()+calcExam3()+calcExam4()+calcExam5();
		}
	}
	public double getNota_global() {
		return nota_global;
	}
	public void setNota_global(double nota_global) {
		this.nota_global = nota_global;
	}
	
}
