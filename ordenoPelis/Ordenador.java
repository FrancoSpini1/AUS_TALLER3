package ar.com.polimorfismo.ordenoPelis;

public class Ordenador {
	public static void Ordenar(Ordenable[] arr) {
		for (int i = 0; i < arr.length; i++) {
			Ordenable temp = null;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j])==1){
					continue;
				}else if(arr[i].compareTo(arr[j])==-1) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}else{
					continue;
				}		
			}
		}
	}
	
}
