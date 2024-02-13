/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.persistence.controller;

import java.util.ArrayList;

/**
 *
 * @author Olivier Paspuel
 */
public interface Persistence {

//    public Object create(Object data);

    public void create(String data);

//    public ArrayList<Object> read(String filterValueterKey, String filterValue, String table);
    public String read(String filterKey, String filterValue, String table);

    public String readAll(String table);

    public boolean update(String filterKey, String filterValue, String newData, String table);

    public boolean delete(String filterKey, String filterValue, String table);
    
}
