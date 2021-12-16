package it.tecninf.jwtAuth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import it.tecninf.jwtAuth.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
