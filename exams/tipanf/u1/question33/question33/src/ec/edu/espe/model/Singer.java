package ec.edu.espe.model;

import com.google.gson.reflect.TypeToken;
import ec.edu.espe.utils.ManajeGson;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Frederick
 */
public class Singer {
    private int id;
    private String name;
    private float hiringCost;
    
     public static ArrayList<Singer> getFromFile(){
        Type type = new TypeToken<ArrayList<Singer>>(){}.getType();
        ArrayList<Singer> administratorList = ManajeGson.readFile("data/singers.json",type);
        return administratorList;
    }
     
     public static void addSingers(ArrayList<Singer> singerList){
        Scanner scan = new Scanner(System.in);
        int id=0;
        String name="";
        float hiringCost=0;
        
        for(int i=0;i<5;i++){
            System.out.println("Enter the singer ID");
            id = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter the singer name");
            name = scan.nextLine();
        
            System.out.println("Enter the singer hiring cost");
            hiringCost = scan.nextFloat();
            scan.nextLine();

            singerList.add(new Singer(id,name,hiringCost));
        }
        ManajeGson.writeFile("data/singers.json",singerList);
     }
     
    public static void deleteSingers(ArrayList<Singer> singerList){
        int listSize = singerList.size();
        System.out.println("Id |       Name          | Hiring Cost|");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        for(int i=0;i < listSize;i++){
            System.out.println(singerList.get(0));
            singerList.remove(0);
            System.out.println("WAS DELETED!\n");
        }
       ManajeGson.writeFile("data/singers.json",singerList);
    }
    
    

    @Override
    public String toString() {
        return " " + id + "  " + name + "     $" + hiringCost;
    }
    
    
    

    public Singer(int id, String name, float hiringCost) {
        this.id = id;
        this.name = name;
        this.hiringCost = hiringCost;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the hiringCost
     */
    public float getHiringCost() {
        return hiringCost;
    }

    /**
     * @param hiringCost the hiringCost to set
     */
    public void setHiringCost(float hiringCost) {
        this.hiringCost = hiringCost;
    }
    
    
    
}
