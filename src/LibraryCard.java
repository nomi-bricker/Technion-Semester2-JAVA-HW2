public class LibraryCard {
    private String id;
    protected static String[] borrowedBooks; /////OK????????????????????????????????????????????????????????????????
    private int borrowedCount;

    public LibraryCard(int maxBooksInCard) {
        this.id = "CL" + Integer.toString(Library.cardIdCounter);
        String[] borrowedBooks = new String[maxBooksInCard];
        this.borrowedCount = 0;
    }

    public static void setBorrowedBooks(String[] borrowedBooks) {
        LibraryCard.borrowedBooks = borrowedBooks;
    }

    public String getId() {
        return id;
    }

    public String[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }

    public boolean isMaxLimit() {
        if (this.borrowedCount == this.borrowedBooks.length) {
            System.out.printf("The member Reached the limit\n");
            return true;
        }
        return false;
    }

    public void addBookToCard(String bookId) {
        this.borrowedBooks[this.borrowedCount] = bookId;
        this.borrowedCount++;
    }


    public void isBookInBorrowedBooks(Book book) {

    }


    public int indexOfThisBookInCard(String bookId) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBooks[i].equals(bookId)) {
                return i;
            }
        }
        return -1;
    }

    public void removeBookFromCard(String bookToRemove) {
        int removalBookIndex = indexOfThisBookInCard(bookToRemove);
        for (int i = removalBookIndex + 1; i < borrowedCount; i++) {
            borrowedBooks[i] = borrowedBooks[i + 1];
        }
        borrowedBooks[borrowedCount-1]=null;
        borrowedCount--;
    }
}

