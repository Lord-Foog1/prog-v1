public interface PriceableWithVAT6 extends Pricable{
    default double getVAT(){
        return 0.06;

    }
}
