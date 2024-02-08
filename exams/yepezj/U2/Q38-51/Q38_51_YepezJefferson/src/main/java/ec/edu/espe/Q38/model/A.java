
package ec.edu.espe.Q38.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jefferson Yepez, DCCO - ESPE, BitCoderz
 */
public class A {
    private A a;
    private List<A> listA;

    public A(List<A> listA) {
        this.listA = listA;
    }

    @Override
    public String toString() {
        return "A{" + "a=" + a + ", listA=" + listA + '}';
    }
    
    public A(){
        this.a = null;
        this.listA = new ArrayList<>();
    }
    
    public void setA(A a){
        this.a = a;
    }
    
    public void setAList(List<A> listA){
        this.listA = listA;
    }
}
