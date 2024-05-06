import java.util.UUID;

class Customer {
    private String name;
    private String email;
    private String id;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }
}