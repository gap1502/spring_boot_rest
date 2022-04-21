package ru.netology.spring_boot_rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.spring_boot_rest.model.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("admin") && password.equals("12345")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("Basy") && password.equals("4445")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("Ivan") && password.equals("5555")) {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}
