import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    
    @BeforeEach
    public void setUp() {
        customer = new Customer("John", 1000);
    }

    @Test
    public void customerHasName() {
        assertThat(customer.getName()).isEqualTo("John");
    }

    @Test
    public void customerHasWallet() {
        assertThat(customer.getWallet()).isEqualTo(1000);
    }
}
