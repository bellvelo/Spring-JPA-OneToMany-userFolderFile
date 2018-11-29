package com.codeclan.example.userFolderFile.repositories;

import com.codeclan.example.userFolderFile.models.Folder;
import com.codeclan.example.userFolderFile.projections.EmbedForFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = EmbedForFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
