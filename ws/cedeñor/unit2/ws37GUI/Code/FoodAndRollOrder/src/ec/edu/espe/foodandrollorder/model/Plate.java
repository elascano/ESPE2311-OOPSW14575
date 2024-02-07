package ec.edu.espe.foodandrollorder.model;

public class Plate {
    
    private int id;
    private static int nextId = 1;
    private String name;
    private String description;
    private double price;
    private String availability;
    private  String preparationTime;

    @Override
    public String toString() {
        return "Plate{" + "id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", availability=" + availability + ", preparationTime=" + preparationTime + '}';
    }

    public Plate( String name, String description, double price, String availability, String preparationTime) {
        this.id = nextId++;
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability = availability;
        this.preparationTime = preparationTime;
    }
      
    public void checkAvaiability () {
        
    }
    
    public void getDetails () {
        
    }
    
    public void updatePrice (double newPrice) {
        this.price = newPrice;        
    }
    
    public void updateAvailability (String newAvailability) {
        this.availability = newAvailability;
    }
    
    public void modifyDescription () {
        
    }
    
    public void calculatePreparationTime () {
        
    }
    
    public void addImage () { 
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }
          
}

