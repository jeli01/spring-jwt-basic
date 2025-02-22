package io.github.jeli01.securitystudy.auth.repository;

import io.github.jeli01.securitystudy.auth.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Boolean existsByUsername(String username);
    UserEntity findByUsername(String username);
}
