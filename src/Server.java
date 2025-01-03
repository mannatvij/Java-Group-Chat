import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
    private ServerSocket serverSocket;

    //make a constructor
    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }
    //this method keeps the server live.
    public void startServer() {
        try {
            while(!serverSocket.isClosed()) {
               Socket socket = serverSocket.accept();//blocking method till a client connects, when connected socket is given to connect
                System.out.println("A new client has connected!");
                ClientHandler clientHandler = new ClientHandler(socket); //responisble for communication with a client.

                Thread thread = new Thread(clientHandler);
                thread.start(); //run the thread.
            }

        } catch (IOException e) {

        }
    }
     public void closeddServerSocket() { //function if no connection.

         try {
             if (serverSocket != null) { //server socket should not be null.
                 serverSocket.close();
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
     public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234); //client communicates on this port.
         Server server = new Server(serverSocket);
         server.startServer();
     }
}
