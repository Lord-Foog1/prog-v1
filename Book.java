public class Book extends Item {

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
        return price;
    }
    public String toString(){
        return "Name of the author: " + author + "!";
    }
}
