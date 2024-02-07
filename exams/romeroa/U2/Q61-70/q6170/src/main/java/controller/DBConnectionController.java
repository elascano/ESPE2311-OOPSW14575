package controller;

import utils.Settings;

public class DBConnectionController {
    private static ConectionMongoDB conectionMongoDB;

    public static boolean createConnection() {
        conectionMongoDB = new ConectionMongoDB(Settings.MongoURI, Settings.DBName);
        conectionMongoDB.connect(Settings.MongoURI);
        if (conectionMongoDB != null) {
            return true;
        } else {
            return false;
        }
    }

    public static ConectionMongoDB getConection() {
        return conectionMongoDB;
    }
}
