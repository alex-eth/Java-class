public class Library {
    
    public static void main(String[] args) {
    
        ListOfDocuments docs = new ListOfDocuments();
        Book book1 = new Book(1, "Les Miserables", "Victor Hugo", 1488);
        Book book2 = new Book(2, "Le Petit Prince", "Saint-Exupery", 96);
        Dictionary dico = new Dictionary(3, "Le Petit Robert", "French", 2);
        docs.add(book1);
        docs.add(book2);
        docs.add(dico);
        docs.allAuthors();
        docs.allDocuments();
    
    }
}

