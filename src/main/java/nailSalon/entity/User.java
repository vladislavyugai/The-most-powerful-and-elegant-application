package nailSalon.entity;

import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import org.springframework.stereotype.Component;

@Component
public class User {
    private static Integer id;
    private String name;
    private String surname;

    private PhoneNumber phoneNumber;

    public User() {
    }

    public User(String name, String surname, PhoneNumber phoneNumber) {
        id ++;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
