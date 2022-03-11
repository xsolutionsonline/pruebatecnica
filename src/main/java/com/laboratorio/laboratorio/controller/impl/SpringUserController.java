package com.laboratorio.laboratorio.controller.impl;

import com.laboratorio.laboratorio.controller.UserEnpoints;
import com.laboratorio.laboratorio.repository.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class SpringUserController {
    @Autowired
    private UserEnpoints userEnpoints;

    @PostMapping("/create")
    UserDto createUser(@RequestBody UserDto userDto) {
        return userEnpoints.createUser(userDto);
    }

    @GetMapping("/{dni}")
    List<UserDto> getUserByDni(@PathVariable Integer dni){
        return userEnpoints.getUserByDni(dni);
    }

    @GetMapping()
    List<UserDto> getUserAll(){
        return userEnpoints.getUserAll();
    }





}
