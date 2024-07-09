import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;


public class FileManager {
    public List<String> readFile(String fileName) throws IOException {
        try {
            Path filePath = Path.of(fileName);
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("incorrect file address reading");
            throw e;
        }
    }

    public void writeFile(String fileName, String text) throws IOException {
        try {
            Path filePath = Path.of(fileName);
            Files.writeString(filePath, text);
        } catch (IOException e) {
            System.out.println("incorrect file address writing");
            throw e;
        }
    }
}
