package ec.edu.espe.q6170interface.controller;

import ec.edu.espe.q6170interface.model.Singer;
import java.util.ArrayList;

/**
 *
 * @author Frederick
 */
public interface ISinger {
    public Singer find(int idToSearch);
    public ArrayList<Singer> read();
    public void update(Singer singer);
    public void delete(Singer singer);
}
