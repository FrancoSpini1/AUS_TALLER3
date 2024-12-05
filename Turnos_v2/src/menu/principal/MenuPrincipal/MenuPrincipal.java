package menu.principal.MenuPrincipal;
import java.util.InputMismatchException;
import java.util.Scanner;

import Login.Login;
import Usuario.Usuario;
public class MenuPrincipal {
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner k = new Scanner(System.in);
        int opcion = -1;

        System.out.println("############## MENU PRINCIPAL ##############");
        System.out.println("Elija que quiere hacer: \n");
        System.out.println("1- Iniciar sesión.\n");
        System.out.println("2- Crear Cuenta.\n");
        System.out.println("3- Salir del sitio.\n");

        do {
            try {
                System.out.print(">>>> ");
                opcion = k.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Iniciando sesión...");
                        Login l = new Login();
                        l.login();
                        break;

                    case 2:
                        System.out.println("Creando cuenta...");
                        Usuario u = new Usuario();
                        u.CrearUsuario();
                        break;
//                        lo malo de crear cuenta, es que no hice ninguna implementacion que trate el tema de "relacionar" los datos de usuarios con los usuarios
//                        en si (en mi opinion creo que si supiera implementar bdd, seria mas facil)
                    case 3:
                        System.out.println("¡Adiós!");
                        break;

                    default:
                        System.out.println("Opción incorrecta. Por favor, intente nuevamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                k.nextLine(); // Limpiar el buffer
            }
        } while (opcion != 3);

        k.close();
    }
}

