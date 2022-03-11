package com.laboratorio.laboratorio.controller;

import com.laboratorio.laboratorio.service.user.service.UserService;
import com.laboratorio.laboratorio.repository.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserEnpoints {
    @Autowired
    UserService userService;

    public UserDto createUser(UserDto userDto){
        return userService.createUser(userDto);
    }

    public List<UserDto> getUserByDni(Integer dni){
        return userService.getUserByDni(dni);
    }

    public List<UserDto> getUserAll(){
        return userService.getUserAll();
    }
}
