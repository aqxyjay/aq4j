package socket.simple;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by aq on 2/16/16.
 * A simple socket client.
 */
public class SimpleClient {
    public static void main(String[] args) throws IOException {
        InetAddress address = InetAddress.getByName(null);
        Socket socket = new Socket(address, 6000);

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

        writer.println("Hello, Server.");
        System.out.println("Server reply: " + reader.readLine());
    }
}
