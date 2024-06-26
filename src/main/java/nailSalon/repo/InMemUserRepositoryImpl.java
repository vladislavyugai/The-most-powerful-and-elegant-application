package nailSalon.repo;

import nailSalon.entity.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class InMemUserRepositoryImpl implements UserRepository {
    private final List<User> users= new ArrayList<>();
    public List<User> getUsers() {
        return users;
    }
    public  Optional<User> findUserById(Integer userId){
        return users.stream()
                .filter(u -> Objects.equals(userId,u.getId()))
                .findFirst();

    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void deleteById(Integer userId){
        this.users.removeIf(user -> Objects.equals(userId, user.getId()));
    }


}
