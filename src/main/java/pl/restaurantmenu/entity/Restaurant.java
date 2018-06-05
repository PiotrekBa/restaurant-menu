package pl.restaurantmenu.entity;

public class Restaurant {

    private long id;

    private String name;

    private String address;

    private Menu menu;

    public Restaurant() {
    }

    public Restaurant(long id, String name, String address, Menu menu) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.menu = menu;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
