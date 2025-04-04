public class Book extends Item implements PriceableWithVAT6 {

    public Book(String name,String author,double price,boolean bound){

        super(name);

        this.price = price;
        this.author = author;
        this.bound = bound;



    }
    private final double price;
    private final boolean bound;
    private final String author;


    public double getPrice() {
        if(bound){
            return price * 1.3;
        }
        return price;
    }

    public String toString(){
        return "Name of the author: " + author + "!";
    }
}
