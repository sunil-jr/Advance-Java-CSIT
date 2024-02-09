package thread;

public class LibraryService extends Thread {
    private Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (library){
                library.borrow();
            }

        }
    }

}
