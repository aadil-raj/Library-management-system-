import java.util.*;

public class Lib {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added.");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added.");
    }

    public void displayBooks() {
        for (Book b : books) {
            b.displayInfo();
        }
    }

    public void displayUsers() {
        for (User u : users) {
            u.displayUser();
        }
    }

    public void issueBook(String bookId) {
        for (Book b : books) {
            if (b.getBookId().equals(bookId) && !b.isIssued()) {
                b.issue();
                System.out.println("Book issued.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(String bookId) {
        for (Book b : books) {
            if (b.getBookId().equals(bookId) && b.isIssued()) {
                b.returnBook();
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Invalid return.");
    }
}