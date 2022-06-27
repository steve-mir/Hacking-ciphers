package CaesarCipher;

public class CaesarCipher {
    
    // Encrypts text using a shift od s
    /**
     * 
     * @param text to encrypt
     * @param s number of shifts
     * @return
     */
    public String encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public String decrypt(String text, int s) {
        return "";
    }
}
