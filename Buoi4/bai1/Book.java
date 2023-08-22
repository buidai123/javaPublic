import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private String author;
    private String publisher;
    private int year;

    public Book() {
    }

    public Book(String bookId, String bookName, String author, String publisher, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        bookId = sc.nextLine();
        System.out.println("Nhập tên sách: ");
        bookName = sc.nextLine();
        System.out.println("Nhập tác giả: ");
        author = sc.nextLine();
        System.out.println("Nhập nhà xuất bản: ");
        publisher = sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        year = sc.nextInt();
    }

    public void display() {
        System.out.printf("Mã sách: %-10s || Tên sách: %-20s || Tác giả: %-10s || NXB: %-10s || Năm: %d\n", bookId, bookName, author, publisher, year);
    }

    public static void main(String[] args) {
        Book[] books = new Book[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sách thứ " + (i + 1) + ":");
            books[i] = new Book();
            books[i].input();
        }
        for (Book book : books) {
            book.display();
        }
    }
}