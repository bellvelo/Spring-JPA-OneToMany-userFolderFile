package com.codeclan.example.userFolderFile;

import com.codeclan.example.userFolderFile.models.File;
import com.codeclan.example.userFolderFile.models.User;
import com.codeclan.example.userFolderFile.models.Folder;
import com.codeclan.example.userFolderFile.repositories.FileRepository;
import com.codeclan.example.userFolderFile.repositories.FolderRepository;
import com.codeclan.example.userFolderFile.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserFolderFileApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;


    @Test
    public void createFileAndSaveToFolder() {
        User user1 = new User("Dan");
        userRepository.save(user1);
        Folder folder1 = new Folder("Project_One", user1);
        folderRepository.save(folder1);
        File file1 = new File("load_details", ".txt", 23, folder1);
        fileRepository.save(file1);

        folder1.addFile(file1);
        folderRepository.save(folder1);
    }

    @Test
    public void createFolderAndSaveToUser() {
        User user1 = new User("Dan");
        userRepository.save(user1);
        Folder folder1 = new Folder("Project_One", user1);
        folderRepository.save(folder1);
        File file1 = new File("load_details", ".txt", 23, folder1);
        fileRepository.save(file1);

        user1.addFolder(folder1);
        userRepository.save(user1);
    }
}
