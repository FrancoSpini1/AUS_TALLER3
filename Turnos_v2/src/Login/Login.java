package Login;

import java.util.*;
import java.io.*;
import java.util.Map.Entry;

import Turno.Turno;
import Usuario.Usuario;

public class Login {

    private String UsuarioArchivo = "usuarios.txt";

    public void login() {
        System.out.println("############## INICIO DE SESION ##############");
        Scanner k = new Scanner(System.in);
        boolean sesionIniciada = false; // Controla el flujo del do-while

        do {
            System.out.print("Ingrese su nombre de usuario >>> ");
            String nombreDeUsuario = k.nextLine();

            System.out.print("Ingrese su contraseña >>> ");
            String contrasena = k.nextLine();

            // Cargar usuarios del archivo
            Usuario us = new Usuario();
            us.cargarUsuarios();
            us.getUsuario();

            try (BufferedReader r = new BufferedReader(new FileReader(UsuarioArchivo))) {
                boolean credencialesCorrectas = false;
                for (Entry<String, String> u : us.getUsuario().entrySet()) {
                    if (nombreDeUsuario.equals(u.getKey()) && contrasena.equals(u.getValue())) {
                        System.out.println("¡Acceso concedido! Redirigiendo al portal de turnos...");
                        Turno t = new Turno();
                        t.SacarTurno();
                        credencialesCorrectas = true;
                        sesionIniciada = true; // Salir del bucle
                        break; // Salir del for
                    }
                }
                if (!credencialesCorrectas) {
                    System.out.println("Credenciales incorrectas. Inténtelo de nuevo.");
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo de usuarios: " + e.getMessage());
                break; // Salir del do-while en caso de error crítico
            }

            System.out.print("¿Desea intentar de nuevo? (sí = 1, no = 0): ");
            int opcion = -1;
            try {
                opcion = Integer.parseInt(k.nextLine());
                if (opcion == 0) {
                    sesionIniciada = true; // Salir del bucle
                    System.out.println("¡Adiós!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intente de nuevo.");
            }
        } while (!sesionIniciada);

        k.close();
    }
}

