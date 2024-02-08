import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ArtworkTest {

    Artwork artwork;

    @BeforeEach
    public void setUp() {
        artwork =  new Artwork("Starry Night", 100, "Van Gogh");
    }

    @Test
    public void artworkHasTitle() {
        assertThat(artwork.getTitle()).isEqualTo("Starry Night");
    }

    @Test
    public void artworkHasPrice() {
        assertThat(artwork.getPrice()).isEqualTo(100);
    }

    @Test
    public void artworkHasArtist() {
        assertThat(artwork.getArtist()).isEqualTo("Van Gogh");
    }

}
