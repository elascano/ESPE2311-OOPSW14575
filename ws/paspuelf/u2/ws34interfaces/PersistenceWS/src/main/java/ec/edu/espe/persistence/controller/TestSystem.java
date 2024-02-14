
package ec.edu.espe.persistence.controller;

/**
 *
 * @author Olivier Paspuel
 */
public class TestSystem {
    public static void main(String[] args) {
        MongoDBHandler mdbHandler = new MongoDBHandler();
        mdbHandler.create("im tired boss");
    }
}
