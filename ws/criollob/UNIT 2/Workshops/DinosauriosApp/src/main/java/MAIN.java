/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class MAIN {
    public static void main(String[] args) throws Exception {
        // Tu arreglo de dinosaurios
        Dinosaurio[] dinosaurios = {
            new Dinosaurio("1", "Volador", "Carnívoro", "pterosaurios"),
            new Dinosaurio("2", "Terrestre", "Herbívoro", "Triceratops"),
            new Dinosaurio("3", "Volador", "Piscívoro", "Pteranodon"),
            new Dinosaurio("4", "Acuático", "Carnívoro", "Mosasaurus"),
            new Dinosaurio("5", "Terrestre", "Carnívoro", "Tyrannosaurus rex")
        };

        // Imprimir en la consola
        for (Dinosaurio dino : dinosaurios) {
            System.out.println(dino);
        }
    }
}
