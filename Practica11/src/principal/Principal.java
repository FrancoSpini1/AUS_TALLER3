package principal;
/*
 * hice practica con chatGPT, pidiendole que me pase ejercicios de pruebas tecnicas
 * (no se si seran tan sencillas, espero que si)
 * en cada clase estara la consigna detallada de lo que c/funcion debe hacer
 * */
import palindromo.Palindromo;
import inversor.Invertir;
import cuentovocales.CuentaVocales;
import sumopares.SumoPares;
import numerosduplicados.*;

public class Principal {

	public static void main(String[] args) {
		Palindromo palin = new Palindromo();
		System.out.println(palin.esPalindromo(""));
		
		Invertir inv = new Invertir();
		System.out.println(inv.invertirPalabras("hola mundo"));
		
		CuentaVocales cv = new CuentaVocales();
		System.out.println(cv.ContadorDeVocales("señoriA"));
		
		SumoPares sp = new SumoPares();
		int [] arr = new int[6];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;	
		arr[4]=5;
		arr[5]=6;
			
		System.out.println(sp.SumarParesArray(arr));
		
		
		int[] arr1=new int[6];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=2;
		arr1[3]=3;	
		arr1[4]=1;
		arr1[5]=5;
		
		NumerosDuplicados nd = new NumerosDuplicados();
		System.out.println(nd.ArrayNumerosDuplicados(arr1));
		
		
	}
}
