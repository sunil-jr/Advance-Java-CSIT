package thread;

public class Library {
    private static int book = 10;

    public static void borrow() {
        if (book <= 0) {
            System.out.println("No book available!!!");
        } else {
            try {
                Thread.sleep(1000);
                book--;
                System.out.println("Book borrowed. Remaining book: " + book);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
