package pl.restaurantmenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.restaurantmenu.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
