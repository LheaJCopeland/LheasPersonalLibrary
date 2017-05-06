/**
 * Created by LheaJLove on 4/26/2017.
 */
public class Book {
    private String title;
    private String author;
    private String genre;
    private String pubDate;
    private String publisher;
    private String award;
    private String yearsToWrite;
    private String checkedIn;

    public Book(String title, String author, String genre, String pubDate, String publisher, String award, String yearsToWrite) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pubDate = pubDate;
        this.publisher = publisher;
        this.award = award;
        this.yearsToWrite = yearsToWrite;
        this.checkedIn = checkedIn;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getYearsToWrite() {
        return yearsToWrite;
    }

    public void setYearsToWrite(String yearsToWrite) {
        this.yearsToWrite = yearsToWrite;
    }

    public String getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(String checkedIn) {
        this.checkedIn = checkedIn;
    }

    // http://stackoverflow.com/questions/16254995/how-do-you-return-an-array-object-in-java


}
