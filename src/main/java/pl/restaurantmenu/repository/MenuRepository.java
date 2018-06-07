package pl.restaurantmenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.restaurantmenu.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
