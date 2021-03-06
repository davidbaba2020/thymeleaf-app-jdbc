package com.davacom.thymeleafappjdbc.services;


import com.davacom.thymeleafappjdbc.models.User;
import com.davacom.thymeleafappjdbc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User login(String email, String password) {
        User user = userRepository.findByEmailAndPassword(email, password);
        return user;
    }
}
