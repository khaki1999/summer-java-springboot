package com.summercoding.bank.backend.repositories;

import com.summercoding.bank.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User,Long>{

}
