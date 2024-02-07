
package ec.edu.espe.study.model;

import java.util.Scanner;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Manager {
    private static int contador;
    private int id;
    private String name;
    private String username;
    private String password;

    public Manager(String name, String username, String password) {
        contador++;
        this.id=contador;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" + "id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + '}';
    }

    public int getId(){
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
