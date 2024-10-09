package ar.com.fs.app1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tarea {
	private String ArchivoDeTareas = "D:\\Archivo de tareas\\tareas.txt";
	private File ArchivodeTareas = new File("D:\\Archivo de tareas\\tareas.txt");

	private Map<String,String> UsuarioTareas= new HashMap<String, String>();
	
	public void RegistrarTarea() {
		System.out.println("$$$$$$$$$$$ INGRESANDO AL REGISTRO DE TAREAS $$$$$$$$$$$ \n");
		/*ingresar un String (la tarea en cuestion) y que se guarde en el archivo 'tareas',con mi nombre y apellido
		 * (deberia guardarlo en un map<String,String> key = nombre y apellido, value= tarea)*/
		this.CargoMap();
		this.GraboMap();
		
	}

	private void CargoMap() {
		Scanner k = new Scanner(System.in);
		String NyA;
		String T;
		System.out.println("ingrese su nombre y apellido >>>");
		NyA=k.nextLine();
		System.out.println("ingrese la tarea que desee registrar >>>");
		T = k.nextLine();
		this.UsuarioTareas.put(NyA, T);
	}
	
	private void GraboMap() {
		try (BufferedWriter w = new BufferedWriter(new FileWriter(ArchivoDeTareas))) {
			for (Map.Entry<String,String> p : this.UsuarioTareas.entrySet()) {
				w.write(p.getKey()+","+p.getValue());
				w.newLine();
			}
			System.out.println("su tarea se registro exitosamente.\n");
		} catch (IOException e) {
			System.out.println("no se pudo registrar su tarea"+e.getMessage());
		}
	}

	public void verTarea() {
		Scanner k= new Scanner(System.in);
		String nombre;
		System.out.println("ingrese su nombre y apellido(y vemos su tarea correspondiente).\n");
		System.out.println(">>>");
		nombre=k.nextLine();
		File archivo = new File(ArchivoDeTareas);		//use chatgpt para esto solo carajo, que bronca
		try {
			Scanner f = new Scanner(archivo);
			while(f.hasNextLine()) {
				String tmp = f.nextLine();
				String[] divido = tmp.split(",");
				UsuarioTareas.put(divido[0], divido[1]);
			}
			System.out.println(UsuarioTareas.get(nombre));
		} catch (Exception e) {
			System.out.println("no se pudo acceder al archivo("+e.getMessage()+")"+"\n");
		}
	}	
	
}
