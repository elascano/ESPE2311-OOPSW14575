package ec.edu.espe.foodandrollorder.model;

public class RestaurantInformation {
    private String addressOfRestaurant;
    private String phoneNumberOfRestaurant;
    private String emailOfRestaurant;
    private String locationReference;

    public RestaurantInformation(String addressOfRestaurant, String phoneNumberOfRestaurant, String emailOfRestaurant, String locationReference) {
        this.addressOfRestaurant = addressOfRestaurant;
        this.phoneNumberOfRestaurant = phoneNumberOfRestaurant;
        this.emailOfRestaurant = emailOfRestaurant;
        this.locationReference = locationReference;
    }

    @Override
    public String toString() {
        return "RestaurantInformation{" + "addressOfRestaurant=" + addressOfRestaurant + ", phoneNumberOfRestaurant=" + phoneNumberOfRestaurant + ", emailOfRestaurant=" + emailOfRestaurant + ", locationReference=" + locationReference + '}';
    }

    public void showSpecificLocation() {
        System.out.println("***=======================================***");
        System.out.println("       Welcome to the Chifa Michelena Restaurant          ");
        System.out.println("***=======================================***");
        System.out.println("            Food and Roll Orders            ");
        System.out.println("***=======================================***");
        System.out.println("\t" + "Address: " + addressOfRestaurant);
        System.out.println("\t" + "Phone: " + phoneNumberOfRestaurant);
        System.out.println("\t" + "Email: " + emailOfRestaurant);
        System.out.println("\t" + "Location Reference: " + locationReference);
        System.out.println("***=======================================***");
    }

    
    /**
     * @return the addressOfRestaurant
     */
    public String getAddressOfRestaurant() {
        return addressOfRestaurant;
    }

    /**
     * @param addressOfRestaurant the addressOfRestaurant to set
     */
    public void setAddressOfRestaurant(String addressOfRestaurant) {
        this.addressOfRestaurant = addressOfRestaurant;
    }

    /**
     * @return the phoneNumberOfRestaurant
     */
    public String getPhoneNumberOfRestaurant() {
        
        return phoneNumberOfRestaurant;
    }

    /**
     * @param phoneNumberOfRestaurant the phoneNumberOfRestaurant to set
     */
    public void setPhoneNumberOfRestaurant(String phoneNumberOfRestaurant) {
        this.phoneNumberOfRestaurant = phoneNumberOfRestaurant;
    }

    /**
     * @return the emailOfRestaurant
     */
    public String getEmailOfRestaurant() {
        return emailOfRestaurant;
    }

    /**
     * @param emailOfRestaurant the emailOfRestaurant to set
     */
    public void setEmailOfRestaurant(String emailOfRestaurant) {
        this.emailOfRestaurant = emailOfRestaurant;
    }

    /**
     * @return the locationReference
     */
    public String getLocationReference() {
        return locationReference;
    }

    /**
     * @param locationReference the locationReference to set
     */
    public void setLocationReference(String locationReference) {
        this.locationReference = locationReference;
    }
    
    
}
