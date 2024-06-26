package nailSalon.repo;

import nailSalon.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getUsers();
    Optional<User> findUserById(Integer userId);
    void addUser(User user);
    void deleteById(Integer userId);
}
