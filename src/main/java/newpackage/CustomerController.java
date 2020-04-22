package newpackage;

public class CustomerController {

    private CustomerDatabase customerDatabase;
    private OrderDatabase orderDatabase;

    public CustomerController(CustomerDatabase customerDatabase, OrderDatabase orderDatabase) {
        this.customerDatabase = customerDatabase;
        this.orderDatabase = orderDatabase;
    }

    public void add(int customerNumber, String customerName) {
        customerDatabase.save(customerNumber, customerName);
        orderDatabase.hasOrders(customerNumber);
    }

    public String getByCustomerNumber(int customerNumber) {
        return customerDatabase.fetch(customerNumber);
    }
}
