import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String inputName){
        this.name =inputName;
        this.till = 0.0;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public double getTill() {
        return this.till;
    }

    public int artworkCount() {
        return this.stock.size();
    }

    public void addArtwork(Artwork art) {
        this.stock.add(art);
    }

    public void removeArtwork(Artwork art){
        this.stock.remove(art);
    }
}
