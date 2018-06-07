package pl.restaurantmenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.restaurantmenu.entity.Dish;

public interface DishRepository extends JpaRepository<Dish, Long> {
}
