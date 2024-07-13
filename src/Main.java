public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Test 1 starts");
            test1();
            System.out.println("Test 1 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 2 starts");
            test2();
            System.out.println("Test 2 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 3 starts");
            test3();
            System.out.println("Test 3 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 4 starts");
            test4();
            System.out.println("Test 4 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 5 starts");
            test5();
            System.out.println("Test 5 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 6 starts");
            test6();
            System.out.println("Test 6 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 7 starts");
            test7();
            System.out.println("Test 7 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 8 starts");
            test8();
            System.out.println("Test 8 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 9 starts");
            test9();
            System.out.println("Test 9 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 10 starts");
            test10();
            System.out.println("Test 10 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 11 starts");
            test11();
            System.out.println("Test 11 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 12 starts");
            test12();
            System.out.println("Test 12 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 13 starts");
            test13();
            System.out.println("Test 13 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 14 starts");
            test14();
            System.out.println("Test 14 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 15 starts");
            test15();
            System.out.println("Test 15 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 16 starts");
            test16();
            System.out.println("Test 16 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 17 starts");
            test17();
            System.out.println("Test 17 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 18 starts");
            test18();
            System.out.println("Test 18 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 19 starts");
            test19();
            System.out.println("Test 19 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 20 starts");
            test20();
            System.out.println("Test 20 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 21 starts");
            test21();
            System.out.println("Test 21 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 22 starts");
            test22();
            System.out.println("Test 22 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 23 starts");
            test23();
            System.out.println("Test 23 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 24 starts");
            test24();
            System.out.println("Test 24 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }

        try {
            System.out.println("Test 25 starts");
            test25();
            System.out.println("Test 25 done");
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("exception " + e);
        }
    }



    public static void test1() {
        Library library = new Library("Technion Library");
        library.addBook("Harry Potter and the Sorcerer's Stone", Genre.FANTASY, "J.K. Rowling", "British author, best known for the Harry Potter series.");
        library.printBooks();
        library.addBook("Harry Potter and the Sorcerer's Stone", Genre.SCIENCE_FICTION, "J.K. Rowling", "British author, best known for the Harry Potter series.");
        library.addBook("Harry Potter and the Sorcerer's Stone", Genre.FANTASY, "J.K. Rowling", "American author! Best known for copying British writer J.K. Rowling's identity.");
        System.out.println("second print:");
        library.printBooks();

        System.out.println(library.getAuthor("BN0") == library.getAuthor("BN1"));
        System.out.println(library.getAuthor("BN0") == library.getAuthor("BN2"));
    }

    public static void test2() {
        Library library = new Library("Technion Library");
        library.removeBook("Book 1", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 1", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.removeBook("Book 1", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 2", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 3", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 4", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 5", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 6", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 7", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 8", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 9", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 10", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 11", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 12", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 13", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 14", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 15", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 16", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 17", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 18", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 19", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 20", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 1", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.printBooks();

        System.out.println(library.getAuthor("BN0"));

        library.addBook("Book 21", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.printBooks();
    }

    public static void test3() {
        Library library = new Library("Technion Library");
        library.addBook("How To write exercises for students", Genre.DRAMA, "Gal Zur", "A TA at the Technion known (possibly notoriously) for his exercises in the Software Engineering course.");
        library.addBook("How to successfully answer exercises", Genre.FANTASY, "Gal Zur", "A student at the Technion. For complete biography find him at the DDS faculty.");
        library.addBook("Book 3", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 4", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 5", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 6", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 7", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 8", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 9", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 10", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 11", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 12", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 13", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 14", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 15", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 16", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 17", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 18", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 19", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 20", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 1", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.printBooks();

        library.addMember("Israel Israeli", 3);
        library.addMember("Israel Israeli 2", 3);
        library.addMember("Israel Israeli 3", 3);
        library.addMember("Israel Israeli 4", 3);
        library.addMember("Israel Israeli 5", 3);
        library.addMember("Israel Israeli 6", 3);

        library.checkOutBook("BN0", "LC0");
        library.checkOutBook("BN1", "LC0");

        library.printMember("LC0");
    }

    public static void test4() {
        Library library = new Library("Technion Library");
        library.printBooks();

        library.addBook("How To write exercises for students", Genre.DRAMA, "Gal Zur", "A TA at the Technion known (possibly notoriously) for his exercises in the Software Engineering course.");
        library.addBook("How to successfully answer exercises", Genre.FANTASY, "Gal Zur", "A student at the Technion. For complete biography find him at the DDS faculty.");
        library.addBook("Book 3", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 4", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");

        library.printBooks();

        library.addMember("Israel Israeli", 2);
        library.addMember("Israel Israeli 2", 3);
        library.addMember("Israel Israeli 3", 3);
        library.addMember("Israel Israeli 4", 3);
        library.addMember("Israel Israeli 5", 3);

        library.checkOutBook("BN0", "LC0");
        library.checkOutBook("BN1", "LC0");
        library.checkOutBook("BN2", "LC0");
        library.checkOutBook("BN0", "LC0");

        library.printMember("LC0");
        System.out.println("library:");
        library.printBooks();

        library.removeMember("LC0");
        library.checkOutBook("BN9", "LC7");
        library.printMember("LC0");
    }

    // Test 5: Add a book and print books
    public static void test5() {
        Library library = new Library("Test Library");
        library.addBook("Book 1", Genre.DRAMA, "John Doe", "Biography");
        library.printBooks();
    }


    public static void test6() {
        Library library = new Library("Technion Library");

        library.addBook("Book 1", Genre.DRAMA, "Jane Smith", "Just a generic author.");
        library.addBook("Book 2", Genre.FANTASY, "John Doe", "Another generic author.");
        library.addBook("Book 3", Genre.SCIENCE_FICTION, "Mark Brown", "Another generic author.");
        library.addBook("Book 4", Genre.HISTORY_FICTION, "Jane Smith", "Just a generic author.");
        library.addBook("Book 5", Genre.FANTASY, "John Doe", "Another generic author.");

        library.addMember("Israel Israeli", 2);

        library.checkOutBook("BN0", "LC0");
        library.checkOutBook("BN1", "LC0");

        library.removeMember("LC0");

        library.printBooks();
    }

    // Test 7: Try to remove a non-existing book
    public static void test7() {
        Library library = new Library("Test Library");
        library.removeBook("Non-existent Book", Genre.DRAMA, "John Doe", "Biography");
    }

    // Test 8: Try to add a member to a full library
    public static void test8() {
        Library library = new Library("Test Library");
        library.addMember("Member 1", 2);
        library.addMember("Member 2", 2);
        library.addMember("Member 3", 2); // Library is full after this
        library.addMember("Member 4", 2); // This should print "Library is full, cannot add more members."
    }

    // Test 9: Check out a book and print member details
    public static void test9() {
        Library library = new Library("Test Library");
        library.addBook("Book 1", Genre.DRAMA, "John Doe", "Biography");
        library.addMember("Member 1", 1);
        library.checkOutBook("BN0", "LC0");
        library.printMember("LC0");
    }

    // Test 10: Return a book and print library books
    public static void test10() {
        Library library = new Library("Test Library");
        library.addBook("Book 1", Genre.DRAMA, "John Doe", "Biography");
        library.addMember("Member 1", 1);
        library.checkOutBook("BN0", "LC0");
        library.returnBook("BN0", "LC0");
        library.printBooks();
    }

    // Test 11: Try to return a book that is not checked out
    public static void test11() {
        Library library = new Library("Test Library");
        library.addBook("Book 1", Genre.DRAMA, "John Doe", "Biography");
        library.addMember("Member 1", 1);
        library.returnBook("BN0", "LC0"); // This should print "Member cannot return the book"
    }

    // Test 12: Print member details for a non-existing member
    public static void test12() {
        Library library = new Library("Test Library");
        library.printMember("LC0"); // This should print "No such member exists."
    }

    // Test 13: Add multiple books and members, checking library and member limits
    public static void test13() {
        Library library = new Library("Technion Library");

        library.addBook("Book 1", Genre.DRAMA, "Jane Smith", "American author known for drama novels.");
        library.addBook("Book 2", Genre.FANTASY, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 3", Genre.SCIENCE_FICTION, "Mark Brown", "Science fiction enthusiast.");

        library.addMember("Israel Israeli", 3);
        library.addMember("Israel Israeli 2", 3);
        library.addMember("Israel Israeli 3", 3);

        library.checkOutBook("BN0", "LC0");
        library.checkOutBook("BN1", "LC0");

        library.printMember("LC0");
    }


    // Test 14: Add and remove books, ensuring correct book IDs
    public static void test14() {
        Library library = new Library("Technion Library");

        library.addBook("Book 1", Genre.DRAMA, "Jane Smith", "Just a generic author.");
        library.addBook("Book 2", Genre.FANTASY, "John Doe", "Another generic author.");
        library.addBook("Book 3", Genre.SCIENCE_FICTION, "Mark Brown", "Another generic author.");

        library.addMember("Israel Israeli", 2);

        library.checkOutBook("BN0", "LC0");
        library.checkOutBook("BN1", "LC0");

        library.printMember("LC0");

        library.removeMember("LC0");
    }


    // Test 15: Add books and print library, ensuring correct author retrieval
    public static void test15() {
        Library library = new Library("Technion Library");

        library.addBook("Book 1", Genre.DRAMA, "Jane Smith", "Just a generic author.");
        library.addBook("Book 2", Genre.FANTASY, "John Doe", "Another generic author.");
        library.addBook("Book 3", Genre.SCIENCE_FICTION, "Mark Brown", "Another generic author.");

        library.addMember("Israel Israeli", 2);

        System.out.println(library.getAuthor("BN0") == library.getAuthor("BN1"));
        System.out.println(library.getAuthor("BN0") == library.getAuthor("BN2"));
    }

    // Test 16: Adding and removing multiple books and members
    public static void test16() {
        Library library = new Library("Technion Library");
        library.addBook("Book 1", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 2", Genre.FANTASY, "Jane Smith", "An imaginative author.");
        library.addBook("Book 3", Genre.SCIENCE_FICTION, "Mark Brown", "Writes about futuristic technology.");
        library.addMember("Member 1", 2);
        library.addMember("Member 2", 3);
        library.addMember("Member 3", 1);
        library.removeBook("Book 1", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.removeBook("Book 2", Genre.FANTASY, "Jane Smith", "An imaginative author.");
        library.removeMember("LC2");
        library.removeMember("LC3");
        library.printBooks();
    }

    // Test 17: Checking out and returning books
    public static void test17() {
        Library library = new Library("Technion Library");
        library.addBook("Book 1", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addBook("Book 2", Genre.FANTASY, "Jane Smith", "An imaginative author.");
        library.addMember("Member 1", 2);
        library.checkOutBook("BN0", "LC0");
        library.checkOutBook("BN1", "LC0");
        library.returnBook("BN0", "LC0");
        library.printMember("LC0");
    }

    // Test 18: Attempting to remove a non-existent book
    public static void test18() {
        Library library = new Library("Technion Library");
        library.removeBook("Non-existent Book", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
    }

    // Test 19: Attempting to add a book when library is full
    public static void test19() {
        Library library = new Library("Technion Library");
        for (int i = 0; i < 20; i++) {
            library.addBook("Book " + i, Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        }
        library.addBook("Extra Book", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
    }

    // Test 20: Attempting to add a member when library is full
    public static void test20() {
        Library library = new Library("Technion Library");
        for (int i = 0; i < 5; i++) {
            library.addMember("Member " + i, 2);
        }
        library.addMember("Extra Member", 2);
    }

    // Test 21: Checking out a non-existent book
    public static void test21() {
        Library library = new Library("Technion Library");
        library.addMember("Member 1", 2);
        library.checkOutBook("Non-existent Book", "LC0");
    }

    // Test 22: Returning a book that is not checked out
    public static void test22() {
        Library library = new Library("Technion Library");
        library.addBook("Book 1", Genre.DRAMA, "John Doe", "Just a generic guy in a generic U.S. state.");
        library.addMember("Member 1", 2);
        library.returnBook("BN0", "LC0");
    }

    // Test 23: Printing member with no checked-out books
    public static void test23() {
        Library library = new Library("Technion Library");
        library.addMember("Member 1", 2);
        library.printMember("LC0");
    }

    public static void test24() {
        Library library = new Library("Test Library 24");

        // Adding books
        library.addBook("Book 1", Genre.DRAMA, "John Doe", "Biography 1");
        library.addBook("Book 2", Genre.FANTASY, "Jane Smith", "Biography 2");
        library.addBook("Book 3", Genre.SCIENCE_FICTION, "Mark Brown", "Biography 3");

        // Adding members
        library.addMember("Member 1", 3);
        library.addMember("Member 2", 2);

        // Checking out books
        library.checkOutBook("BN0", "LC2");
        library.checkOutBook("BN2", "LC1");
        library.checkOutBook("BN0", "LC1");
        library.checkOutBook("BN1", "LC0");

        // Printing library contents
        library.printBooks();

        // Printing member details
        library.printMember("LC1");
    }

    // Test 25: Attempting to check out a book for a non-existent member
    public static void test25() {
        Library library = new Library("Test Library 24");

        // Adding books
        library.addBook("Book 1", Genre.DRAMA, "John Doe", "Biography 1");
        library.addBook("Book 2", Genre.FANTASY, "Jane Smith", "Biography 2");
        library.addBook("Book 3", Genre.SCIENCE_FICTION, "Mark Brown", "Biography 3");

        library.printBooks();

        // Adding members
        library.addMember("Member 1", 3);
        library.addMember("Member 2", 2);

        // Checking out books
        library.checkOutBook("BN0", "LC2");
        library.checkOutBook("BN2", "LC1");
        library.checkOutBook("BN0", "LC1");
        library.checkOutBook("BN1", "LC0");

        // Printing library contents
        library.printBooks();

        // Printing member details
        library.returnBook("BN2", "LC1");
        library.returnBook("BN0", "LC2");
        library.returnBook("BN0", "LC1");
        library.returnBook("BN1", "LC0");

        library.printMember("LC1");
        library.printBooks();

    }
}