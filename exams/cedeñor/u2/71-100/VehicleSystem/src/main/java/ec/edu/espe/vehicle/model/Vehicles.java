package ec.edu.espe.vehicle.model;

public class Vehicles {

    private int id;
   private String brand;
    private float rentalCost ;
     private int hourlyUse;

    public Vehicles(int id, String brand, float rentalCost, int hourlyUse) {
        this.id = id;
        this.brand = brand;
        this.rentalCost = rentalCost;
        this.hourlyUse = hourlyUse;
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
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the rentalCost
     */
    public float getRentalCost() {
        return rentalCost;
    }

    /**
     * @param rentalCost the rentalCost to set
     */
    public void setRentalCost(float rentalCost) {
        this.rentalCost = rentalCost;
    }

    /**
     * @return the hourlyUse
     */
    public int getHourlyUse() {
        return hourlyUse;
    }

    /**
     * @param hourlyUse the hourlyUse to set
     */
    public void setHourlyUse(int hourlyUse) {
        this.hourlyUse = hourlyUse;
    }

    

}
