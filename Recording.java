abstract class Recording extends Item {


    private final String artist;
    private final int year;
    private int condition;
    private final double price;



    protected Recording(String name, String artist, int year, int condition, double price) {
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;

    }
    public String getArtist() {
        return artist;
    }

    public abstract String getType();
    
    public int getCondition() {
        return condition;
    }
    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }
    protected double getOriginalPrice(){
        return OriginalPrice;
        }
}
