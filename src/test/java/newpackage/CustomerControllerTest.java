package newpackage;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CustomerControllerTest {
    @Mock
    private CustomerDatabase customerDatabase;

    @InjectMocks
    private CustomerController customerController;

    @Before
    public void setup() {
        when(customerDatabase.fetch(1)).thenReturn("Usain Bolt");
        when(customerDatabase.fetch(2)).thenReturn("Christian Coleman");
    }

    @Test
    public void getByCustomerNumber() {
        assertEquals("Usain Bolt", customerController.getByCustomerNumber(1));
        assertEquals("Christian Coleman", customerController.getByCustomerNumber(2));
    }

    @Test
    public void addCustomer() {
        customerController.add(1, "test1");
        customerController.add(2, "test2");

        verify(customerDatabase).save(1, "test1");
        verify(customerDatabase).save(2, "test2");
    }
}
