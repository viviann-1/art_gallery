import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artwork art1;
    Artwork art2;
    Artwork art3;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("Best Gallery Ever");

        art1 = new Artwork("Starry Night", 100, "Van Gogh");
        art2 = new Artwork("Dove", 200, "Picasso");
        art3 = new Artwork("Sunflower", 300, "Aebel");
    }

    @Test
    public void galleryHasName() {
        assertThat(gallery.getName()).isEqualTo("Best Gallery Ever");
    }

    @Test
    public void galleryHasTill() {
        assertThat(gallery.getTill()).isEqualTo(0.0);
    }

    @Test
    public void canAddArtworkToGallery(){
        gallery.addArtwork(art1);
        assertThat(gallery.artworkCount()).isEqualTo(1);
    }

    @Test
    public void canRemoveArtworkFromGallery() {
        gallery.addArtwork(art1);
        gallery.addArtwork(art2);
        gallery.addArtwork(art3);
        gallery.removeArtwork(art3);
        assertThat(gallery.artworkCount()).isEqualTo(2);
    }

    @Test
    public void canBuyArtwork() {
        // ACT
        gallery.addArtwork(art1);
        gallery.addArtwork(art2);
        gallery.addArtwork(art3);
        gallery.buyArtwork(art1);
        // ASSERT
        assertThat(gallery.artworkCount()).isEqualTo(2);
        assertThat(gallery.getTill()).isEqualTo(100);
    }

}
