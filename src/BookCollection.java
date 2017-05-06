import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by LheaJLove on 4/26/2017.
 */
public class BookCollection {
Book book;
String[] titleArray;

    // http://stackoverflow.com/questions/26071073/storing-a-string-and-int-in-2d-array


    //Title, Author, Genre, Publication Date, Publisher, Award, YearsTooktoWrite, checkedIn


    String[][] collection = new String[][]{
        {"The Bluest Eye", "Toni Morrison", "Literary Fiction", "1972", "Random House", "Nobel", "2", "yes" },
            {"Middlesex", "Jeffrey Eugenides", "Literary Fiction", "2000", "Penguin", "Pulitzer", "10", "yes"},
            {"Half of a Yellow Sun", "Chimamanda Ngozi Adichie", "Literary Fiction", "2008", "Random House", "Orange", "5", "yes"},
            {"The Known World", "Edward P. Jones", "Literary Fiction", "2001", "Amistad", "Pulitzer", "10", "yes"}};

    public void searchByTitle (String title){

        for (int i = 0; i < collection.length; i++){
            if (collection[i][0].equalsIgnoreCase(title)){
                System.out.println(collection[i][0] + ", " + collection[i][1] + ", " + collection[i][2] + ", " +  collection[i][3] + ", " + collection[i][4] + ", " + collection[i][5] + ", " + collection[i][6] + ", " + collection[i][7]);
            }
     }
    }

    public void searchByAuthor(String author) {
        for (int i = 0; i < collection.length; i++){
            if (collection[i][1].equalsIgnoreCase(author)){
                System.out.println(collection[i][0] + ", " + collection[i][1] + ", " + collection[i][2] + ", " +  collection[i][3] + ", " + collection[i][4] + ", " + collection[i][5] + ", " + collection[i][6] + ", " + collection[i][7]);
            }
        }
    }

    public  String[][] displayBooks(){
        return collection;
    }

public void addBook(String title, String author, String genre, String pubDate, String publisher, String award, String yearsToWrite) {
    int x = 5;
    for (int i = 0; i < collection.length; i++ ){
        if (collection[i][0] != null){
            x =i;
            collection[x][0] = title;
            collection[x][1] = author;
            collection[x][2] = genre;
            collection[x][3] = pubDate;
            collection[x][4] = publisher;
            collection[x][5] = award;
            collection[x][6] = yearsToWrite;
            collection[x][7] = "yes";
        }
    }
        }
}