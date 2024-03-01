package ec.edu.espe.dailyDev.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.dailyDev.utils.FileHandler;
import ec.edu.espe.persistence.controller.MongoDBHandler;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import org.bson.Document;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class Organization {

    private final UUID id;
    private String name;
    private UUID organizationCode;

    public Organization(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.organizationCode = UUID.randomUUID();
    }

    public static ArrayList<Organization> getOrganizationsFromFile() {
        return FileHandler.readFile("./db/organizations.json", new TypeToken<ArrayList<Organization>>() {
        }.getType());
    }

    public static Organization createOrganization() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Organization name:\n");

        //TODO check organizationName is unique;
        String orgName = scanner.nextLine();
        
        Organization newOrg = new Organization(orgName);

        MongoDBHandler mdbHandler = new MongoDBHandler();
        mdbHandler.createDocument(Document.parse(new Gson().toJson(newOrg)), "Organizations");
        
//        ArrayList<Organization> orgs = getOrganizationsFromFile();
//        
//        orgs.add(newOrg);
//        
//        FileHandler.writeFile("./db/organizations.json", orgs);
    
        return  newOrg;
    }

    /**
     * @return the id
     */
    public UUID getId() {
        return id;
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
     * @return the organizationCode
     */
    public UUID getOrganizationCode() {
        return organizationCode;
    }

    /**
     * @param organizationCode the organizationCode to set
     */
    public void setOrganizationCode(UUID organizationCode) {
        this.organizationCode = organizationCode;
    }

}
