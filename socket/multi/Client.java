package socket.multi;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by aq on 2/17/16.
 * A simple socket client that can send some message.
 */
public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader reader = null;
        PrintWriter writer = null;
        try {
            InetAddress address = InetAddress.getByName(null);
            socket = new Socket(address, 6000);

            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

            writer.println("Client says: Hello!");
            System.out.println(reader.readLine());

            Thread.sleep(60 * 1000);

            writer.println("Client says: Bye!");
            System.out.println(reader.readLine());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
                if (reader != null) {
                    reader.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
