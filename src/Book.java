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

    public String getId() {
        return id;
    }
//    public boolean IsBorrowed(){
//        if (isBorrowed) {
////            System.out.printf("The book is already checked out.\n");
//        }
//        return isBorrowed;
//    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    /**
     * the function printes all the book db
     */
    public void printBookDetails() {
        //  System.out.println("Title: " + title + ", Author: " + author + ", Genre: " + genre);
        System.out.printf("Title: %s, Genre: %s, Author: %s\n", title, genre, author);
    }

    public void setBorrowed(boolean isBorrowed) {
        if (isBorrowed) {
            isBorrowed = true;
        } else {
            isBorrowed = false;
        }
    }

    public String getTitle() {
        return title;
    }


    public Author getAuthor() {
        return author;
    }


    public EnumGenre.Genre getGenre() {
        return genre;
    }
}
