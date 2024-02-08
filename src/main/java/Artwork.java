public class Artwork {
    private String title;
    private double price;
    private String artist;

    public Artwork(String inputTitle, double inputPrice, String inputArtist){
        this.title = inputTitle;
        this.price = inputPrice;
        this.artist = inputArtist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
