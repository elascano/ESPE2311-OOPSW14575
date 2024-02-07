package ec.edu.espe.mongoconnection.model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

/**
 *
 * @author NullPointerException
 */
public class ConsularOffice {
    private ObjectId id;

    private int officeId;
    private String officeName;
    private String address;
    private String country;

    public ConsularOffice(int officeId, String officeName, String address, String country) {
        this.officeId = officeId;
        this.officeName = officeName;
        this.address = address;
        this.country = country;
    }

    public ConsularOffice() {
    }

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


    public String getOfficeDetails() {

        return null;

    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return officeName + "\n"
            + "\tID: " + officeId + "\n"
            + "\tCountry: " + country + "\n"
            + "\tAddress: " + address + "\n"
            ;
    }
}
