package ar.com.fs.primo;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int nro;
		Scanner k = new Scanner(System.in);
		System.out.println("Ingrese un numero >>>");
		nro=k.nextInt();
		Primo p = new Primo();
		System.out.println("\n");
		p.EsPrimo_o_No(nro);
	}	
}
