package util;

import entity.User;
import exception.FileReadingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserFileReader {
    public List<User> read(String pathToFile) {
        if (pathToFile == null) {
            throw new FileReadingException("Null path to file in read method");
        }

        File file = new File(pathToFile);
        List<User> clients = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                User client = UserBuilder.buildUser(scanner.nextLine());
                if (client != null) {
                    clients.add(client);
                }
            }
            return clients;
        } catch (FileNotFoundException e) {
            throw new FileReadingException("Error in reading file: " + e.getMessage(), e);
        }
    }
}
