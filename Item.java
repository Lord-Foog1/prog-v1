public abstract class Item implements Pricable{

    private final String name;



    protected Item(String name) {

        this.name = name;

    }

    public String getName() {
        return name;
    }

}

