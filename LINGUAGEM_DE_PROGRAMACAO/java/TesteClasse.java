import java.io.IOException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.WebSocket;

public class TesteClasse {

    private static Socket accept;

    public static void main(String[] args) throws InterruptedException, IOException {


        ServerSocket server = new ServerSocket(2230);

        accept = server.accept();
    }
}