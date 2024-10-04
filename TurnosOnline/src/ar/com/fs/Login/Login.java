package ar.com.fs.Login;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;
import ar.com.fs.Usuario.Usuario;

public class Login {
	
	private String UsuarioArchivo= "D:\\ARCHIVOS TURNOS ONLINE\\usuarios.txt";
	
	public void login() {
		System.out.println("############## INICIO DE SESION ##############");
		Scanner k= new Scanner(System.in);
		String NombreDeUsuario;
		String Contraseña ;
		int i;
		Usuario us=new Usuario();
		do {
			System.out.println("Ingrese su nombre de usuario >>>");
			NombreDeUsuario = k.next();
			System.out.println("\n");
			System.out.println("Ingrese su contraseña >>>");
			Contraseña = k.next();
			/*
			 * algoritmo que busque si tanto usuario como contraseña se encuentra en el archivo 
			 * "usuarios", pues resulta que si no los encuentra es porque
			 * o no está o ingresó mal sus datos :v (ahi tiro un break salvaje). Y en el caso de que esté que vaya al portal 
			 * de turnos (otro quilombito mas);
		     */
			
			us.getUsuario();	//tengo todos los usuarios del archivo 'usuarios.txt'(teoricamente)
			try(BufferedReader r=new BufferedReader(new FileReader(UsuarioArchivo)) ) {
				for (Entry<String,String> u : us.getUsuario().entrySet()) {
					if(NombreDeUsuario == u.getKey() && Contraseña == u.getValue()) {
						/*
						 * urra! conseguiste entrar al portal de turnos!!!
						 * crear objeto  instacia Turno t y lamar metodo sacarTurno();
						 * */
					}else {
						System.out.println("no pudiste pa,hacelo de vuelta\n");
					}
				}
			} catch (IOException e) {
				// TODO: handle exception
			}
			System.out.println("presione '0' >>>");		//esto es para cerrar el do-while
			i=k.nextInt();
			if(i==0)
				System.out.println("adiooos!!!!");
		} while (i != 0);
	}
}
