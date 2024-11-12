package practica1;
/*sistema de gestion de estudiantes
 * Descripción: Crea una jerarquía de clases para representar un sistema de gestión de estudiantes. Deberás tener una 
 * clase base Persona con atributos comunes (nombre, edad, etc.) y luego una clase 
 * Estudiante que herede de Persona y tenga atributos adicionales como número de matrícula y promedio de calificaciones.
 * */
public class Principal {
	public static void main(String[] args) {
		Persona p1=new Persona("Franc spini",24,44333445);
		int[] puchaino= new int[8];
		for (int i = 0; i < puchaino.length; i++) {
			puchaino[i]=(int)(Math.random()*10);
		}
		Alumno a1 = new Alumno("Franco spini",24,44333553,2343,puchaino);
		
		p1.soyPersona();
		a1.soyAlumno();
		a1.soyPersona();
		System.out.println(a1.calcularProm());
	}
}
