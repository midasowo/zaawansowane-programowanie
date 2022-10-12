package obiektowe.collections.restaurant;


import java.util.Objects;

public class Dish {

    private String name;
    private double price;
    private int calories;
    private DishType type;

    public Dish(String name, double price, int calories, DishType type) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Double.compare(dish.price, price) == 0 && calories == dish.calories && Objects.equals(name, dish.name) && type == dish.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, calories, type);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }

    public String getName() {
        return name;
    }

    public DishType getType() {
        return type;
    }
}
