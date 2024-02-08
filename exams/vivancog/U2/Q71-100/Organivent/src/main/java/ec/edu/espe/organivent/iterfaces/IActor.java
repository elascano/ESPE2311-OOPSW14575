package ec.edu.espe.organivent.iterfaces;

import ec.edu.espe.organivent.model.Actor;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Vivanco
 */
public interface IActor {
    public void create(Actor artist);
    public ArrayList<Actor> read();
    public void update(Actor artist);
    public void delete(Actor artist);
}
