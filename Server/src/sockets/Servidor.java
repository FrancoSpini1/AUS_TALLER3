package sockets;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(5555);
		//referencia al localhost
		Socket  s;
		InputStream is ;
		//(del cliente)sale por aca
		OutputStream os;
			s=ss.accept();
			is=s.getInputStream();
			os=s.getOutputStream();
			InputStreamReader isr=new InputStreamReader(is);
			OutputStreamWriter osw=new OutputStreamWriter (os); 
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("Hola");
			bw.newLine();
            bw.flush();
			ss.close();

	}
}
