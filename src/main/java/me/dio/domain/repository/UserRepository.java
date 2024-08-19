package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
