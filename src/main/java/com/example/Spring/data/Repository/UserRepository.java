package com.example.Spring.data.Repository;

import com.example.Spring.data.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,Long > {
    User save (User user);
    Optional<User> findById (Long id);


}
