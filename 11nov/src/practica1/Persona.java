package practica1;

public class Persona {
	private String nombre;
	private int edad;
	private int dni;
	
	public Persona(String nombre, int edad ,int dni) {
		this.dni=dni;
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public void soyPersona() {
		System.out.println("soy una persona");
	}
	
}
