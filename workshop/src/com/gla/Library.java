package com.gla;

public class Library {
    private int quantity;
    private Admin admin;
    private List<Book> bookList = new ArrayList<Book>();

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    private LibraryRepository libraryRepository= new LibraryRepository();
}
