package Usuario;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Usuario {
    private Map<String, String> usuario = new HashMap<>();
    private final String UsuarioArchivo = "usuarios.txt";
    private final String DatosArchivo = "datos de usuarios.txt";
    private String NombreCompleto;
    private int DNI;
    private String mail;
    private int telefono;

    public void CrearUsuario() {
        CargoMap();
        GraboMap();
        CargoDatos();
        GraboDatos();
    }

    private void CargoMap() {
        Scanner k = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario:");
        String NombreUsuario = k.nextLine();
        System.out.println("Ingrese contraseña:");
        String contraseña = k.nextLine();
        this.usuario.put(NombreUsuario, contraseña);
        System.out.println("Usuario cargado.");
    }

    private void GraboMap() {//guarda en archivo usuarios.txt los users y contraseñas, nada mas
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(UsuarioArchivo, true))) { // Modo append
            for (Map.Entry<String, String> entry : usuario.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue());
                writer.newLine();
            }
            System.out.println("Usuario guardado correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar usuario: " + e.getMessage());
        }
    }
    
    public void cargarUsuarios() {
    	try(BufferedReader br=new BufferedReader(new FileReader("usuarios.txt"))){
    		String linea;
    		while((linea = br.readLine()) != null) {
    			String[]partes = linea.split(",");
    			if(partes.length == 2) {
    				usuario.put(partes[0].trim(), partes[1].trim());
    			}
    		}
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    }

    private void CargoDatos() {
        Scanner k = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo:");
        this.NombreCompleto = k.nextLine();
        System.out.println("Ingrese su DNI:");
        this.DNI = Integer.parseInt(k.nextLine());
        System.out.println("Ingrese su email:");
        this.mail = k.nextLine();
        System.out.println("Ingrese su teléfono:");
        this.telefono = Integer.parseInt(k.nextLine());
    }

    private void GraboDatos() {
        try (BufferedWriter w = new BufferedWriter(new FileWriter(DatosArchivo, true))) { // Modo append
            w.write("Nombre: " + this.NombreCompleto + "\n");
            w.write("DNI: " + this.DNI + "\n");
            w.write("Email: " + this.mail + "\n");
            w.write("Teléfono: " + this.telefono + "\n");
            w.newLine();
            System.out.println("Datos del usuario guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar datos del usuario: " + e.getMessage());
        }
    }

    public Map<String, String> getUsuario() {
        return usuario;			//retorna direccion de memoria, pero los datos internos???
    }

    private void EditoDatos() {
        // Aquí puedes implementar lógica para leer los archivos y permitir modificaciones.
    }
}


