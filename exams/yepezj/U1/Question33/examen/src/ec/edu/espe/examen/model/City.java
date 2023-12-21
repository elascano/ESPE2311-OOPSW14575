package ec.edu.espe.examen.model;

import java.util.Scanner;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class City {

    private int id;
    private String name;
    private int totalPopulation;

    public static City createCity(){
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter the id of the city:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the name of the city: ");
        String name = scanner.nextLine();
        System.out.println("Enter the total number of inhabitants ");
        int totalPopulation = scanner.nextInt();
        
        return new City(id, name, totalPopulation);
    }

    @Override
    public String toString() {
        return "Cities{" + "id=" + id + ", name=" + name + ", totalPopulation=" + totalPopulation + '}';
    }

    public City(int id, String name, int totalPopulation) {
        this.id = id;
        this.name = name;
        this.totalPopulation = totalPopulation;
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
     * @return the totalPopulation
     */
    public int getTotalPopulation() {
        return totalPopulation;
    }

    /**
     * @param totalPopulation the totalPopulation to set
     */
    public void setTotalPopulation(int totalPopulation) {
        this.totalPopulation = totalPopulation;
    }
    
    
    
}
