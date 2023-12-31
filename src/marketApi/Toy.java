package marketApi;

public class Toy {
    private int id;
    private String name;
    private Integer quantity;
    private Double period;

    public Toy(int id, String name, Integer quantity, Double period) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.period = period;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPeriod() {
        return period;
    }

    @Override
    public String toString() {
        return "Игрушка id = " + id + ", название = " + name + ", колличество = " + quantity;
    }
}
