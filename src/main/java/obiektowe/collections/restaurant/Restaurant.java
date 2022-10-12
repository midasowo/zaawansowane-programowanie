package obiektowe.collections.restaurant;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Restaurant {

    private Set<Dish> dishes = new HashSet<>();

    public void add(Dish dish) {
        dishes.add(dish);
    }

    public void remove(Dish dish) {
        dishes.remove(dish);
    }

    public Dish findDishBy(String name){
        return   dishes.stream()
                .filter(dish -> dish.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new RestaurantException("Nie znaleziono dania!"));
    }

    public Collection<Dish> findDishesBy(DishType type) {
        return dishes.stream()
                .filter(dish -> dish.getType().equals(type))
                .toList();
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "dishes=" + dishes +
                '}';
    }

}
