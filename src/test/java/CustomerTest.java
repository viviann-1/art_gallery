import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Gallery gallery;
    Artwork art1;
    Artwork art2;
    Artwork art3;

    
    @BeforeEach
    public void setUp() {
        customer = new Customer("John", 1000);
        gallery = new Gallery("Best Gallery Ever");

        art1 = new Artwork("Starry Night", 100, "Van Gogh");
        art2 = new Artwork("Dove", 200, "Picasso");
        art3 = new Artwork("Sunflower", 300, "Aebel");
        gallery.addArtwork(art1);
        gallery.addArtwork(art2);
        gallery.addArtwork(art3);
    }

    @Test
    public void customerHasName() {
        assertThat(customer.getName()).isEqualTo("John");
    }

    @Test
    public void customerHasWallet() {
        assertThat(customer.getWallet()).isEqualTo(1000);
    }

    @Test
    public void canBuyArtworkFromGallery() {
        // ACT
        customer.buyArtworkFromGallery(art1, gallery);

        // ASSERT
        assertThat(gallery.artworkCount()).isEqualTo(2); // artwork number has gone down
        assertThat(gallery.getTill()).isEqualTo(100); // money in the gallery has gone up
        assertThat(customer.getWallet()).isEqualTo(900); // money the customer has gone down
    }
}
