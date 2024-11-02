abstract  class BorrowableItems {
abstract void  displayInfo();

 static class Book extends BorrowableItems{
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    // Constructor
    public Book(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }
    public void setTitle(String title){
        this.title = title;

    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author = author;

    }
    public String getAuthor(){
        return author;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
    public boolean isAvailable(){
        return available;
    }
    // Implement displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}
}

