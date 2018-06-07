package pl.restaurantmenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.restaurantmenu.entity.Dish;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
}
