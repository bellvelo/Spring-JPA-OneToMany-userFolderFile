package com.codeclan.example.userFolderFile.repositories;

import com.codeclan.example.userFolderFile.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
