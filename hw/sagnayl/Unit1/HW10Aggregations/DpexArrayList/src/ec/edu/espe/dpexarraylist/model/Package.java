package ec.edu.espe.dpexarraylist.model;

/**
 *
 * @author Luis Sagnay
 */
public class Package {
    private int id;
    private String country;
    private String consularOffice;

    public Package(int id, String country, String consularOffice) {
        this.id = id;
        this.country = country;
        this.consularOffice = consularOffice;
    }

    @Override
    public String toString() {
        return "Package{" + "id=" + getId() + ", country=" + getCountry() + ", consularOffice=" + getConsularOffice() + '}';
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
    
    
}
