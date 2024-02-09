package network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Web {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://example.com");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String allLine = "";
        String line;
        while ((line = br.readLine()) != null) {
            allLine += line+ "\n";
        }
        System.out.println(allLine);
        saveToFile(allLine, "output.html");

    }

    private static void saveToFile(String content, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(content);
        } catch (IOException e) {
            System.out.println("Error saving HTML content to file: " + e.getMessage());
        }
    }
}
