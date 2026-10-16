import java.util.ArrayList;


public class ListOfDocuments {

    private ArrayList<Document> list;
    public ListOfDocuments() {
        list = new ArrayList<Document>();
        
    }

    public void add(Document doc) {
        list.add(doc);
    
    }

    public void allAuthors() {
        
        for (Document doc : list) {
            if (doc instanceof Book) {
                Book book = (Book) doc;
                System.out.println(doc.getNumber() + " : " + book.getAuthor());
            }
            
            else {
                System.out.println(doc.getNumber() + " : no author");
            
            }
        }
    }

    public void allDocuments() {
       
        for (Document doc : list) {
            System.out.println(doc.toString());
        }
    }
}



