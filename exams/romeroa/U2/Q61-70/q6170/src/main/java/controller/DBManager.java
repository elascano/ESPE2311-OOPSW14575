package controller;

/**
 *
 * @author Luis Sagnay
 */
public abstract class DBManager implements Persistence {
    public static String URI = "";
    public static String DataBase = "";
    public static String Collection = "";

    public static String getURI() {
        return URI;
    }

    public static void setURI(String URI) {
        DBManager.URI = URI;
    }

    public static String getDataBase() {
        return DataBase;
    }

    public static void setDataBase(String DataBase) {
        DBManager.DataBase = DataBase;
    }

    public static String getCollection() {
        return Collection;
    }

    public static void setCollection(String Collection) {
        DBManager.Collection = Collection;
    }
    
    public abstract void connect (String URI);
    
}