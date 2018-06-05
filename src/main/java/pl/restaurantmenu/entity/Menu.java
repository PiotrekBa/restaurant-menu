package pl.restaurantmenu.entity;

import java.util.List;

public class Menu {

    private long id;

    private List<Dish> dishes;

    public Menu() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
