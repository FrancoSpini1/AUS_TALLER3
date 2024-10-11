package ar.com.fs.twosum;

import java.util.Scanner;

/*
 * @
 * Ejemplo: Resuelve el problema de "two sum" donde se te da un
 *  arreglo y un objetivo, y debes encontrar dos números que sumen 
 *  ese objetivo.
 * */
public class Principal {
	public static void main(String[] args) {
		//declaro arreglo de enteros de 10 valores
		int[] arr=new int[10];
		
		//cargo arreglo con valores[1,10]
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		/*aclarar que como el arreglo tiene [1,10] el mayor
		 * numero a sumar seria 19, y el menor seria el 2
		 * (contando que se pueden repetidos).*/
		
		//imprimo en pantalla arreglo
		for (int i : arr) {
			System.out.println(i);
		}
		Scanner k = new Scanner(System.in);
		System.out.println("ingrese numero obj:");
		int target = k.nextInt();
		TwoSum ts = new TwoSum();
		boolean b= ts.IsPossibleOrNot(arr,target);
		System.out.println("\n");
		if(b == true) {
			System.out.println("se pudo !!!!\n");
		}else {
			System.out.println("no se pudo :CCCC \n");
		}
		
		//listo me llevćo 15 min reloj hacer todo!!
	}
}
