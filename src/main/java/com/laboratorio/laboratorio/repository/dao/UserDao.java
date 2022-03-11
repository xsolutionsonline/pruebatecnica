package com.laboratorio.laboratorio.repository.dao;

import com.laboratorio.laboratorio.repository.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntity,Integer>{

}
