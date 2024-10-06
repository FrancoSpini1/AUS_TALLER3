package ar.com.fs.Turno;

import java.io.*;
import java.util.Scanner;
import ar.com.fs.Usuario.Usuario;
import ar.com.fs.Medico.Medico;
import java.util.*
;
import java.util.Map.Entry;public class Turno {
	private String TurnoArchivo = "D:\\ARCHIVOS TURNOS ONLINE\\turnos.txt"; // esto lo uso para guardar los turnos que saco
	
	public void SacarTurno() {
		Usuario u=new Usuario();		//lo uso para obtener sus datos,nombre y apellido y grabarlo en turnos.txt
		Medico m = new Medico();	//lo uso para ver si el que ingrese por teclado está o no(y grabar su nombre en turnos.txt);
		Scanner k =new Scanner(System.in);
		String nombreM;
		String especialidad;
		System.out.println("escriba el nombre del medico que quiere sacar turno: ");
		nombreM=k.nextLine();
		System.out.println("\nescriba el nombre del medico que quiere sacar turno: ");
		especialidad=k.nextLine();
		
		/*si nombre medico y especialidad estan dentro del map, ahi "ingreso" el la fecha que quiero que sea el turno
		 * (el dia del mañana veremos como hacemos la implementacion de eso con profundidad);
		 * */
		if(nombreM == ((Entry)m.getMedico()).getKey() && especialidad == ((Entry) m.getMedico()).getValue()) {
			//escribo en archivo turnos.txt usuario + fecha + medico
			System.out.println("ingresar la fecha que desee como turno: ");
			String fecha= k.nextLine();
			System.out.println("\n");
			try(BufferedWriter w=new BufferedWriter (new FileWriter(TurnoArchivo)) ){
				w.write((String)((Entry)u.getUsuario()).getKey()+","+fecha+","+(String)((Entry)m.getMedico()).getKey());
			}catch (IOException e) {
				System.out.println("no se pudo acceder al archivo turnos, no pudimos guardarlo.\n");
			}
		}else {
			/*si llegaste aca, es porque no ingresaste bien los datos o el medico no existe en la planilla,
			 * crear una implementacion que te permita ingresar de nuevo*/
			System.out.println("");
		}
	}
	
}
