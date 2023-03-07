package pro.sky.java.course1.hw_12;

public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {

        Utils.checkName(title);
        this.title = title;

        if (author == null) {
            throw new IllegalArgumentException("Author should be defined.");
        }
        this.author = author;

        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  author + ". \"" + title + "\", " + year + '.';
    }

}