package pl.restaurantmenu.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100, nullable = false)
    @NotNull
    @Size(min = 3, max = 100, message = "The name must has min 3 character")
    private String name;

    @Column(length = 100, nullable = false)
    @NotNull
    @Size(min = 3, max = 100, message = "The city must has min 3 character")
    private String city;

    @OneToOne
    private Menu menu;

    public Restaurant() {
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

    public String getCity() {
        return city;
    }

    public void setCity(String address) {
        this.city = address;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
