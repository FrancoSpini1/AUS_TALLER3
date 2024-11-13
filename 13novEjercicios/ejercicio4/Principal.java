package ejercicio4;

public class Principal {
	public static void main(String[] args) {
		int[] notes=new int[8];
		for (int i = 0; i < notes.length; i++) {
			notes[i]=(int) (Math.random()*10+1);
		}
		Promedio pr=new Promedio();
		System.out.println(pr.calcularPromedio(notes));
	}
}
