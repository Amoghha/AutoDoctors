package com.WinOrbooze.AutoDoctors.repository;

import com.WinOrbooze.AutoDoctors.modle.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User,Integer> {
}
