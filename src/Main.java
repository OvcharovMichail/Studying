import java.util.Scanner;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Object {

    private static Scanner scanner;

    private static CryptoCaesar cryptoCaesar;

    public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
        scanner = new Scanner(System.in);
        cryptoCaesar = new CryptoCaesar();
        String message = ("Добро пожаловать!\n" +
                        "Список команд:\n" +
                        "1 - шифровка\n" +
                        "2 - дешифровка\n" +
                        "3 - выход");
        int counter = 0;
        while (counter == 0) {
            System.out.println(message);
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    System.out.println("Введите имя файла для чтения(пример: c:\\texts\\crypto.txt)");
                    String inputFileName1 = scanner.nextLine();
                    System.out.println("Введите имя файла для записи(пример: c:\\texts\\crypto.txt)");
                    String outputFileName1 = scanner.nextLine();
                    System.out.println("Введите ключ");
                    int key1 = scanner.nextInt();
                    cryptoCaesar.encrypt(inputFileName1, outputFileName1, key1);
                    break;
                case "2":
                    System.out.println("Введите имя файла для чтения(пример: c:\\texts\\crypto.txt)");
                    String inputFileName2 = scanner.nextLine();
                    System.out.println("Введите имя файла для записи(пример: c:\\texts\\crypto.txt)");
                    String outputFileName2 = scanner.nextLine();
                    System.out.println("Введите ключ");
                    int key2 = scanner.nextInt();
                    cryptoCaesar.decrypt(inputFileName2, outputFileName2, key2);
                    break;
                case "3":
                    counter = 1;
                    scanner.close();
            }
        }
    }
}