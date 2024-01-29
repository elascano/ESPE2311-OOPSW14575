package ec.edu.espe.organivent1.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import org.apache.commons.lang3.StringUtils;
import org.bson.Document;
import java.util.Scanner;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class Employee implements Serializable {

    private int id;
    private String name;
    private float hourlyWage;
    private String email;
    
    public Employee(int id, String name, float hourlyWage, String email) {
        this.id = id;
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", hourlyWage=" + hourlyWage + ", email=" + email + '}';
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
     * @return the hourlyWage
     */
    public float getHourlyWage() {
        return hourlyWage;
    }

    /**
     * @param hourlyWage the hourlyWage to set
     */
    public void setHourlyWage(float hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
