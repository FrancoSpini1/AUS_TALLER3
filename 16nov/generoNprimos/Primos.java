package generoNprimos;
import java.util.*;
import java.lang.*;

public class Primos {

	public int[] generarPrimos(int n1, int n2) {
		int[] listanumeros=new int[n2];
		int[] listaPrimos=new int[n2];
		for (int i = 0; i < n2; i++) {
			listanumeros[i]=i+1;
		}
		for (int i = 0; i < listanumeros.length; i++) {
			if(isPrimo(listanumeros[i])==true) {
				listaPrimos[i]=listanumeros[i];
			}
		}
		return listaPrimos;
	}
	
	private boolean isPrimo(int primo) {
		int contador=0;
		for (int i = primo; i > 0; i--) {
			if(primo%i==0) {
				contador++;
			}
		}
		if(contador ==2) {
			return true;
		}
			return false;
	}

}
