public class Dictionary extends Document {
    
    private String language;
    private int volumes;
    public Dictionary(int number, String title, String language, int volumes) {
        super(number, title);
        this.language = language;
        this.volumes = volumes;
    }
    public String getLanguage() {
        return language;
    
    }

    public int getVolumes() {
        return volumes;
    
    }

    
    public String toString() {
        return "Dictionary n°" + number + " : " + title + ", language: " + language + ", " + volumes + " volumes";
    
    }
    
}
