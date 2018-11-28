package com.codeclan.example.userFolderFile.repositories;

import com.codeclan.example.userFolderFile.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
