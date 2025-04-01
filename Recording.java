abstract class Recording extends Item {


    private String artist;
    private int year;
    private int condition;
    private double price;



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

    public String getType(){
        return "Recording";
    }
    public int getCondition() {
        return condition;
    }
    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }
    public double getOriginalPrice(){
        return OriginalPrice;
        }
}
