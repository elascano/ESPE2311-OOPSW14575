package ec.edu.espe.dpexarray.model;

/**
 *
 * @author Luis Sagnay
 */
public class Package {
    private int id;
    private String country;
    private String consularOffice;
    private PackageType packageTypes[];

    public Package(int id, String country, String consularOffice, PackageType[] packageTypes) {
        this.id = id;
        this.country = country;
        this.consularOffice = consularOffice;
        this.packageTypes = packageTypes;
    }
    
    

    @Override
    public String toString() {
        String packages = null;
        packages = "Package{" + "id=" + getId() + ", country=" + getCountry() + ", consularOffice=" + getConsularOffice() + ", packageTypes="+ '[';
        
        for(int i=0; i< packageTypes.length; i++){
            packages = packages + packageTypes[i];
        }
        packages = packages + "]}";
        
        return packages;
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
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the consularOffice
     */
    public String getConsularOffice() {
        return consularOffice;
    }

    /**
     * @param consularOffice the consularOffice to set
     */
    public void setConsularOffice(String consularOffice) {
        this.consularOffice = consularOffice;
    }

    /**
     * @return the packageTypes
     */
    public PackageType[] getPackageTypes() {
        return packageTypes;
    }

    /**
     * @param packageTypes the packageTypes to set
     */
    public void setPackageTypes(PackageType[] packageTypes) {
        this.packageTypes = packageTypes;
    }
    
    

    
}
