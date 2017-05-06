import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by LheaJLove on 4/26/2017.
 */
public class LibraryMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice;
        String choice1;
        String title;
        String author;
        String genre;
        String pubDate;
        String publisher;
        String award;
        String yearsToWrite;
        String checkedIn;
        Calendar cal;
        String date;

        Book book = new Book("title", "author", "genre", "pubDate", "publisher", "award", "yearsToWrite");

        BookCollection bookCollection = new BookCollection();

        System.out.println("Welcome to Lhea's Personal Library!");
        System.out.println(" ");

        do {
            System.out.println("Would you like to:");
            System.out.println("1. Display the entire Book Collection");
            System.out.println("2. Search by Title");
            System.out.println("3. Search by Author");
            System.out.println("4. Borrow a Book");
            System.out.println("5. Return a Book");
            System.out.println("6. Add a Book to the Collection");

            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(bookCollection.displayBooks());
                    break;
                case 2:
                    System.out.println("What is the title of the book you would like to find?");
                    title = scan.nextLine();
                    System.out.println(" ");
                    System.out.println("Your book is: ");
                    bookCollection.searchByTitle(title);
                    break;
                case 3:
                    System.out.println("What is the author of the book you would like to find?");
                    author = scan.nextLine();
                    System.out.println(" ");
                    System.out.println("Your book is: ");
                    bookCollection.searchByAuthor(author);
                    break;
                case 4:
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                    cal = Calendar.getInstance();
                    cal.add(Calendar.DAY_OF_MONTH, 14);
                    date = sdf.format(cal.getTime());

                    System.out.println(bookCollection.displayBooks());
                    System.out.println(" ");
                    System.out.println("Which book would you like to check out?");
                    title = scan.nextLine();
                    System.out.println(title + " will be due in 2 weeks on " + date +".");
                    break;
                case 5:
                    System.out.println("Thank you for returning this book!");
                    break;
                case 6:
                    System.out.println("What is the title of the new book?");
                    title = scan.nextLine();
                    System.out.println("What is the author of the new book?");
                    author = scan.nextLine();
                    System.out.println("What is the genre of the new book?");
                    genre = scan.nextLine();
                    System.out.println("What is the publication year of the new book?");
                    pubDate = scan.nextLine();
                    System.out.println("Who is the publisher of the new book?");
                    publisher = scan.nextLine();
                    System.out.println("What is the biggest award this book has won?");
                    award = scan.nextLine();
                    System.out.println("How many years did it take for the author to write this book?");
                    yearsToWrite = scan.nextLine();
                    bookCollection.addBook("title", "author", "genre", "pubDate", "publisher", "award", "yearsToWrite");
                    System.out.println("Thank you for adding a book to Lhea's collection!");
                    System.out.println("Would you like to view the new collection? Please type yes or no");
                    choice1 = scan.nextLine();
                    if (choice1.equalsIgnoreCase("yes")) {
                        System.out.println(bookCollection.displayBooks());

                    }
                    break;
            }

            System.out.println("Would you like to continue?");
            choice1 = scan.nextLine();
        } while (choice1.equalsIgnoreCase("yes"));
        System.out.println("Thank you. Please come again!");
    }

}