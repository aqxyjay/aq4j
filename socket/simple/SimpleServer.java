package socket.simple;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by aq on 2/16/16.
 * A simple socket server.
 */
public class SimpleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6000);
        Socket socket = server.accept();

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

        System.out.println("Client send: " + reader.readLine());
        writer.println("Server send back.");
    }
}
