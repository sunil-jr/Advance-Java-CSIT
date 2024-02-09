package thread;

public class MainThread {

    public static void main(String[] args) {
        Library library = new Library();
        LibraryService libraryService1 = new LibraryService(library);
        LibraryService libraryService2 = new LibraryService(library);
        LibraryService libraryService3 = new LibraryService(library);

        libraryService1.start();
        libraryService2.start();
        libraryService3.start();
    }
}
