public class Member {
    private final String memberName;
    private final LibraryCard card;


    public Member(String name, int maxBooks) {
        this.memberName = name;
        this.card = new LibraryCard(maxBooks);
    }

    public LibraryCard getCard() {
        return card;
    }

    public void printMemberDetails() {
        System.out.printf("Name: %s, Checked-out books: ", memberName);
        for (int i = 0; i < this.card.getBorrowedBooks().length; i++) {
            System.out.printf(i == 0 ? "%s" : ", %s");
            int bookIndex = Library.indexOfBookForBookID(getCard().getBorrowedBooks()[i]);
            Library.booksArray[bookIndex].printBookDetails();
        }
    }
}
