package network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6066);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

        Scanner scanner = new Scanner(System.in);
        do {
            String inMsg = in.readLine();
            System.out.println("Server: " + inMsg);

            System.out.println("Client: ");
            String msg = scanner.nextLine();
            out.println(msg);
            if (msg.equalsIgnoreCase("Bye")) break;
        } while (true);
    }
}
