package ReverseCipher;

public class ReverseCipher {

    public String encode(String text) {
        StringBuffer result = new StringBuffer();

        for (int i = text.length() - 1; i >= 0; i--) {

            result.append(text.charAt(i));
        }

        return result.toString();

    }
      
}
