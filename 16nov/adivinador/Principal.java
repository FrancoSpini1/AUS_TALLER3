package adivinador;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		GeneradorRandom ran=new GeneradorRandom();
		int n1,n2,n;
		Scanner k= new Scanner (System.in);
		System.out.println("ingrese desde donde >>");
		n1=k.nextInt();
		System.out.println("ahasta donde >>");
		n2=k.nextInt();
		int random=ran.generoNumRandom(n1, n2);
		System.out.println("ahora ingresa el numero que crees que salio >>");
		do {
			n=k.nextInt();
			if(random < n+3 || random > n-3) {
				System.out.println("casi, intentá de nuevo >>");
			}
		} while (n != random);
		System.out.println(random);
		System.out.println("ganaste!!");
	}
}
