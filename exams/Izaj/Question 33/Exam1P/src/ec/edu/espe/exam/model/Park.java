
package ec.edu.espe.exam.model;

import com.google.gson.reflect.TypeToken;
import ec.edu.espe.icecream.utils.UseJson;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Park {
    private int id;
    private String name;
    private String location;

    public Park(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    // Getters and setters

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    
    public static Park fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Park.class);
    }
}

