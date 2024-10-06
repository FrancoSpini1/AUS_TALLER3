package ar.com.fs.MainMenu;
import java.util.Scanner;
import ar.com.fs.Login.*;
import ar.com.fs.Usuario.Usuario;
public class MenuPrincial {
	public static void main(String[] args) {
		System.out.println("############## MENU PRINCIPAL ##############");
		System.out.println("Elija que quiere hacer: \n");
		System.out.println("1- Iniciar sesión.\n");
		System.out.println("2- Crear Cuenta. \n");
		System.out.println("3- Salir del sitio.\n");
		Scanner k = new Scanner(System.in);
		int i ;
		do {
			System.out.println(">>>>");
			i= k.nextInt();
			if(i == 1) {
				System.out.println("go to sign in ");
				Login l = new Login();
				l.login();
			}else if(i == 2) {
				System.out.println("Create an account");
				/*
				 * creo un objeto instancia Usuario llamado u que llame metodo "crearUsuario" asi graba todo en la puchaina
				 * */
				Usuario u=new Usuario();
				u.CrearUsuario();
			}else if(i==3) {
				System.out.println("adios!");
				break;
			}else {
				System.out.println("elegiste mal campeon");
			}
		} while (i != 3 );
	}
}
