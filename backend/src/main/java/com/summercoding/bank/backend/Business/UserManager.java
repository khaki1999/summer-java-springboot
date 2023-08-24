package com.summercoding.bank.backend.Business;

import com.summercoding.bank.backend.entities.User;
import com.summercoding.bank.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserManager {

    @Autowired
    UserRepository userRepository;
    public void saveUser( String login, String password, String nom , LocalDate dateNaiss ){
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        user.setNom(nom);
        user.setDateNaiss(dateNaiss);

        userRepository.save(user);
    }

    public  User getUserById(Long userId){
        return userRepository.findById(userId).get();
    }
}
