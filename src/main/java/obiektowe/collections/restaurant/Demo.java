package obiektowe.collections.restaurant;

public class Demo {

    public static void main(String[] args) throws RestaurantException {

        Restaurant restaurant = new Restaurant();

        Dish dish1 = new Dish("Pierogi", 25, 600, DishType.DINNER);
        Dish dish2 = new Dish("Jajecznica", 15, 350, DishType.BREAKFAST);
        Dish dish3 = new Dish("Barszcz czerwony", 20, 300, DishType.APPETISER);
        Dish dish3b = new Dish("Rybna", 25, 350, DishType.APPETISER);
        Dish dish4 = new Dish("Lody", 13, 400, DishType.DESSERT);
        Dish dish5 = new Dish("Lody", 13, 400, DishType.DESSERT);

        restaurant.add(dish1);
        restaurant.add(dish2);
        restaurant.add(dish3);
        restaurant.add(dish3b);
        restaurant.add(dish4);
        restaurant.add(dish5);

        System.out.println(restaurant);
    }

    /*
    * Stwórz obiekt Dish (potrawa), potrawa ma posiadać nazwę, cenę, wartość kaloryczną oraz enum - typ (np. BREAKFAST,
    *  DINNER, APPETIZER).
    Uwaga, żadna z poniższych metod nie powinna drukować nic w konsoli. Wykorzystaj metody toString oraz wartości zwracane
    * lub obsługę wyjątków :)
stwórz klasę Restaurant, zawierającą zbiór dań
stwórz metody pozwalającą dodać danie i usunąć
dodaj do restauracji 5 różnych dań
zaimplementuj metody equals i hashCode aby uniknąć duplikatów i upewnij się, że spełniają swoje zadanie
stwórz metodę pozwalającą wyszukać danie po nazwie, ma ona zwracać obiekt typu Dish, w przypadku nie odnalezienia
* takiego obiektu obiektu ma rzucać wyjątek typu RestaurantException
stwórz metodę pozwalającą wyszukać dania po typie potrawy, jeśli nie ma żadnej potrawy w danym typie, metoda ma zwracać
* pustą listę.
    * */
}
