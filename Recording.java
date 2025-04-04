import java.io.Serializable;

public abstract class Recording extends Item implements PriceableWithVAT25 {


    private final String artist;
    private final int year;
    private int condition;
    private final double price;
    private double originalPrice;



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
        double sum = price * condition/10;
        if(sum < 12.5){
            return 12.5;
        }
        return sum;
    }

    public int getYear() {
        return year;
    }
    protected double getOriginalPrice(){
        return originalPrice;
    }
}
