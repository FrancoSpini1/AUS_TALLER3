package ejercicio2;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("ingresar que queres? convertir a ferenheit(f) o celcius(c)?");
		String e=k.nextLine();
		Conversor c=new Conversor();
		if(e.equals("c")) {
			c.convertirACelcius();
		}else {
			c.convertirAFarenheit();
		}
	}
}
