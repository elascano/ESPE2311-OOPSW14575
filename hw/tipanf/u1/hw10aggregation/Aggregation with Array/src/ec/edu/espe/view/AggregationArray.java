package ec.edu.espe.view;

import ec.edu.espe.model.Event;
import ec.edu.espe.model.Ticket;
import java.nio.charset.Charset;
import java.util.Random;

/**
 *
 * @author Frederick
 */
public class AggregationArray {
    public static void main(String[] args){      
        
        int numberOfTickets=3;
        Ticket[] tickets = new Ticket[numberOfTickets];
        
        for(int i=0;i<numberOfTickets;i++){
            byte[] array = new byte[10]; // length is bounded by 7
            new Random().nextBytes(array);
            String generatedString = new String(array, Charset.forName("US-ASCII"));
            
            tickets[i] = new Ticket(i+1,10f,generatedString);
        }
        
        
        Event event = new Event(1,"Coliseo General Rumiñahui","Daddy Yankee",tickets);
        
        System.out.println(event);
    
    }
    
    
    
}
