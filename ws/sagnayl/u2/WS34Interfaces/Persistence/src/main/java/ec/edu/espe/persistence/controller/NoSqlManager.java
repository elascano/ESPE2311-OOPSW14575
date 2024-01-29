package ec.edu.espe.persistence.controller;

import java.util.List;

/**
 *
 * @author Luis Sagnay
 */
public abstract class NoSqlManager implements DBManager {
    public static String URI = "";
    public static String DataBase = "";
    public static String Collection = "";

    public static String getURI() {
        return URI;
    }

    public static void setURI(String URI) {
        NoSqlManager.URI = URI;
    }

    public static String getDataBase() {
        return DataBase;
    }

    public static void setDataBase(String DataBase) {
        NoSqlManager.DataBase = DataBase;
    }

    public static String getCollection() {
        return Collection;
    }

    public static void setCollection(String Collection) {
        NoSqlManager.Collection = Collection;
    }
    
}