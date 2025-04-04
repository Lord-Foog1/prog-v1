import java.util.ArrayList;

public class Order {
    // public Order(Item[])
    public Order(Item... items) {
        this.items.add(items);
    }

    private final long orderNumber = 0;
    private static long counter;
    private final ArrayList<Item[]> items = new ArrayList<Item[]>();

    public String getReceipt(){
        String receipt = "";
        for (Item[] item : items){
            for (Item i : item){
                
            }
        }
        return "Your total to pay will be" + getTotalValue()+ " without tax, with tax it will be " + getTotalValuePlusVAT();
    }

    public double getTotalValuePlusVAT(){
        double sum = 0;
        for(Item[] item : items){
            for(Item i : item){
                sum += i.getPrice();
            }
        }
        return sum;
    }

    public double getTotalValue(){
        double sum = 0;
        for(Item[] item : items){
            for(Item i : item){
                sum += i.getPrice() + i.getPrice() * i.getVAT();
            }
        }
        return sum;
    }
}
