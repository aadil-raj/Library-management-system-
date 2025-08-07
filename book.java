public class Book {
    private String title;
    private String author;
    private String bookId;
    private boolean isIssued;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public boolean isIssued() { return isIssued; }

    public void issue() { isIssued = true; }
    public void returnBook() { isIssued = false; }

    public void displayInfo() {
        System.out.println(bookId + " | " + title + " | " + author + " | Issued: " + isIssued);
    }
}