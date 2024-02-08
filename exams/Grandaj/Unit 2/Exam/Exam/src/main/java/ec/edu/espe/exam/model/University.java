
package ec.edu.espe.exam.model;

import java.util.HashMap;

/**
 *
 * @author Juan Granda
 */
public class University {
    
    HashMap<Object, Object> mapedData;
    private int id;
    private String name;
    private int year;

    public University(HashMap<Object, Object> mapedData, int id, String name, int year) {
        this.mapedData = mapedData;
        this.id = id;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "University{" + "mapedData=" + mapedData + ", id=" + id + ", name=" + name + ", year=" + year + '}';
    }
    

    public HashMap<Object, Object> getData() {
       return mapedData;
    }

    public HashMap<Object, Object> getMapedData() {
        return mapedData;
    }

    public void setMapedData(HashMap<Object, Object> mapedData) {
        this.mapedData = mapedData;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
