import library.books.*;
import library.members.*;
import library.transactions.*;

public class MainApp {
    public static void main(String[] args) {
        Book b = new Book();
        Member m = new Member();
        Transaction t = new Transaction();

        System.out.println("Book: " + b.title);
        System.out.println("Member: " + m.name);
        t.issue();
    }
}