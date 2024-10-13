package sumopares;
/*Escribe un método que reciba un arreglo de enteros y devuelva la suma de todos los números pares.

*/
public class SumoPares {

	public int SumarParesArray(int[] p) {
		int sumador =0;
		for (int i = 0; i < p.length; i++) {
				if(p[i]%2 ==0) {
					sumador =sumador + p[i];
				}else {
					continue;
				}
		}
		return sumador;
	}
	
}
