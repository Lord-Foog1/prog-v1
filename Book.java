public class Book extends Item implements PriceableWithVAT6 {

    public Book(String name,String author,double price,boolean bound){

        super(name);

        this.price = price;
        this.author = author;
        this.bound = bound;

    }
    private static final double BOUND_EXTRA = 1.3;
    private final double price;
    private final boolean bound;
    private final String author;


    public double getPrice() {
        if(bound){
            return price * BOUND_EXTRA;
        }
        return price;
    }

    public String toString(){
        return String.format(
                "Book: name=%s, author=%s, bound=%b, price=%f, price+vat=%f",
                getName(),author,bound,getPrice(),getPriceWithVAT()
        );
    }
}
