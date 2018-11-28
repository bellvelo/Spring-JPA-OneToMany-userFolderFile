package com.codeclan.example.userFolderFile.components;

import com.codeclan.example.userFolderFile.models.File;
import com.codeclan.example.userFolderFile.models.Folder;
import com.codeclan.example.userFolderFile.models.User;
import com.codeclan.example.userFolderFile.repositories.FileRepository;
import com.codeclan.example.userFolderFile.repositories.FolderRepository;
import com.codeclan.example.userFolderFile.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User user1 = new User("David");
        userRepository.save(user1);
        User user2 = new User("Bronte");
        userRepository.save(user2);

        Folder folder1 = new Folder("JavaProject", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("RubyProject", user2);
        folderRepository.save(folder2);
        Folder folder3 = new Folder("JSProject", user2);
        folderRepository.save(folder3);

        File file1 = new File("applRunner", ".rb", 56, folder1);
        fileRepository.save(file1);
        File file2 = new File("ext_file", ".js", 34, folder1);
        fileRepository.save(file2);
        File file3 = new File("Test2_6", ".java", 45, folder2);
        fileRepository.save(file3);
        File file4 = new File("ext_3", ".txt", 67, folder3);
        fileRepository.save(file4);
        File file5 = new File("runnerEXT", ".ext", 23, folder3);
        fileRepository.save(file5);


        folder1.addFile(file1);
        folder1.addFile(file2);

        folder2.addFile(file3);

        user1.addFolder(folder1);
        user1.addFolder(folder2);

        user2.addFolder(folder3);


    }

}
