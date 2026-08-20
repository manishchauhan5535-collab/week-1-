import java.util.ArrayList;


class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " +
                (isBorrowed ? "Borrowed" : "Available"));
        System.out.println();
    }
}



abstract class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void displayUserType();
}



class StudentUser extends User {

    public StudentUser(String name) {
        super(name);
    }

    @Override
    void displayUserType() {
        System.out.println(getName() + " is a Student User.");
    }
}



class Library {
    private ArrayList<Book> books = new ArrayList<>();

    
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to library.");
    }

    
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {

                if (!book.isBorrowed()) {
                    book.borrowBook();
                    System.out.println(title + " borrowed successfully.");
                } else {
                    System.out.println(title + " is already borrowed.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {

                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println(title + " returned successfully.");
                } else {
                    System.out.println(title + " was not borrowed.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    
    public void displayBooks() {
        System.out.println("\n--- Library Books ---");

        for (Book book : books) {
            book.displayBook();
        }
    }
}



public class LibraryManagementSystem {

    public static void main(String[] args) {

        
        Library library = new Library();

        
        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Data Structures", "Mark Allen");

        
        library.addBook(book1);
        library.addBook(book2);

        
        StudentUser user = new StudentUser("Manish Kumar");
        user.displayUserType();

        
        System.out.println();
        library.borrowBook("Java Programming");

        
        library.displayBooks();

        
        library.returnBook("Java Programming");

       
        library.displayBooks();
    }
}