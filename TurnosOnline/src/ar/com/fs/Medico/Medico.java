package ar.com.fs.Medico;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;

public class Medico {
	private Map <String,String> medico;
	private String ArchivoMedicos="D:\\ARCHIVOS TURNOS ONLINE\\medicos y especialidades.txt";
	
	/*
	 * como medico es una clase en la cual no vamos a crear cuenta ni iniciar sesion ni nada
	 * no me gasto en crear set, solo declaro el constructor y despues lo creo sacando de archivos
	 * de texto dichos datos (corte va a haber un .txt simulando una bdd donde estan los datos de los medicos
	 * y con un bufferedreader voy sacando y usando segun corresponda).  
	 * */
	
	public Map<String,String> getMedico( ) {
		return this.medico;
	}
	
	private void setMedicos() throws FileNotFoundException 
	{//puse el throws para que no tire error pero se que debo poner try catch
		
		File f = new File(ArchivoMedicos);	//objeto f= "esto es direccion de un archivo"
		Scanner s =new Scanner(f);//aca accedo al archivo
		
		//deberia ir try catch
		while(s.hasNextLine()){	//mientras haya cosas dentro del archivo , hacer lo de adentro
			String datosMedicos= s.nextLine();	//guardo en datosmedicos todo lo del archivo
			String[]nombres = datosMedicos.split(",");	
			for(int i=0; i<nombres.length;i++) {
				medico.put(nombres[0].trim(), nombres[1].trim());		//en teoria guardo dentro del map 'medico' <nombre,especialidad> de 
				//todos los medicos que estaban en el archivo
			}
		}
	}
}
