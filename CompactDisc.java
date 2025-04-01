public class CompactDisc extends Recording {
    public CompactDisc(String name, String artist, int year, int condition, double price) {
        super(artist);
    }
    
    public String getType(){
        return "Type";
    }
}
