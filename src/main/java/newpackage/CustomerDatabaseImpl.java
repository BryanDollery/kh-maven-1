package newpackage;

import java.util.HashMap;
import java.util.Map;

public class CustomerDatabaseImpl implements CustomerDatabase {
    private Map<Integer, String> customers = new HashMap<>();

    @Override
    public void save(int id, String name) {
        // save in a db
        customers.put(id, name);
    }

    @Override
    public String fetch(int id) {
        // get from a db
        return customers.get(id);
    }
}
