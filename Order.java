import java.util.ArrayList;

import java.util.List;
public class Order {

    private long orderNumber = 0;
    private static long counter;
    private final List<Item> items;

    public Order(Item... items) {
        this.items = List.of(items);
        orderNumber = counter++;
    }

    public double getTotalValuePlusVAT(){
        double value = 0;
        for(Item item : items){
            value += item.getPriceWithVAT();
        }
        return value;
    }

    public double getTotalValue(){
        double value = 0;
        for (Item item : items) {
            value += item.getPrice();
        }
        return value;
    }

    public String getReceipt() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Receipt for order #%d\n", orderNumber));
        sb.append(String.format("-----------\n"));
        for (Item item : items) {
            sb.append(item.toString());
            sb.append("\n");
        }
        String total = String.format("Total excl.VAT: %f\n", getTotalValue());
        String totalVAT = String.format("Total incl.VAT: %f\n", getTotalValuePlusVAT());
        sb.append(total).append(totalVAT);
        return sb.toString();
    }
}
