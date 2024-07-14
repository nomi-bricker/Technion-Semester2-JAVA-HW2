public class Author {
    private String authorName;
    private String bibliography;

    public Author(String authorName, String bibliography) {
        this.authorName = authorName;
        this.bibliography = bibliography;
    }

    /**
     * @return - the name of the author
     */
    public String getAuthorName() {
        return authorName;
    }

    public String getBiography() {
        return bibliography;
    }




}
