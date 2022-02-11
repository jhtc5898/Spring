package com.pruebasjohn.pruebasjohn.repository;

import com.pruebasjohn.pruebasjohn.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
