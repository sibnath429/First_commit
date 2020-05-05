

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;
public class java8087 {
    private Socket socket;
    private Scanner scanner;
    private java8087(InetAddress serverAddress, int serverPort) throws Exception {
        this.socket = new Socket(serverAddress, serverPort);
        this.scanner = new Scanner(System.in);
    }
    private void start() throws IOException {
        String input;
        while (true) {
           input = " mirna  " + new Date().toString();
            System.out.println("sent size " + input.getBytes().length);
            JsonObject  jsonObject = new JsonObject();
            jsonObject.addProperty("id",10);
            jsonObject.addProperty("Name","8087");
            jsonObject.addProperty("time",input);
            PrintWriter out = new PrintWriter(this.socket.getOutputStream(),true);
            out.println(jsonObject.toString());
            out.flush();
            try
            {
                Thread.sleep(2000);
            }catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) throws Exception {
       
        System.out.println("\r\nConnected to Server:" );
        
    }
}
