package nailSalon.services;

import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import nailSalon.entity.User;

import java.util.Optional;

public interface UserService {
     Optional<User> findUser(Integer id);
     void saveUser(String name, String surname, PhoneNumber phoneNumber);

     void updateUser(Integer userId, String name, String surname, PhoneNumber phoneNumber);

    void deleteUser(Integer id);

}
