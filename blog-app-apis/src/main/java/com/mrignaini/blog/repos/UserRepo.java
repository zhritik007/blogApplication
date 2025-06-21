package com.mrignaini.blog.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrignaini.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
