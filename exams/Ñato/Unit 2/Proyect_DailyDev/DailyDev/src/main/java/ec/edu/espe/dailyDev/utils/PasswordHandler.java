package ec.edu.espe.dailyDev.utils;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class PasswordHandler {

    public static String encryptPassword(String password) {
        try {
            byte[] bytes = password.getBytes("UTF-8");

            for (int i = 0; i < bytes.length; i++) {
                bytes[i] += 1;
            }

            return new String(bytes, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String decryptPassword(String encryptedPassword) {
        try {
            
            byte[] bytes = encryptedPassword.getBytes("UTF-8");

            for (int i = 0; i < bytes.length; i++) {
                bytes[i] -= 1;
            }

            return new String(bytes, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
