package pl.restaurantmenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.restaurantmenu.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
