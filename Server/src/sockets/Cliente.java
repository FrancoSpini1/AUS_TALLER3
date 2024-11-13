package sockets;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
public class Cliente {
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("localhost",5555);
//		si la conexion es exitosa el accept del server se fdesbloquea y tengo un 
//		socket en server que hace referencia al cliiente
		InputStream is;
		is=s.getInputStream();
		OutputStream os = s.getOutputStream();
		InputStreamReader isr=new InputStreamReader(is);
		OutputStreamWriter osw=new OutputStreamWriter (os);
		BufferedReader br = new BufferedReader(isr);
		String line;
		Scanner so = new Scanner(is);
		//revisar !!!! (y mirar clases de esto de ser posible)
		while(so.hasNextLine()) {
			System.out.println(so.nextLine());
		}
		
	}
}
