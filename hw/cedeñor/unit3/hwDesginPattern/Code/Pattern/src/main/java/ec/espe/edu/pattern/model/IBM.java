
package ec.espe.edu.pattern.model;

/**
 *
 * @author Rony
 */
public class IBM extends Stock{
private String symbol; 
private double price;
public IBM(String symbol, double price) { 
    this.symbol = symbol; this.price = price;
}
public double getPrice() { return price;
}

public void setPrice(double price) { 
    this.price = price;
    notifyObservers(new Double(price));
}
public String getSymbol() {
return symbol;
}
public void setSymbol(String symbol) { this.symbol = symbol; notifyObservers(symbol);
}
}
