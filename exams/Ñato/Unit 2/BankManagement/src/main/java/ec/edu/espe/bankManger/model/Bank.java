
package ec.edu.espe.bankManger.model;

import org.bson.Document;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Bank {
    private int id;
    private String name;
    private int loan;
    private int iva;

    public Bank(int id, String name, int loan, int iva) {
        this.id = id;
        this.name = name;
        this.loan = loan;
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "BankManagement{" + "id=" + getId() + ", name=" + getName() + ", loan=" + getLoan() + ", iva=" + getIva() + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the loan
     */
    public int getLoan() {
        return loan;
    }

    /**
     * @param loan the loan to set
     */
    public void setLoan(int loan) {
        this.loan = loan;
    }

    /**
     * @return the iva
     */
    public int getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(int iva) {
        this.iva = iva;
    }
      public Document toDocument() {

        Document newMeetingDocument = new Document()
                .append("id", getId())
                .append("name", getName())
                .append("loan", getLoan())
                .append("iva", getIva());
        
        return newMeetingDocument;
    }


    
}
