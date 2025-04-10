public interface Priceable {

    abstract double getPrice();

    abstract double getVAT();

    default double getPriceWithVAT(){
        return getPrice() + getPrice() * getVAT();
    }
}
