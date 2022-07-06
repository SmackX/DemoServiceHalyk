package UserService.DemoServiceHalyk.Repo;

import UserService.DemoServiceHalyk.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long>{
}
