import ReverseCipher.ReverseCipher;

import CaesarCipher.CaesarCipher;
/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        
        CaesarCipher ca = new CaesarCipher();
        System.out.println(ca.encrypt("yadhtrib yppaH", 12));
    }
}