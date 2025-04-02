public interface Pricable {

    public abstract double getPrice();

    public abstract double getVAT();

    default public double getPriceWithVAT(){
        return getPrice() + getVAT();
    }
}
