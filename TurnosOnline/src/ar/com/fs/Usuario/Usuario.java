package ar.com.fs.Usuario;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Usuario {
	private Map<String, String> usuario = new HashMap<String, String>();
	private String UsuarioArchivo= "D:\\ARCHIVOS TURNOS ONLINE\\usuarios.txt";
	private String DatosArchivo = "D:\\ARCHIVOS TURNOS ONLINE\\datos de usuarios.txt";
	private String NombreCompleto;
	private int DNI;
	private String mail;
	private int telefono;
	
	private void GraboUsuario() {//cargo mis datos (por si en menu principal elijo opcion 3)
		/*
		 * grabo mis datos en un bloc de notas(disco);
		 * la finalidad de este metodo es tener mis datos personales en un bloc llamado
		 * "datos personales " o algo asi (guardando tambien mi usuario y pasword, y de ahi comparo
		 * para tener acceso a ellos asi despues en el futuro poder editarlos si quiero)
		 * */
		this.CargoMap();		//estos son para usuario y contraseña
		this.GraboMap();		//esto es para guardar en usuario el usuario :v
		this.CargoDatos();		
		this.GraboDatos();
	}
	
	private void EditoDatos() {
		/*
		 * segun mis datos (que estarian en disco), los modifico a gusto
		 * OJO (hay que verificar que no se repitan los usuarios)
		 * */
	}

	public Map<String, String> getUsuario(/*String user,String password*/) {		//me sirve pal login
		return usuario;
	}
	
	public void CrearUsuario() {
		
	}
	
	private void CargoMap() {			//lo vi de chatGPT, perdon no soy un santo :v
		Scanner k=new Scanner(System.in);
		System.out.println("ingrese nombre de usuario:");
		String NombreUsuario=k.next();
		System.out.println("\ningrese contraseña:");
		String contraseña= k.next();
		this.usuario.put(NombreUsuario, contraseña);		//aca guardó un usuario y password en map
		System.out.println(this.usuario.size());
	}
	
	private void GraboMap() {//lo vi de chatGPT, perdon no soy un santo :v
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(UsuarioArchivo))) {//esto es pa escribir el archivo
            for (Map.Entry<String, String> entry : usuario.entrySet()) {	//parece un foreach
                writer.write(entry.getKey() + "," + entry.getValue());	//escribo
                writer.newLine();
            }
            System.out.println("Usuarios guardados en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar usuario: " + e.getMessage());
        }
	}
	
	private void CargoDatos() {	//esto seria basicamente para la base de datos, no tiene sentido para lo que yo quiero
		Scanner k= new Scanner(System.in);
		System.out.println("ingrese su nombre:");
		this.NombreCompleto=k.nextLine();
		System.out.println("\ningrese su dni:");
		this.DNI=k.nextInt();
		System.out.println("\ningrese su mail:");
		this.mail=k.next();
		System.out.println("\ningrese telefono:");
		this.telefono=k.nextInt();		
	}
	private void GraboDatos() {
		try(BufferedWriter w=new BufferedWriter (new FileWriter(DatosArchivo))) {
			this.GraboMap();
			w.write(this.NombreCompleto);
			w.write(this.DNI);
			w.write(this.mail);
			w.write(this.telefono);
			System.out.println("datos de usuario guardados en el archivo.");
		} 
		catch (IOException e) {
			 System.out.println("Error al guardar datos de usuario: " + e.getMessage());
		}
	}
	
}
