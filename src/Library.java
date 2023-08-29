import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    Scanner sc = new Scanner(System.in);
    List<String> books= new ArrayList<>();
    List<String> issuedBooks= new ArrayList<>();


    //adding a book
    public void AddBook(){
        System.out.println("Enter the name of the book you want to add to the collection");
        String bookName= sc.next();
        books.add(bookName);
        System.out.println("Book added successfully!");
    }

    //display list of books
    public void showBooks(){
        System.out.println("Available books are: "+books);
    }

    //issue a book
    public void issueBook(){
        System.out.println("Enter the name of the book you want to issue");
        String bookName = sc.next();
        if (books.contains(bookName)){
            books.remove(bookName);
            issuedBooks.add(bookName);
            System.out.println("Book issued successfully!");
        }else {
            System.out.println("Book not found!");
        }

    }

    //return a book
    public void returnBook(){
        System.out.println("Enter the name of the book you want to return");
        String bookName= sc.next();
        if (issuedBooks.contains(bookName)){
            issuedBooks.remove(bookName);
            books.add(bookName);
        System.out.println("Book returned successfully!");
    }else {
            System.out.println("This book has not been issued to you!");
        }
    }

    //check list of issued books
    public void checkIssuedBooks(){
        System.out.println("The books that have been issued to you are: "+ issuedBooks);
    }

    //remove a book
    public void removeBook(){
        System.out.println("Enter the book you want to remove");
        String bookName= sc.next();
        if (books.contains(bookName)){
            books.remove(bookName);
            System.out.println("Book removed successfully!");
        }else {
            System.out.println("Book not found!");
        }
    }

    //Choose option
    public void chooseOption(){
        System.out.println("Hello! Welcome to students library");
        System.out.println("How can I help you?");
        System.out.println("1. Add a book to collection");
        System.out.println("2. Display the list of books");
        System.out.println("3. Issue a book");
        System.out.println("4. Return a book");
        System.out.println("5. check the  list of issued books");
        System.out.println("6. Remove a book");

        int option = sc.nextInt();
        if (option==1){
            AddBook();
        }
        if (option==2){
            showBooks();
        }
        if (option==3){
            issueBook();
        }
        if (option==4){
            returnBook();
        }
        if (option==5){
            checkIssuedBooks();
        }
        if (option==6){
            removeBook();
        }

    }
    public static void main(String[] args) {
        //Add a book to the collection
        //display the list of books
        //issue a book
        //return a book
        //check the list of issued books
        //remove a book
        Library library = new Library();
        while (true) {
            library.chooseOption();
        }
    }
}