package Q2.library.books;


public class FictionBook {

    String title ;
    String author ;
    String genre ;

    public FictionBook(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public void displayinfo() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(genre);


    }
}
