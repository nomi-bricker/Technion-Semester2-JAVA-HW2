public class Library {
    public static final int MAX_MEMBERS = 5;
    public static final int MAX_BOOKS = 20;

    public static Book[] booksArray = new Book[MAX_BOOKS];
    public static Member[] membersArray = new Member[MAX_MEMBERS];
    public static Author[] authorsArray = new Author[MAX_BOOKS];
    private String name;
    public static int bookCounter = 0; //how many books we have right now
    public static int bookIdCounter = 0; //all the books ever added to the library
    public static int memberCounter = 0;
    public static int cardIdCounter = 0;
    public static int authorCounter = 0;


    public Library(String name) {
        this.name = name;
        booksArray = new Book[MAX_BOOKS];
        membersArray = new Member[MAX_MEMBERS];
        authorsArray = new Author[MAX_BOOKS];
        bookCounter = 0; //how many books we have right now
        bookIdCounter = 0; //all the books ever added to the library
        bookAvailabilityCounter=0;
        memberCounter = 0;
        cardIdCounter = 0;
        authorCounter = 0;
    }

    public void addBook(String bookTitle, EnumGenre.Genre genre, String author, String biography) {
        if (bookCounter == MAX_BOOKS) {
            System.out.printf("Library is full, cannot add more books\n");
        } else {
            Author currentAuthor = new Author(author, biography);
            int authorIndex = isAuthorExists(currentAuthor);
            if (authorIndex == -1) { //means we don't have this author in the library
                authorsArray[authorCounter] = currentAuthor;
                authorCounter++;
            }
//            Book currentBook = new Book(bookTitle, author, genre);
//            booksArray[bookCounter] = currentBook;
            booksArray[bookCounter] = new Book(bookTitle, author, genre);
            System.out.printf("AAA The Book addedddddd\n");
            bookCounter++;
            ///if (isBookExists(currentBook) == -1) { //means we don't have this book in the library
            ///    booksArray[bookCounter] = currentBook;
            ///}
        }
    }

    /**
     * checks if this author exists in the library
     *
     * @param currentAuthor
     * @return the index of this author
     */
    private int isAuthorExists(Author currentAuthor) {
        for (int i = 0; i < authorCounter; i++) {
            if (currentAuthor.getAuthorName().equals(authorsArray[i].getAuthorName()) &&
                    currentAuthor.getBiography().equals(authorsArray[i].getBiography())) {
                return i;
            }
        }
        return -1;
    }

    public int isBookExists(String bookTitle, EnumGenre bookGenre, String bookAuthor) {
        for (int i = 0; i < bookCounter; i++) {
            if (bookTitle.equals(booksArray[i].getTitle()) &&
                    bookGenre.equals(booksArray[i].getGenre()) &&
                    bookAuthor.equals(booksArray[i].getAuthor())) {
                return i;
            }
        }
        System.out.printf("No such book exists.\n");
        return -1;
    }


    public void removeBook(String bookTitle, EnumGenre bookGenre, String bookAuthor) {
        int removalBookIndex = isBookExists(bookTitle, bookGenre, bookAuthor);
        if (removalBookIndex != -1) {
            for (int i = removalBookIndex + 1; i < bookCounter; i++) {
                booksArray[i] = booksArray[i + 1];
            }
        }
    }

    public void printBooks() {
        if (isThereBooks()) {
            for (int i = 0; i < bookCounter; i++) {
                if (!booksArray[i].getIsBorrowed()) {
                    booksArray[i].printBookDetails();
                }
            }
        }
    }

    public boolean isThereBooks() {
        if (bookAvailabilityCounter == 0) {
            System.out.printf("No books in the library currently.\n");
            return false;
        }
        return true;
    }

    public void addMember(String clientName, int maxBooks) {
        membersArray[memberCounter] = new Member(clientName, maxBooks);
        memberCounter++;
        cardIdCounter++;
        System.out.printf("MEMBER Added\n");

    }

    public void removeMember(String cardId) {

    }

    public int isCardIdExists(int cardId) {
        for (int i = 0; i < Library.memberCounter; i++) {
            if (Library.membersArray[i].card.)
        }
        System.out.printf("No such member exists\n");
        return -1;

    }

    public void printMember(String cardId) {
        int memberIndex = indexOfMemberForCardID(cardId);
        if (memberIndex != -1) {
            membersArray[memberIndex].printMemberDetails();
        }
    }

    public void checkOutBook(String idCard, String idBook){

    }

    public void returnBook(String idBook, String idCard) {
        int bookIndex = indexOfBookForBookID(idBook);
        int memberIndex = indexOfMemberForCardID(idCard);
        if (memberIndex == -1) {
            return;
        }
        if (bookIndex == -1) {
            return;
        }
        // if borrowed + print
       // String borrrowedStatus = membersArray[memberIndex].getCard().getId();
        membersArray[memberIndex].getCard().removeBookFromCard(booksArray[bookIndex].getId());
        booksArray[bookIndex].setBorrowed(false);

    }

    public Author getAuthor(String idBook) {
        int bookIndex = indexOfBookForBookID(idBook);
        if (bookIndex == -1) {
            return null;
        }
        return booksArray[bookIndex].getAuthor();
    }

    public static int indexOfBookForBookID(String id) {
        for (int i = 0; i < bookCounter; i++) {
            if (bookId.equals(booksArray[i].getId())) {
                return i;
            }
        }
        System.out.printf("No such book exists.\n");
        return -1;
    }

    public int indexOfMemberForCardID(String id) {
        for (int i = 0; i < memberCounter; i++) {
            if (id.equals(membersArray[i].getCard().getId())) {
                return i;
            }
        }
        System.out.printf("No such member exists.\n");
        return -1;
    }
}
