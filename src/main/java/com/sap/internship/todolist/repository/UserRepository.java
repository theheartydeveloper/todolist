package com.sap.internship.todolist.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sap.internship.todolist.domain.User;

public interface UserRepository extends CrudRepository<User, Long>
{
    Optional<User> findByNickName(String nickName);
}