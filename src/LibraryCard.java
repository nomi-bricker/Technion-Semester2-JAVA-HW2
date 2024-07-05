public class LibraryCard {
    private String id;
    public String[] borrowedBooks;
    public int borrowedCount;

    public LibraryCard(int maxBooksInCard) {
        this.id = "CL" + Integer.toString(Library.cardIdCounter);
        String[] borrowedBooks = new String[maxBooksInCard];
        this.borrowedCount = 0;
    }

    private void addBookToCard(String bookId) {
        if (this.borrowedCount == this.borrowedBooks.length) {
            System.out.printf("The member Reached the limit\n");
        } else {
            this.borrowedBooks[this.borrowedCount] = bookId;
        }

    private void removeBookToCard(String bookId){

        }


    }
}
