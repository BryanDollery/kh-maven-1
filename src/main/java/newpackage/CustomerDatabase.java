package newpackage;

public interface CustomerDatabase {
    void save(int id, String name);

    String fetch(int id);
}
