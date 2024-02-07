package controller;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Luis Sagnay
 */
public interface Persistence {
    public <T> void create(String collection, T object);

    public <T> void update(String collection, T query, T object);
    
    public <T> void delete(String collection, T query);
    
    public <T> Iterator<T> read(String collection, T query);
    public <T> Iterator<T> readAll(String collection, Class<T> clazz);
}