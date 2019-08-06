package by.epam.pretraining.task5.exercise1;

import java.io.File;

public class Directory {

    File directory = new File("D://trainingFolder//directory");
    File newDirectory = new File("D://trainingFolder//renamedDirectory");

    public void renameDirectory() {
        directory.renameTo(newDirectory);
    }

    public void deleteDirectory() {
        boolean deleted = newDirectory.delete();
        if (deleted) {
            System.out.println("\nDirectory deleted");
        }
    }
}
