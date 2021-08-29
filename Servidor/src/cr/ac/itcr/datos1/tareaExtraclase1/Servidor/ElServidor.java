package cr.ac.itcr.datos1.tareaExtraclase1.Servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;

public class ElServidor {
    public static void main(String[] args) {
        int port = 5000;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while(true) {
                System.out.println("Esperando la conección del cliente");
                Socket clienteSocket = serverSocket.accept();
                System.out.println("Se acepto la conección del cliente"+clienteSocket);
                OutputStream outputStream = clienteSocket.getOutputStream();
                outputStream.write("Hello World\n".getBytes());
                clienteSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
