public class Alphabet {

    private static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е',
            'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
            'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь',
            'э', 'ю', 'я', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            ' ', '.', ',', ';', ':', '!', '?', '(', ')', '"'};

    public int indexElement(char element) throws ArrayIndexOutOfBoundsException {
        try {
            int index = 0;
        for (int i = 0; i <= ALPHABET.length; i++) {
            if (ALPHABET[(i + ALPHABET.length) % ALPHABET.length] == element) {
                index = i;
            }
        }
        return index;

    } catch(ArrayIndexOutOfBoundsException ex) {
        System.out.println ("incorrect index key");
        throw ex;
    }
}

    public char element(int index) throws ArrayIndexOutOfBoundsException {
       try {
           return ALPHABET[index];
       } catch(ArrayIndexOutOfBoundsException ex) {
           System.out.println ("incorrect index key");
           throw ex;
       }
    }

    public int getLength() {
        return ALPHABET.length;
    }
}