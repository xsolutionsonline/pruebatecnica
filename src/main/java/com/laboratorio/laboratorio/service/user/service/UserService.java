package com.laboratorio.laboratorio.service.user.service;

import com.laboratorio.laboratorio.repository.UserRepository;
import com.laboratorio.laboratorio.repository.model.UserDto;
import com.laboratorio.laboratorio.repository.model.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    @Autowired
    UserRepository userRepository;
    ModelMapper modelMapper = new ModelMapper();

    public UserDto createUser(UserDto userDto){
        // hago la logica
        if(userDto.getDiagnostic()!= null && userDto.getDiagnostic().getSugarPercentage()>70
        && userDto.getDiagnostic().getFatPercentage()>88.5
        && userDto.getDiagnostic().getOxygenPercentage()<60){
            userDto.getDiagnostic().setRisk("ALTO");
        }else if(userDto.getDiagnostic()!= null && userDto.getDiagnostic().getSugarPercentage()<50
                && userDto.getDiagnostic().getFatPercentage()<62.2
                && userDto.getDiagnostic().getOxygenPercentage()>70){
            userDto.getDiagnostic().setRisk("BAJO");
        }else {
            userDto.getDiagnostic().setRisk("MEDIO");
        }
        try {
            UserEntity user =modelMapper.map(userDto,  UserEntity.class);
            UserEntity userEntity = userRepository.save(user);
            return modelMapper.map(userEntity, UserDto.class);
        }catch (Exception e){
            return null;
        }
    }

    public List<UserDto> getUserByDni(Integer dni){
        List<UserEntity> users = userRepository.findByDni(dni);
        modelMapper = new ModelMapper();
        List<UserDto> userRestList = new ArrayList<>();
        users.forEach(user -> userRestList.add(modelMapper.map(user,  UserDto.class)));
        return userRestList;
    }

    public List<UserDto> getUserAll(){
        List<UserEntity> users = userRepository.findAll();
        modelMapper = new ModelMapper();
        List<UserDto> userRestList = new ArrayList<>();
        users.forEach(user -> userRestList.add(modelMapper.map(user,  UserDto.class)));
        return userRestList;
    }
}
