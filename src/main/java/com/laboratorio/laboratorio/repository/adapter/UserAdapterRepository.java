package com.laboratorio.laboratorio.repository.adapter;

import com.laboratorio.laboratorio.repository.UserRepository;
import com.laboratorio.laboratorio.repository.dao.UserDao;
import com.laboratorio.laboratorio.repository.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collections;
import java.util.List;


public class UserAdapterRepository implements UserRepository {
    @Autowired
    UserDao userDao;

    @Override
    public UserEntity save(UserEntity user) {
        return userDao.save(user);
    }

    @Override
    public List<UserEntity> findByDni(Integer dni) {
        return userDao.findById(dni).map(Collections::singletonList)
                .orElseGet(Collections::emptyList);
    }

    @Override
    public List<UserEntity> findAll() {
        return userDao.findAll();
    }
}
