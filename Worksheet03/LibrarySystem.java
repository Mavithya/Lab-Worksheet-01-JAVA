public class LibrarySystem extends Library {
    public static void main(String[] args) {
        // Create instances of Book
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721", true);
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);

        // Create instance of Library and add books
        Library library = new Library();
        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);

        // Display library info
        library.displayInfo();

        // List all available items
        System.out.println("\nAvailable items:");
        library.listAvailableItems();

        // Check out a book
        library.checkoutItem("Island of a Thousand Mirrors");

        // List available items again
        System.out.println("\nAvailable items after checkout:");
        library.listAvailableItems();
    }
}
