package com.daladala.daladala.repository;

import com.daladala.daladala.tables.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,String> {
    @Query(value="SELECT `email`, `password`, `usertype` FROM `user` WHERE `email`= ?1",nativeQuery = true)
    public User getByUser(String email);
}
