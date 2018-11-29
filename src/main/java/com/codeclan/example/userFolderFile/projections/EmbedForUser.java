package com.codeclan.example.userFolderFile.projections;

import com.codeclan.example.userFolderFile.models.Folder;
import com.codeclan.example.userFolderFile.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedForUser", types = User.class)
public interface EmbedForUser {
    String getName();
    List<Folder> getFolders();

}
