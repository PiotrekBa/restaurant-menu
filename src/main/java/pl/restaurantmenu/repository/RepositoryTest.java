package pl.restaurantmenu.repository;

import org.springframework.stereotype.Component;
import pl.restaurantmenu.entity.Dish;
import pl.restaurantmenu.entity.Menu;
import pl.restaurantmenu.entity.Restaurant;

import java.util.ArrayList;
import java.util.List;

@Component
public class RepositoryTest {

    private List<Restaurant> restaurants;
    private long nextId = 0;

    public RepositoryTest() {
        getData();
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    private void getData() {
        List<Restaurant> restaurants = new ArrayList<>();

        //Dishes
        Dish dish1_1 = new Dish(1L, "Pizza Margerita", "Delicious", 14.00F);
        Dish dish1_2 = new Dish(2L, "Pizza Fungi", "Delicious", 18.50F);

        List<Dish> dishes1 = new ArrayList<>();
        dishes1.add(dish1_1);
        dishes1.add(dish1_2);

        Dish dish2_1 = new Dish(3L, "Spaghetti Bolonese", "Delicious", 11.00F);
        Dish dish2_2 = new Dish(4L, "Spaghetti Carbonara", "Delicious", 13.00F);

        List<Dish> dishes2 = new ArrayList<>();
        dishes2.add(dish2_1);
        dishes2.add(dish2_2);

        //Menu
        Menu menu1 = new Menu(1L, dishes1);
        Menu menu2 = new Menu(2L, dishes2);

        //Restaurant
        Restaurant restaurant1 = new Restaurant(nextId++, "Molto Bene", "Poznan", menu1);
        Restaurant restaurant2 = new Restaurant(nextId++, "Picobelo", "Warszawa", menu2);

        restaurants.add(restaurant1);
        restaurants.add(restaurant2);

        this.restaurants = restaurants;
    }

    public void add(Restaurant restaurant) {
        restaurant.setId(nextId++);
        restaurants.add(restaurant);
    }

    public Restaurant getById(long id) {
        for(Restaurant r : restaurants) {
            if(r.getId() == id) {
                return r;
            }
        }
        return null;
    }
}
