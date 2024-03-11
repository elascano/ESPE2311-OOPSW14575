package ec.edu.espe.Factory.controller;

import ec.edu.espe.Factory.model.Connection;
/**
 *
 * @author EDWARICHSNAKE
 */
public abstract class Factory {
    public abstract Connection createConnection(String type);
}
