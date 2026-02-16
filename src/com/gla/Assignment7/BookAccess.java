class BookAccess {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends BookAccess {
    void display() {
        System.out.println(ISBN + " " + title);
    }
}
