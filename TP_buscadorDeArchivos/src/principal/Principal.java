package principal;
import java.io.*;
import buscador.*;
import hilos.Hilos;
import java.util.*;

public class Principal {
	public static void main(String[] args) {
		File src=new File("/home/");
		System.out.println("ingresar el nombre de lo que desea buscar");
		Scanner k= new Scanner(System.in);
		String archivo= k.nextLine();
		Buscador b = new Buscador();
		Hilos h1 =new Hilos(b,src,archivo);
		Thread t1=new Thread(h1);
//		try {
//			t1.start();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		de momento conseguimos hacer funcionar la clase buscador, con escepciones y un hilo.
//		la idea es implementar mas hilos(cuyo constructor reciba mismos argumentos,) sincronizar dichos hilos 
//		y hacer que salga por pantalla el mensajito de archivo encontrado lo mas rapido posible, pero eso lo hago
//		en otro momento
		Hilos h2 =new Hilos(b,src,archivo);
		Thread t2=new Thread(h2);
		Hilos h3=new Hilos(b,src,archivo);
		Thread t3=new Thread(h3);
		Hilos h4=new Hilos(b,src,archivo);
		Thread t4=new Thread(h4);
		
		t1.start();
		t2.start();
		t4.start();
		t3.start();
		
		
		
	}
}
