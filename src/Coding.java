public class Coding {
    private final Alphabet alphabet;

    public Coding(Alphabet alphabet) {
        this.alphabet = alphabet;
    }

    public String encrypt(String textLine, int key) throws ArrayIndexOutOfBoundsException {
        return newText(textLine, key);
    }

    public String decrypt(String textLine, int key) throws ArrayIndexOutOfBoundsException {
        return newText(textLine, -key);
    }

    private String newText(String originText, int key) throws ArrayIndexOutOfBoundsException {
        StringBuilder building = new StringBuilder();
        for (int i = 0; i < originText.length(); i++) {
            char originSymbol = originText.toLowerCase().charAt(i);
            int originIndex = alphabet.indexElement(originSymbol);
            int newIndex = (alphabet.getLength() + (originIndex + key)) % alphabet.getLength();
            building.append(alphabet.element(newIndex));
        }
        return building.toString();
    }
}
