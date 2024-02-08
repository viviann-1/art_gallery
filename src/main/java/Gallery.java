import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String inputName, double inputTill, ArrayList<Artwork> inputStock){
        this.name =inputName;
        this.till =inputTill;
        this.stock =inputStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Artwork> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Artwork> stock) {
        this.stock = stock;
    }
}
