import java.util.List;
import java.io.IOException;

public class CryptoCaesar {

    private FileManager manager;

    private Coding coding;

    public CryptoCaesar() {
        this.manager = new FileManager();
        this.coding = new  Coding(new Alphabet());
    }

    public void encrypt(String inputFileName, String outputFileName, int key) throws IOException, ArrayIndexOutOfBoundsException {
        List<String> text = manager.readFile(inputFileName);
        for(String textLine : text) {
            String encryptLine = coding.encrypt(textLine, key);
            manager.writeFile(outputFileName, encryptLine);
        }
    }

    public void decrypt(String inputFileName, String outputFileName, int key) throws IOException, ArrayIndexOutOfBoundsException {
        List<String> text = manager.readFile(inputFileName);
        for(String textLine : text) {
            String decryptedLine = coding.decrypt(textLine, key);
            manager.writeFile(outputFileName, decryptedLine);
        }
    }
}
