package com.example.newlywed.repositories;

import com.example.newlywed.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
//to perform crud
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   User findByUsername(String username);

   User findById(long Id);

}
