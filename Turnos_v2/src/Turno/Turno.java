package Turno;
import java.io.*;
import java.util.*;

import Medico.Medico;
import Usuario.Usuario;

public class Turno {
    private String TurnoArchivo = "turnos.txt"; // Archivo para guardar turnos

    public void SacarTurno() {
        Scanner k = new Scanner(System.in);
        Usuario u = new Usuario(); // Suponiendo que contiene información del usuario logueado
        Medico m = new Medico();   // Suponiendo que contiene información de médicos disponibles

        String nombreM, especialidad;
        System.out.println("Escriba el nombre del médico para el turno: ");
        nombreM = k.nextLine().trim();
        System.out.println("Escriba la especialidad del médico: ");
        especialidad = k.nextLine().trim();

        // Buscar médico en el mapa
        Map<String, String> medicos = m.getMedico(); 
        boolean medicoEncontrado = false;

        for (Map.Entry<String, String> entry : medicos.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(nombreM) && entry.getValue().equalsIgnoreCase(especialidad)) {
                medicoEncontrado = true;
                System.out.println("Ingrese la fecha para el turno (formato DD/MM/AAAA): ");
                String fecha = k.nextLine().trim();

                // Guardar el turno en el archivo
                try (BufferedWriter w = new BufferedWriter(new FileWriter(TurnoArchivo, true))) {
                    w.write("Usuario: " + u.getUsuario().keySet().iterator().next() + ", Fecha: " + fecha + ", Médico: " + nombreM);
                    w.newLine();
                    System.out.println("Turno guardado exitosamente.");
                } catch (IOException e) {
                    System.out.println("Error al guardar el turno: " + e.getMessage());
                }
                break;
            }
        }

        if (!medicoEncontrado) {
            System.out.println("El médico no fue encontrado o los datos ingresados son incorrectos. Intente nuevamente.");
        }
    }
}

