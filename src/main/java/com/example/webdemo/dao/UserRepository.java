package com.example.webdemo.dao;

import com.example.webdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @Package com.example.webdemo.dao
 * @ClassName UserRepository
 * @Author Darrick
 * @Date 2017/11/22 10:53
 * @Description
 * @Versions 1.0
 */
public interface UserRepository extends JpaRepository<User,String>{


    @Query("select t from User t where t.name= :name")
    User findByUserName(@Param("name") String name);
}
