package com.codeclan.example.userFolderFile.projections;

import com.codeclan.example.userFolderFile.models.File;

import com.codeclan.example.userFolderFile.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedForFile", types = File.class)

public interface EmbedForFile {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolders();
}
