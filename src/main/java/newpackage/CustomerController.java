package newpackage;

public class CustomerController {

    private CustomerDatabase customerDatabase;

    public CustomerController(CustomerDatabase customerDatabase) {
        this.customerDatabase = customerDatabase;
    }

    public void add(int customerNumber, String customerName) {
        customerDatabase.save(customerNumber, customerName);
    }

    public String getByCustomerNumber(int customerNumber) {
        return customerDatabase.fetch(customerNumber);
    }
}
