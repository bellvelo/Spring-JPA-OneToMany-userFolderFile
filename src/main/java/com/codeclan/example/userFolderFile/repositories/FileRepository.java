package com.codeclan.example.userFolderFile.repositories;

import com.codeclan.example.userFolderFile.models.File;
import com.codeclan.example.userFolderFile.projections.EmbedForFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedForFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
