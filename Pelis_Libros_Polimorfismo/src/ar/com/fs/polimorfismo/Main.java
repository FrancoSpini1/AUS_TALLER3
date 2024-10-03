package ar.com.fs.polimorfismo;

public class Main {
	public static void main(String[] args) {
		Ordenable[] pep=new Libros[3];
		pep[0]=new Libros("libro de hierbas",1982,110);
		pep[1]=new Libros("libro de cocina",1999,39);
		pep[2]=new Libros("manual de Java",1976,561);
		
		Ordenador o=new Ordenador();
		
		//ordenar el arreglo
		o.Ordenar(pep);
		
		//hacer dowcast de pep para luego usar metodo getaño() e imprimir
			
				
				
		if(pep instanceof Ordenable[]) {
			Libros[] l1 = (Libros[])pep;
			for (Libros l : l1) {
				System.out.println(l.getAño());
			}
		}
			
			
		
		
	}
}
