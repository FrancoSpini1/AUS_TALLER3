package ar.com.fs.polimorfismo;

public class Ordenador {
	
	public void Ordenar(Ordenable[] array) {	
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i].compareTo(array[j])>0 ) {
					continue;
				}else if(array[i].compareTo(array[j])<0) {
					Ordenable tmp = array[i];
					 array[i]=array[j];
					 array[j]=tmp;	
				}else {		//aca los dos tienen la misma fecha de salida, es irrelevante 
					continue;
				}
			}
		}
		
	}

}
