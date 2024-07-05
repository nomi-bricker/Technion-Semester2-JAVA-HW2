//public enum Status {
//
//}

public class Book {
    private String title;
    private String author;
    private EnumGenre.Genre genre;
    private String id;
    private String status;


    public Book(String title, String author, EnumGenre.Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = "BN" + Integer.toString(Library.bookIdCounter);
    }

    public void printBookDetails() {
      //  System.out.println("Title: " + title + ", Author: " + author + ", Genre: " + genre);
        System.out.printf("Title: %s, Genre: %s, Author: %s\n", title, genre, author);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public EnumGenre.Genre getGenre() {
        return genre;
    }
}
