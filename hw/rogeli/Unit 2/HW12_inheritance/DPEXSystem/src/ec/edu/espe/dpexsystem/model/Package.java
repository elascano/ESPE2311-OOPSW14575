package ec.edu.espe.dpexsystem.model;

/**
 *
 * @author NullPointerException
 */

public class Package {
    private int packageId;
    private Country country;
    private ConsularOffice consularOffice;
    private Constituency constituency;
    private String status;
    private PackageType packageType;
    private float weigth;

    public Package(int packageId, Country country, ConsularOffice consularOffice, Constituency constituency, String status, PackageType packageType, float weigth) {
        this.packageId = packageId;
        this.country = country;
        this.consularOffice = consularOffice;
        this.constituency = constituency;
        this.status = status;
        this.packageType = packageType;
        this.weigth = weigth;
    }
    
    
    public void updateStatus(String status){
        
    }
    
    public void updateShippingStatus(String shippingStatus){
        
    }

    /**
     * @return the packageId
     */
    public int getPackageId() {
        return packageId;
    }

    /**
     * @param packageId the packageId to set
     */
    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    /**
     * @return the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * @return the consularOffice
     */
    public ConsularOffice getConsularOffice() {
        return consularOffice;
    }

    /**
     * @param consularOffice the consularOffice to set
     */
    public void setConsularOffice(ConsularOffice consularOffice) {
        this.consularOffice = consularOffice;
    }

    /**
     * @return the constituency
     */
    public Constituency getConstituency() {
        return constituency;
    }

    /**
     * @param constituency the constituency to set
     */
    public void setConstituency(Constituency constituency) {
        this.constituency = constituency;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the packageType
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /**
     * @param packageType the packageType to set
     */
    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    /**
     * @return the weigth
     */
    public float getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

}
