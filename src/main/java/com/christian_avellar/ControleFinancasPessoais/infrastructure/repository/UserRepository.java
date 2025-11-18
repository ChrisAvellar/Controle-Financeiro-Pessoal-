package com.christian_avellar.ControleFinancasPessoais.infrastructure.repository;

import com.christian_avellar.ControleFinancasPessoais.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);


}
