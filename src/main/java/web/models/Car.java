package web.models;

public class Car {
    private Long id;
    private String label;
    private int amount;

    public Car(Long id, String label, int amount) {
        this.id = id;
        this.label = label;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
