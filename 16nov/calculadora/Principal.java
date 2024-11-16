package calculadora;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Calculadora c1=new Calculadora();
		float n1=0;
		float n2=0;
		String op;
		Scanner k=new Scanner(System.in);
		System.out.println("ingrese numero1>>");
		n1=k.nextFloat();
		System.out.println("ingrese la operacion >>");
		op=k.next();
		System.out.println("ingrese numero2>>");
		n2=k.nextFloat();
		switch (op) {
		case "+":
			System.out.println(c1.sumar(n1, n2));
			break;
		case "-":
			System.out.println(c1.restar(n1,n2));
			break;
		case "*":
			System.out.println(c1.multiplicar(n1,n2));
			break;
		case "/":
			try {
				System.out.println(c1.dividir(n1, n2));
			} catch (DividoPorCeroException e) {
				System.out.println("no se puede dividir por cero");
			}
			break;
		default:
			break;
		}

	}
}
