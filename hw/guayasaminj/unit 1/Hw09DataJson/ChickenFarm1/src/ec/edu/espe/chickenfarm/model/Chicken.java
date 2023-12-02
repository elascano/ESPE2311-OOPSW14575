
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author JosuéG, Erro 404, DCCO-ESPE
 */

import java.time.Period;
import java.time.LocalDate;





public class Chicken  {
  
  private int id ;
  private String name;
  private String color;
  private LocalDate birthDate;
  private boolean isMolting;
 public Chicken(int id, String name, String color,  LocalDate birthDate, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.birthDate = birthDate;
        this.isMolting = isMolting;
   
    }

  public Chicken() {
 }

  public int getId() {
        return id;
 }

  public void setId(int id) {
        this.id = id;
  }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isMolting() {
        return isMolting;
    }

    public void setMolting(boolean molting) {
        isMolting = molting;
    }
    public int calculateAge() {
        if (birthDate != null) {
            LocalDate currentDate = LocalDate.now();
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return -1; 
       }
    
}

}

