package ec.edu.espe.Chickenfarm.model;

/**
 *
 * @author Gabriel Vivanco - Bit Coderz - DCCO ESPE
 */
import java.time.LocalDate;


public class Chicken {
    public int id;
    public String name;
    public String color;
    public LocalDate birthDate;
    public boolean isMolting;

    
    public Chicken(int id, String name, String color, LocalDate birthDate, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.birthDate = birthDate;
        this.isMolting = isMolting;
    }

    public Chicken(int id, String name, String color, int ageYears, int ageMonths, int ageDays, boolean isMolting) {
        LocalDate currentDate = LocalDate.now();

        LocalDate calculatedBirthDate = currentDate.minusYears(ageYears).minusMonths(ageMonths).minusDays(ageDays);

        this.id = id;
        this.name = name;
        this.color = color;
        this.birthDate = calculatedBirthDate;
        this.isMolting = isMolting;
    }

    public Chicken() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public boolean isMolting() {
        return isIsMolting();
    }

    // Método toString para imprimir la información del pollo
    @Override
    public String toString() {
        return "Chicken{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", birthDate=" + getBirthDate() +
                ", isMolting=" + isIsMolting() +
                '}';
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
}