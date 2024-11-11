package practica1;

public class Alumno extends Persona{
	private int matricula;
	private int [] calificaciones;
	public Alumno(String nombre, int edad, int dni,int matricula,int[] calificaciones) {
		super(nombre, edad, dni);
		this.matricula= matricula;
		this.calificaciones=calificaciones;
	}
	
	public float calcularProm() {
		int notaAcum=0;
		for (int i = 0; i < calificaciones.length; i++) {
			notaAcum+=calificaciones[i];
		}	
		return notaAcum/calificaciones.length;
	}
	
	public void soyAlumno() {
		System.out.println("soy un alumno");
	}
}
