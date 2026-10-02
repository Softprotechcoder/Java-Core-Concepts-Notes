package clear_class_File;

import java.io.*;
import java.nio.file.*;

public class ClearClassFiles {
    public static void main(String[] args) throws IOException {
        Path currentDir = Paths.get("").toAbsolutePath();

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(currentDir, "*.class")) {
            for (Path file : stream) {
                Files.delete(file);
                System.out.println("Deleted: " + file.getFileName());
            }
        }

        System.out.println("Done.");
    }
}