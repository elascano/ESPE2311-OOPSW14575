package ec.edu.espe.model;

import java.util.Arrays;

/**
 *
 * @author Ilhan
 */
public class Parent {
    private int id;
    private String name;
    private Parent[] parents;
    private boolean isStuding;
    
    public Parent(int id, String name, Parent[] parents) {
        this.id = id;
        this.name = name;
        this.parents = parents;
    } 
        /*
	"Parent": {
		"id":1,
		"name": "Edison",
		"parents": [{
		"Parent": {
		"id":1
		"name":" "
		}
		},
		{"Parent": {
		"id":2
		"name":"Isabel"}
		}],
		"isStuding": false}
		}
        */

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parents=" + Arrays.toString(parents) +
                ", isStuding=" + isStuding +
                '}';

}
}
