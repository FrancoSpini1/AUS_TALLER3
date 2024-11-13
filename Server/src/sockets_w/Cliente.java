package sockets_w;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
public class Cliente {
    public static void main( String args[] ) throws IOException {
        int c;
        Socket s;
        InputStream sIn;

        // Abrimos una conexión con breogan en el puerto 4321
        try {
            s = new Socket( "breogan",4321 );
        } catch( IOException e ) {
            System.out.println( e );
            }

        // Obtenemos un controlador de fichero de entrada del socket y
        // leemos esa entrada
        sIn = s.getInputStream();
        while( ( c = sIn.read() ) != -1 )
            System.out.print( (char)c );
    
        // Cuando se alcance el fin de fichero, cerramos la conexión y
        // abandonamos
        s.close();
        }
}
