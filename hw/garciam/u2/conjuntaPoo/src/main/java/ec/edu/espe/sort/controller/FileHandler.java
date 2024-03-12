package ec.edu.espe.sort.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class FileHandler {
    public void saveTXTFile(String data, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
            System.out.println("File Created Successfully");
        } catch (IOException e) {
            System.out.println("Something went wrong creating the file: " + e.getMessage());
        }
    }

    public String getDesktopPath() {
        return System.getProperty("user.home") + "/Desktop";
    }

    private static class ListParameterizedType implements ParameterizedType {

        private final Type type;

        private ListParameterizedType(Class<?> type) {
            this.type = type;
        }

        @Override
        public Type[] getActualTypeArguments() {
            return new Type[]{type};
        }

        @Override
        public Type getRawType() {
            return ArrayList.class;
        }

        @Override
        public Type getOwnerType() {
            return null;
        }
    }

}
