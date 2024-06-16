package Models;

public class Book {
    private String title;
    private String author;
    private boolean availability;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.availability = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}