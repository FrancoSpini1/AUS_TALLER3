package sockets_w;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main( String args[] ) {
        ServerSocket s = (ServerSocket)null;
        Socket s1;
        String cadena = "Tutorial de Java!";
        int longCad;
        OutputStream s1out;

        // Establece el servidor en el socket 4321 (espera 300 segundos)
        try {
            s = new ServerSocket( 4321,300 );
        } catch( IOException e ) {
            System.out.println( e );
            }

        // Ejecuta un bucle infinito de listen/accept
        while( true ) {
            try {
                // Espera para aceptar una conexión
                s1 = s.accept();
                // Obtiene un controlador de fichero de salida asociado
                // con el socket
                s1out = s1.getOutputStream();

                // Enviamos nuestro texto
                longCad = sendString.length();
                for( int i=0; i < longCad; i++ )
                    s1out.write( (int)sendString.charAt( i ) );

                // Cierra la conexión, pero no el socket del servidor
                s1.close();
            } catch( IOException e ) {
                System.out.println( e );
                }
            }
        }
}
