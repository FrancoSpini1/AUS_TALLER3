package numerosduplicados;
/*Implementa un método que identifique si hay números duplicados en un arreglo de enteros.
*/
public class NumerosDuplicados {
	
	public boolean ArrayNumerosDuplicados(int[] arr){
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		
		if (count > arr.length) {
			return true;
		}
		return false;
	}	
	
}
