
package ec.edu.espe.view;


import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

import org.json.JSONArray;
import org.json.JSONObject;

public class LeerArchivoJSON {

    public static void main(String[] args) {
        // Busca el archivo en el directorio del proyecto
        Path directorioProyecto = Paths.get("C:\\Users\\mateo\\OneDrive\\Documentos\\NetBeansProjects\\dino\\build\\classes\\ec\\edu\\espe\\view\\Dinosaurio.json");
        String nombreArchivo = "dinosaurio.json";

        try {
            // Busca el archivo y obtiene la ruta completa
            String rutaCompleta = buscarArchivo(nombreArchivo, directorioProyecto);

            // Si la ruta no es null, significa que se encontró el archivo
            if (rutaCompleta != null) {
                // Lee el contenido del archivo JSON
                String contenido = new String(Files.readAllBytes(Paths.get(rutaCompleta)));

                // Convierte el contenido a un objeto JSON
                JSONObject jsonObject = new JSONObject(contenido);

                // Accede al array "Dinosaurio"
                JSONArray dinosaurios = jsonObject.getJSONArray("Dinosaurio");

                // Itera sobre los elementos del array
                for (int i = 0; i < dinosaurios.length(); i++) {
                    JSONObject dinosaurio = dinosaurios.getJSONObject(i);

                    // Obtiene los valores de las propiedades
                    String color = dinosaurio.getString("Color");
                    String name = dinosaurio.getString("name");
                    String height = dinosaurio.getString("height");
                    int id = dinosaurio.getInt("id");

                    // Imprime la información del dinosaurio
                    System.out.println("Dinosaurio #" + (i + 1));
                    System.out.println("Color: " + color);
                    System.out.println("Nombre: " + name);
                    System.out.println("Altura: " + height);
                    System.out.println("ID: " + id);
                    System.out.println();
                }
            } else {
                System.out.println("El archivo no se encontró en el directorio especificado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String buscarArchivo(String nombreArchivo, Path directorio) {
        try {
            BuscarArchivoVisitor visitor = new BuscarArchivoVisitor(nombreArchivo);
            Files.walkFileTree(directorio, EnumSet.noneOf(FileVisitOption.class), Integer.MAX_VALUE, visitor);
            return visitor.getRutaEncontrada();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static class BuscarArchivoVisitor extends SimpleFileVisitor<Path> {
        private final String nombreArchivo;
        private String rutaEncontrada;

        public BuscarArchivoVisitor(String nombreArchivo) {
            this.nombreArchivo = nombreArchivo;
            this.rutaEncontrada = null;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            if (file.getFileName().toString().equals(nombreArchivo)) {
                rutaEncontrada = file.toString();
                return FileVisitResult.TERMINATE; // Termina la búsqueda cuando se encuentra el archivo
            }
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) {
            return FileVisitResult.CONTINUE;
        }

        public String getRutaEncontrada() {
            return rutaEncontrada;
        }
    }
}
