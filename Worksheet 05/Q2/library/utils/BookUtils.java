package Q2.library.utils;

import Q2.library.books.FictionBook;

public class BookUtils {
    static void printBookDetails(FictionBook book){
        book.displayinfo();
    }

    public static void main(String[] args) {
        FictionBook book = new  FictionBook("Harry Potter","J.K.Rowling","Mister");

        printBookDetails(book);
    }
}

