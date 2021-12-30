package com.canturet.diabetestrackingsystemws.repository;

import com.canturet.diabetestrackingsystemws.model.Role;
import com.canturet.diabetestrackingsystemws.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, Long>{
    List<Test> findByUsername(String username);
}
