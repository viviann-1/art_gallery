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


}
