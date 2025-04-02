public interface PriceableWithVAT25 extends Pricable{
    default double getVAT(){
        return 0.25;

    }
}
