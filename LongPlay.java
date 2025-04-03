public class LongPlay extends Recording {
    public LongPlay(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);
    }

    public String getType(){ return "LP"; }

    public double getPrice(){
        double sum = getOriginalPrice() * getCondition()/10 + (2025 - getYear()) * 5 + getOriginalPrice() * getVAT();
        if(sum < 12.5){
            return 12.5;
        }
        return sum;
    }
}
