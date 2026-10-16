public class Document {
    
    protected int number;
    protected String title;

    public Document(int number, String title) {
        this.number = number;
        this.title = title;
    
    }

    public int getNumber() 
    {
        return number;
    
    }

    public String getTitle() {
        return title;
    }

    
    public String toString() {
        return "Document n°" + number + " : " + title;
    }

    
}
