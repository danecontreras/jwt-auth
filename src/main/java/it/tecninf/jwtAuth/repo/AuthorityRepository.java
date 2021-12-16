package it.tecninf.jwtAuth.repo;

import it.tecninf.jwtAuth.model.Authority;
import it.tecninf.jwtAuth.model.AuthorityName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Authority findByName(AuthorityName name);

}
