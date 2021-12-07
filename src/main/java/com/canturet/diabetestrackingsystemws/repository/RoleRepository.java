package com.canturet.diabetestrackingsystemws.repository;

import com.canturet.diabetestrackingsystemws.model.ERole;
import com.canturet.diabetestrackingsystemws.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
