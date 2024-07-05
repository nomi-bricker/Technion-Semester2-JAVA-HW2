public class Library {
    public static final int MAX_MEMBERS = 5;
    public static final int MAX_BOOKS = 20;

    public Book[] booksArray = new Book[MAX_BOOKS];
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
    }

    public void addBook(String bookTitle, EnumGenre.Genre genre, String author, String biography) {
        if (bookCounter == MAX_BOOKS) {
            System.out.printf("Library is full, cannot add more books\n");
        } else {
            Author currentAuthor = new Author(author, biography);
            if (isAuthorExists(currentAuthor) == -1) { //means we don't have this author in the library
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
        int RemovalBookIndex = isBookExists(bookTitle, bookGenre, bookAuthor);
        if (RemovalBookIndex != -1){
            for (int i = RemovalBookIndex + 1; i < bookCounter; i++) {
               booksArray[i] = booksArray[i + 1];
            }
        }

    }

    public void printBooks() {
        if (isThereBooks()) {
            for (int i = 0; i < bookCounter; i++) {
                booksArray[i].printBookDetails();
            }
        }
    }

    public boolean isThereBooks() {
        if (bookCounter == 0) {
            System.out.printf("No books in the library currently.\n");
            return false;
        }
        return true;
    }

    public void addMember(String clientName, int maxBooks){
        membersArray[memberCounter] = new Member(clientName, maxBooks);
        memberCounter++;
        cardIdCounter++;
        System.out.printf("MEMBER Added\n");

    }

    public void removeMember(){

    }

    public int isCardIdExists(int cardId) {
        for (int i = 0; i < Library.memberCounter; i++) {
            if (Library.membersArray[i].card.)
        }
        System.out.printf("No such member exists\n");
        return -1;

    }

    public void printMember(int cardId){
        if(cardId > cardIdCounter || isCardIdExists(cardId) == -1){

        }
        membersArray[cardId].printMemberDetails();
    }

    public void checkOutBook(String idCard, String idBook){

    }

    public returnBook(){

    }
}
