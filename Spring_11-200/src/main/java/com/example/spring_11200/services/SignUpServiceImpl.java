package com.example.spring_11200.services;

import com.example.spring_11200.dto.UserForm;
import com.example.spring_11200.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.spring_11200.repositores.UsersRepository;

@Component
public class SignUpServiceImpl implements SignUpService {

   @Autowired
   private UsersRepository usersRepository;
    @Override
    public void addUser(UserForm form) {
        User user = User.builder()
                .email(form.getEmail())
                .password(form.getPassword())
                .build();
        usersRepository.save(user);
    }
}