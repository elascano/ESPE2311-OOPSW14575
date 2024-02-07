package ec.edu.espe.persistance.controller;

/**
 *
 * @author mateo
 */
public abstract class INoSqlManager implements IDBManager {

    public static String URI = "";
    public static String DataBase = "";
    public static String Collection = "";

    public static String getURI() {
        return URI;
    }

    public static void setURI(String URI) {
        INoSqlManager.URI = URI;
    }

    public static String getDataBase() {
        return DataBase;
    }

    public static void setDataBase(String DataBase) {
        INoSqlManager.DataBase = DataBase;
    }

    public static String getCollection() {
        return Collection;
    }

    public static void setCollection(String Collection) {
        INoSqlManager.Collection = Collection;
    }

}
