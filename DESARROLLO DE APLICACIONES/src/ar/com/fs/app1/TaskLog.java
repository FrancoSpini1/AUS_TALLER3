package ar.com.fs.app1;

import java.io.IOException;
import java.util.Scanner;

public class TaskLog {
	/*
	 *aplicacion de consola simple que permite a los usuarios
	 *registrar y visualizar tareas pendientes
	 * */
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Scanner k = new Scanner (System.in);
		int o;
		System.out.println("$$$$$$$$$$$ BIENVENIDO AL REGISTRO DE TAREAS $$$$$$$$$$$\n");
		Tarea t ;
		t = new Tarea();
		do {
			System.out.println("si quiere registrar una tarea pulse 1.\n");
			System.out.println("si quiere visualizar una tarea pulse 2.\n");
			System.out.println("si quiere cerrar el programa pulse 3.\n");
			o = k.nextInt();
			
			switch (o) {
			case 1:
				t.RegistrarTarea();
				break;
			case 2:
				t.verTarea();
				break;
			case 3:
				System.out.println("adios.\n");
				/*quisiera saber como limpiar la consola con un metodo de Java*/
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				break;
			}
		}while(o != 3);
		/*termine, a ver, no se porque al intentar visualizar mi tarea, solo pasa si ingreso el nombre, pero si ingreso nombre mas apellido
		 * tira null, asi que debo ver eso. esta prueba tecnica me llevo mucho tiempo (2 horas y 15 min), nada mal che*/
	}
}
