package socket.multi;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by aq on 2/17/16.
 * A socket server that support multi clients to connect.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(6000);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
