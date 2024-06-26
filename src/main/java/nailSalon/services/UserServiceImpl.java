package nailSalon.services;

import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import nailSalon.entity.User;
import nailSalon.repo.UserRepository;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository inMemUserRepositoryImpl1){
        userRepository = inMemUserRepositoryImpl1;
            }
    @Override
    public Optional<User> findUser(Integer userId){
        return this.userRepository.findUserById(userId);
    }

    @Override
    public void saveUser(String name, String surname, PhoneNumber phoneNumber) {
        this.userRepository.addUser(new User(name, surname, phoneNumber));
    }

    @Override
    public void updateUser(Integer userId, String name, String surname, PhoneNumber phoneNumber) {
        this.userRepository.findUserById(userId)
                .ifPresentOrElse(user -> {
                    user.setName(name);
                    user.setSurname(surname);
                    user.setPhoneNumber(phoneNumber);
                }, ()-> {throw new NoSuchElementException();
                });
    }

    @Override
    public void deleteUser(Integer userId) {
        this.userRepository.deleteById(userId);
    }
}
