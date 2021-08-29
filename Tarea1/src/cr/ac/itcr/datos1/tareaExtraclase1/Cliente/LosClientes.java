package cr.ac.itcr.datos1.tareaExtraclase1.Cliente;

import java.io.*;
import java.net.Socket;

public class LosClientes {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9000);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        String str2 = "";
        while(!str.equalsIgnoreCase("stop")){
            str = bufferedReader.readLine();
            dataOutputStream.writeUTF(str);
            dataOutputStream.flush();
            str2 = dataInputStream.readUTF();
            System.out.println("Server says" + str2);
        }
        dataOutputStream.close();
        socket.close();
    }
}
