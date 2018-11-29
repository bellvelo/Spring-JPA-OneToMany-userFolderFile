package com.codeclan.example.userFolderFile.projections;


import com.codeclan.example.userFolderFile.models.File;
import com.codeclan.example.userFolderFile.models.Folder;
import com.codeclan.example.userFolderFile.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedForFolder", types = Folder.class)
public interface EmbedForFolder {
    String getTitle();
    User getUser();
    List<File> getFiles();


}
