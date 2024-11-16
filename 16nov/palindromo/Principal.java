package palindromo;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Palindromo p1=new Palindromo();
		Scanner k=new Scanner (System.in);
		String p;
		System.out.println("ningrese una palabra >>");
		p=k.nextLine();
		System.out.println(p1.isPalindromo(p));
		
	}
}
