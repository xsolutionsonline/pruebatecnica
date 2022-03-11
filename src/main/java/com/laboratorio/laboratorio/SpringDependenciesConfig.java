package com.laboratorio.laboratorio;

import com.laboratorio.laboratorio.controller.UserEnpoints;
import com.laboratorio.laboratorio.service.user.service.UserService;
import com.laboratorio.laboratorio.repository.adapter.UserAdapterRepository;
import com.laboratorio.laboratorio.repository.dao.UserDao;
import com.laboratorio.laboratorio.repository.model.UserEntity;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "laboratorio")
public class SpringDependenciesConfig {
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplateBuilder().setConnectTimeout(Duration.ofMillis(10000)).build();
    }

    @Bean
    UserAdapterRepository userAdapterRepository() {
        return new UserAdapterRepository();
    }

    @Bean
    UserEnpoints userController() {
        return new UserEnpoints();
    }

    @Bean
    UserService userService() {
        return new UserService();
    }

    @Bean
    UserDao userDao() {
        return new UserDao() {
            @Override
            public List<UserEntity> findAll() {
                return null;
            }

            @Override
            public List<UserEntity> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<UserEntity> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public <S extends UserEntity> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends UserEntity> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends UserEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<UserEntity> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Integer> integers) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public UserEntity getOne(Integer integer) {
                return null;
            }

            @Override
            public UserEntity getById(Integer integer) {
                return null;
            }

            @Override
            public <S extends UserEntity> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends UserEntity> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<UserEntity> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends UserEntity> S save(S entity) {
                return null;
            }

            @Override
            public Optional<UserEntity> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(UserEntity entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Integer> integers) {

            }

            @Override
            public void deleteAll(Iterable<? extends UserEntity> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends UserEntity> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends UserEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends UserEntity> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends UserEntity> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends UserEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };
    }
}
