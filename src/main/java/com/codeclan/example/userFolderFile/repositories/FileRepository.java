package com.codeclan.example.userFolderFile.repositories;

import com.codeclan.example.userFolderFile.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
