package com.burakc.issuemanagement.repository;

import com.burakc.issuemanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
