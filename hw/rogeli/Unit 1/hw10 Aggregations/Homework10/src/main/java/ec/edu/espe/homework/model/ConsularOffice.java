/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.homework.model;

/**
 *
 * @author Ilhan
 */
public class ConsularOffice {
    private String officeName;
    private String address;

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ConsularOffice(String officeName, String address) {
        this.officeName = officeName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Consular Office name = " + officeName + ", address = " + address + '}';
    }
    
    
}
