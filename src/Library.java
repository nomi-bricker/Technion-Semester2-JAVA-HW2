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
        bookAvailabilityCounter = 0;
        memberCounter = 0;
        cardIdCounter = 0;
        authorCounter = 0;
    }

    /**
     * the function "addBook" gets 4 parameters, creating a new book, and saving the data in the arrays
     * if it's necessary- if this author didn't exist yet, creating a new author
     *
     * @param bookTitle - the book title name
     * @param genre     - the genre of the book
     * @param author    - the author name
     * @param biography - the biography of the author
     *                  the function didn't return
     */
    public void addBook(String bookTitle, Genre genre, String author, String biography) {
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
     * @param currentAuthor - an author with the details we got
     * @return the index of this author in the array if he exists, else -1
     */
    private int isAuthorExists(Author currentAuthor) {
        for (int i = 0; i < authorCounter; i++) {
            //compare the details we got, with the existing details of the authors
            if (currentAuthor.getAuthorName().equals(authorsArray[i].getAuthorName()) &&
                    currentAuthor.getBiography().equals(authorsArray[i].getBiography())) {
                return i;
            }
        }
        return -1;
    }

    /**
     * checks if this book exists in the library
     *
     * @param book- a book with the details we got
     * @return the index of this book in the array if he exists, else -1
     */
    public int isBookExists(Book book) {
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

    /**
     * the function geta 4 parameters, checks if thia book exists in the library and removing the book
     *
     * @param bookTitle  - the book title name
     * @param bookGenre  - the genre of the book
     * @param bookAuthor - the author name
     * @param biography  -  the biography of the author
     *                   the function didn't return
     */
    public void removeBook(String bookTitle, Genre bookGenre, String bookAuthor, String biography) {
        Author currentAuthor = new Author(bookAuthor, biography);
        Book currentBook = new Book(bookTitle, currentAuthor, bookGenre, this);
        int removalBookIndex = isBookExists(currentBook);
        if (removalBookIndex == -1 || booksArray[removalBookIndex].getIsBorrowed()) {
            System.out.printf("No such book exists.\n");
            return;
        }
        //if this author has only 1 book (that we are removing), so we will remove this author
        if (booksArray[removalBookIndex].getAuthor().getNumberOfBooks() == 1) {
            int authorIndex = isAuthorExists(currentAuthor);
            for (int i = authorIndex; i < authorCounter; i++) {
                authorsArray[i] = authorsArray[i + 1];
            }
        }
    }

    /**
     * the function didn't get parameters
     * printing all the books that are currently in the library
     * the function didn't return
     */
    public void printBooks() {
        if (isThereBooks()) {
            for (int i = 0; i < bookCounter; i++) {
                if (!booksArray[i].getIsBorrowed()) {
                    booksArray[i].printBookDetails();
                }
            }
        }
    }

    /**
     * the function didn't get parameters
     * checkes if we have books currently in the library (books that are checked-out doesn't count)
     *
     * @return true if there are books in the library, else false
     */
    public boolean isThereBooks() {
        if (bookAvailabilityCounter == 0) {
            System.out.printf("No books in the library currently.\n");
            return false;
        }
        return true;
    }

    /**
     * the function gets 2 parameters, and if we have place for new member - adding him.
     *
     * @param clientName - clint's name
     * @param maxBooks   - max number of books this client can borrow
     *                   the function didn't return
     */
    public void addMember(String clientName, int maxBooks) {
        membersArray[memberCounter] = new Member(clientName, maxBooks);
        memberCounter++;
        cardIdCounter++;
        System.out.printf("MEMBER Added\n");

    }

    /**
     * the function gets parameter, checks if this member exists, removing him if he exists,
     * and returning his book to the library if they are in borrowed status
     *
     * @param cardId - the unique identifier of the card
     *               the function didn't return
     */
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

    /**
     * the function gets 2 parameters and returning the book to the library, if this book exists
     *
     * @param idBook the unique identifier of the book
     * @param idCard -the unique identifier of the card
     *               the function didn't return
     */
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

    /**
     * the function gets parameter, and if this book exists, returns the details of the author who wrote this book
     *
     * @param idBook the unique identifier of the book
     * @return an author - with all his details
     */
    public Author getAuthor(String idBook) {
        int bookIndex = indexOfBookForBookID(idBook);
        if (bookIndex == -1) {
            return null;
        }
        return booksArray[bookIndex].getAuthor();
    }

    /**
     * the function gets 2 parameters
     *
     * @param bookId the unique identifier of the book
     * @param print  - boolean flag that indicates if we need to print tha output in this case
     * @return the index of the book by his id
     */
    public int indexOfBookForBookID(String bookId, boolean print) {
        for (int i = 0; i < bookCounter; i++) {
            if (bookId.equals(booksArray[i].getId())) {
                return i;
            }
        }
        System.out.printf("No such book exists.\n");
        return -1;
    }

    /**
     * the function gets a parameter
     *
     * @param cardId - the unique identifier of the member
     * @return the index of the member by his card id
     */
    public int indexOfMemberForCardID(String cardId) {
        for (int i = 0; i < memberCounter; i++) {
            if (id.equals(membersArray[i].getCard().getId())) {
                return i;
            }
        }
        System.out.printf("No such member exists.\n");
        return -1;
    }
}
