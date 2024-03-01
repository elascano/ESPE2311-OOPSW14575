package ec.edu.espe.organivent.utils;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class Encriptation {
    public static byte[] encrypt(String password) {
      Key  key = new SecretKeySpec("w1rhi200wtjJcgz150T3F".getBytes(),  0, 16, "AES");
      byte[] encripted=null;
      Cipher chiper;
      
        try {
            chiper = Cipher.getInstance("AES/ECB/PKCS5Padding");
            chiper.init(Cipher.ENCRYPT_MODE, key);
            encripted = chiper.doFinal(password.getBytes());
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
            System.out.println("Something went wrong when encrypting the password"); 
        }
      
      return encripted;
    }
    
    
    private static String decrypt(byte[] encriptedString) {
        Key key = new SecretKeySpec("w1rhi200wtjJcgz150T3F".getBytes(),  0, 16, "AES");
        
        byte[] decryptedBytes=null;
        Cipher chiper;
        
        try {
            chiper = Cipher.getInstance("AES/ECB/PKCS5Padding");
            chiper.init(Cipher.DECRYPT_MODE, key);
            decryptedBytes = chiper.doFinal(encriptedString);
            
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex ) {
            System.out.println("Something went wrong when decrypting the password"); 
        }
        
        return new String(decryptedBytes);
    }
    
    public static boolean comparePasswords(String passwordToCheck, byte[] passwordBytes){
        String realPassword = Encriptation.decrypt(passwordBytes);
        
        boolean passed = realPassword.equals(passwordToCheck);

        return passed;
    }
    
}
