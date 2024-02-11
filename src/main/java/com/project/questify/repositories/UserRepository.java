package com.project.questify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.questify.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

}
