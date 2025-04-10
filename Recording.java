public abstract class Recording extends Item implements PriceableWithVAT25 {


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

    @Override
    public double getPrice() {
        return Math.max(10, price * (condition * 0.1));
    }

    public int getYear() {
        return year;
    }
    protected double getOriginalPrice(){
        return price;
    }

    public String toString(){
        return String.format(
                "%s: name=%s, artist=%s, year=%d, condition=%d, original price=%f, price=%f, price+vat=%f",
                getType(), getName(), getArtist(), getYear(), getCondition(), getOriginalPrice(), getPrice(), getPriceWithVAT()
        );
    }
}
