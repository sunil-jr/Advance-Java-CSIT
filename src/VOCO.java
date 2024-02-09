import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VOCO {

    public static void main(String[] args) throws IOException {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(isAllPossibilities(arr));
        FileWriter fileWriterV = new FileWriter("VOWEL.TXT");
        FileWriter fileWriterC = new FileWriter("CONSONANT.TXT");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something: ");
        String str = scanner.nextLine();

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                fileWriterV.write(c);
            } else {
                fileWriterC.write(c);
            }
        }
        fileWriterV.close();
        fileWriterC.close();
    }

    public static int isAllPossibilities(int[] a) {
        int isAllPosibilities = 1;
        if (a.length == 0) isAllPosibilities = 0;
        for (int i = 0; i < a.length && isAllPosibilities == 1; i++) {
            int index = -1;
            for (int j = 0; j < a.length && index == -1; j++) {
                if (i == a[j]) index = j;
            }
            if (index == -1)
                isAllPosibilities = 0;
        }
        return isAllPosibilities;
    }

    public int isBalanced(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && a[i] % 2 != 0) return 0;
            if (i % 2 != 0 && a[i] % 2 == 0) return 0;
        }
        return 1;
    }

    static class A {
        int sum = 0;

        public A() {
            this(0);
        }

        public A(int a) {
            this(a, 0);
        }

        public A(int a, int b) {
            sum = a + b;
        }


    }
}
