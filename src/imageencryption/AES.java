package imageencryption;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AES {

    private static final String ALGO = "AES";

    public static String encrypt(String Data, String pass) throws Exception {
        Key key = generateKey(pass);
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(Data.getBytes());
        String encryptedValue = new String(encVal)/*new BASE64Encoder().encode(encVal)*/;
        return encryptedValue;
    }

    public static String decrypt(String encryptedData, String pass) throws Exception {
        Key key = generateKey(pass);
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = encryptedData.getBytes()/*new BASE64Decoder().decodeBuffer(encryptedData)*/;
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }

    private static Key generateKey(String pass) throws Exception {
        Key key = new SecretKeySpec(pass.getBytes(), ALGO);
        return key;
    }
}