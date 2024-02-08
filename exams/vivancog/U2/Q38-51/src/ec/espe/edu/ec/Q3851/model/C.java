/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.ec.Q3851.model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class C extends A{
    private ArrayList<E> e;

    public C(ArrayList<E> e, A a) {
        super(a);
        this.e = e;
    }

    public ArrayList<E> getE() {
        return e;
    }

    public void setE(ArrayList<E> e) {
        this.e = e;
    }
    
    public C(A a) {
        super(a);
    }
    
}
