package principal;

import java.io.File;
import java.util.Scanner;
import buscador.Buscador;
import hilos.Hilos;

public class Principal {
	public static void main(String[] args) {
		System.out.println("!!!!!!!!!!!! BIENVENIDO A BUSCADOR DE ARCHIVOS !!!!!!!!!!!!");
		Scanner f = new Scanner(System.in);
		System.out.println("ingrese el nombre del archivo que desee buscar >");
		String nombre=f.nextLine();
//		Buscador b1 = new Buscador();
		
//		b1.buscarArchivo(new File("/home/"),nombre);
		
		Hilos h1 =  new Hilos(new File("/home/"),nombre);
		Hilos h2 =new Hilos(new File("/home/"),nombre);
		
		Thread t1= new Thread(h1);
		Thread t2=new Thread(h2);
		
//		t1.start();
		t2.start();
		
	}
}
