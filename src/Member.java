public class Member {
    private String memberName;
    private LibraryCard card;


    public Member(String name, int maxBooks) {
        this.memberName = name;
        this.card = new LibraryCard(maxBooks);
    }

    public void printMemberDetails() {
        System.out.printf("Name: %s, Checked-out books: ", memberName);
        for (int i = 0; i < this.card.borrowedBooks.length; i++) {
            System.out.printf(i == 0 ? "%s" : ", %s", this.card.borrowedBooks[i]);
        }
        System.out.printf("\n");
    }



}
