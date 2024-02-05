package network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6066);
        System.out.println("Socket opened....");
        System.out.println("Waiting for client....");
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Server: ");
            String msg = scanner.nextLine();
            out.println(msg);

            String inMsg = in.readLine();
            if (inMsg.equalsIgnoreCase("Bye")) break;
            System.out.println("Client: " + inMsg);
        } while (true);
    }
}
