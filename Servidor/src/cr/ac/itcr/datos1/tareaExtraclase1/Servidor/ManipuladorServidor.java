package cr.ac.itcr.datos1.tareaExtraclase1.Servidor;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ManipuladorServidor extends Thread{

    private final Socket clienteSocket;

    public ManipuladorServidor(Socket clienteSocket) {
        this.clienteSocket = clienteSocket;
    }

    public void run(){
        try {
            manipuladorDeConexionDeClientes();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private void manipuladorDeConexionDeClientes() throws IOException, InterruptedException {
        InputStream inputStream = clienteSocket.getInputStream();
        OutputStream outputStream = clienteSocket.getOutputStream();

        BufferedReader lector = new BufferedReader(new InputStreamReader(inputStream));
        String linea;
        while((linea = lector.readLine()) != null){
            if ("quit".equalsIgnoreCase(linea)) {
                break;
            }
            String mensaje = "Escribiste" + linea;
            outputStream.write(mensaje.getBytes());
        }

        clienteSocket.close();
    }
}
