package pl.restaurantmenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.restaurantmenu.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
