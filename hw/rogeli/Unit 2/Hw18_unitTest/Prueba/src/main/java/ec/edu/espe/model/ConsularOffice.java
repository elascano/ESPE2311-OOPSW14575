package ec.edu.espe.model;

/**
 *
 * @author NullPointerException
 */
public class ConsularOffice {

    private String officeName;
    private String address;

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ConsularOffice(String officeName, String address) {
        this.officeName = officeName;
        this.address = address;
    }

    public String getOfficeDetails() {

        return null;

    }
}
