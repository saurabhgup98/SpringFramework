package com.saurabhtech.learn_spring_boot.learn_rest_api;

import com.saurabhtech.learn_spring_boot.learn_rest_api.socialmedia.entity.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static final List<User> users = new ArrayList<>();
    private static  int userCount = 0;

    static {
        users.add(new User(++userCount,"Saurabh", LocalDate.now().minusYears(31)));
        users.add(new User(++userCount,"Surabhi", LocalDate.now().minusYears(30)));
        users.add(new User(++userCount,"Rash", LocalDate.now().minusYears(29)));
    }

    public List<User> findAll(){
        return users;
    }

    public User getUserById(Integer id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteUserById(Integer id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }

    public User saveUser(User user){
        user.setId(++userCount);
        users.add(user);
        return user;
    }
}
