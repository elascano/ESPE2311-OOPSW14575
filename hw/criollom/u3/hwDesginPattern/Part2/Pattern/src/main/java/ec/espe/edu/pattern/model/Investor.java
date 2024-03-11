
package ec.espe.edu.pattern.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Investor implements IInvestor {
    private String name;
    private String observerState;
    private Stock stock;
    public Investor(String name) {
    this.name = name;
    }
    
    @Override
    public void update(Stock stock, Object args) {
    System.out.println("Notified observer" + name);
    if (args instanceof String) {
    System.out.println("The symbol of " + stock.symbol + "changed to: " + args);
    }
    else if (args instanceof Double) {
    }
    System.out.println("The price of " + stock.symbol + "changed to: " + args);
    }
}
