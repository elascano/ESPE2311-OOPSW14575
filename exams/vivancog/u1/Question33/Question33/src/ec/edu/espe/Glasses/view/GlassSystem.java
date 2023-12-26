package ec.edu.espe.Glasses.view;

import ec.edu.espe.Glasses.model.Glasses;
import ec.edu.espe.Glasses.utils.ManageJson;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Gabriel Vivanco - BIt Coderz
 */
public class GlassSystem {
    public static void main(String[] args) {
        
        ManageJson file = new ManageJson();
        ArrayList<Glasses> glasses = file.readFile("glasses.json");
        
         if (glasses == null) {
        // Si la lista es null, inicialízala
        glasses = new ArrayList<>();
    }
        
        menu(glasses);

    }
    public static void menu(ArrayList<Glasses> glasses){
        int option;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("========== GLASSES SYSTEM ==========");
            System.out.println(" 1.- Add a glass");
            System.out.println(" 2.- Show all the glasses");
            System.out.println(" 3.- Exit");
            System.out.println("============================================");
            System.out.println("Insert a option");
            option=scan.nextInt();
            scan.nextLine();
            
            switch(option){
                case 1:
                    glasses.add(addGlasses());
                    ManageJson file = new ManageJson();
                    file.writeFile("glasses.json",glasses);
                    System.out.println("Glass added! Press any button to return");
                    scan.nextLine();
                    break;
                case 2:
                    showGlasses(glasses);
                    System.out.println("Done! Press any button to return");
                    scan.nextLine();
                    break;
                case 3: break;
                default: 
                    System.out.println("Insert a valid number");
                    break;
            }
        }while(option != 3);
    
    }
    
    public static void showGlasses(ArrayList<Glasses> glasses){
        int j=1;
        
        for(Glasses currentGlasses : glasses) {
            System.out.print("\nGlasses [" + j + "]: " + currentGlasses);
            j++;
        }
    }
    
    
    public static Glasses addGlasses(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Set a glasses ID");
            int id = scan.nextInt();
            scan.nextLine();
        
            System.out.println("Enter the type of glasses");
            String type = scan.nextLine();
        
            System.out.println("Enter the color of glasses");
            String color = scan.nextLine();
            
        return new Glasses(id, type, color);
    }
}
