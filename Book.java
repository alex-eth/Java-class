public class Book extends Document {
    private String author;
    private int pages;
    public Book(int number, String title, String author, int pages) {
        super(number, title);
        this.author = author;
        this.pages = pages;
    }
    

    public String getAuthor() {
        return author;
    
    }

    public int getPages() {
        return pages;
    
    }


    
    public String toString() {
        return "Book n°" + number + " : " + title + ", author: " + author + ", " + pages + " pages";
    }

    
}
