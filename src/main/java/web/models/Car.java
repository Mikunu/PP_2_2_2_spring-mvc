package web.models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return amount == car.amount && Objects.equals(id, car.id) && Objects.equals(label, car.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, amount);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", amount=" + amount +
                '}';
    }
}
