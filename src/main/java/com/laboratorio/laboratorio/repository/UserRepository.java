package com.laboratorio.laboratorio.repository;

import com.laboratorio.laboratorio.repository.model.UserEntity;
import java.util.ArrayList;
import java.util.List;

public interface UserRepository {
    UserEntity save(UserEntity user) ;
    List<UserEntity> findByDni(Integer dni);
    List<UserEntity> findAll();
}
