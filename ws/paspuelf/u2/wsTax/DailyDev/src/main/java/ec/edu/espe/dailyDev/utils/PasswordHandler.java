package ec.edu.espe.dailyDev.utils;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class PasswordHandler {

    // Función para encriptar la contraseña mediante codificación UTF-8
    public static String encryptPassword(String password) {
        try {
            // Convertir la contraseña a bytes
            byte[] bytes = password.getBytes("UTF-8");

            // Aplicar el desplazamiento a cada byte
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] += 1;
            }

            // Convertir los bytes de nuevo a String
            return new String(bytes, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    public static String encryptPassword(String password) {
//        try {
//            SecureRandom random = new SecureRandom();
//            byte[] salt = new byte[SALT_LENGTH];
//            random.nextBytes(salt);
//
//            byte[] passwordWithSalt = new byte[password.length() + salt.length];
//            System.arraycopy(password.getBytes(), 0, passwordWithSalt, 0, password.length());
//            System.arraycopy(salt, 0, passwordWithSalt, password.length(), salt.length);
//
//            MessageDigest md = MessageDigest.getInstance("SHA-256");
//            byte[] hashedPassword = md.digest(passwordWithSalt);
//
//            StringBuilder hexPassword = new StringBuilder();
//            for (byte b : hashedPassword) {
//                hexPassword.append(String.format("%02x", b));
//            }
//
//            return new EncryptedPassword(hexPassword.toString(), bytesToHexString(salt));
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//            throw new RuntimeException("Error encrypting password.");
//        }
//    }
//    private static String bytesToHexString(byte[] bytes) {
//        StringBuilder hexString = new StringBuilder();
//        for (byte b : bytes) {
//            hexString.append(String.format("%02x", b));
//        }
//        return hexString.toString();
//    }

    // Función para desencriptar la contraseña mediante codificación UTF-8
    public static String decryptPassword(String encryptedPassword) {
        try {
            // Convertir la contraseña a bytes
            byte[] bytes = encryptedPassword.getBytes("UTF-8");

            // Aplicar la reversión del desplazamiento a cada byte
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] -= 1;
            }

            // Convertir los bytes de nuevo a String
            return new String(bytes, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

//private static byte[] hexStringToBytes(String hexString) {
//            int len = hexString.length();
//            byte[] data = new byte[len / 2];
//            for (int i = 0; i < len; i += 2) {
//                data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4)
//                        + Character.digit(hexString.charAt(i + 1), 16));
//            }
//            return data;
//        }
//
//    public static boolean verifyPassword(String password, String encryptedPassword, String salt) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
