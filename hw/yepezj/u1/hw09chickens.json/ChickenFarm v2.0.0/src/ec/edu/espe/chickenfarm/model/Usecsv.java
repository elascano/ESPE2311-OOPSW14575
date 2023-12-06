package ec.edu.espe.ChickenFarm.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Frederick Tipán - Bit Coderz - DCCO ESPE
 */
public class Usecsv {
    
    private BufferedReader lector;
    private String line;
    private String field[] = null;
    private int var=0;
    
    public void readFile(String fileAdress,ArrayList<Chicken> chickens){
        try {
         
         lector =new BufferedReader(new FileReader(fileAdress));
         while ((line = lector.readLine()) != null) {
            field = line.split(";");
            
            if(var > 0){
                chickens.add(asignValues());
                var=1;
            }

            var++;
            
         }
         lector.close();
         line=null;
         field=null;
         
         
      } catch (Exception e) {
    
    }
    
   }
    
    public void writeFile(String fileAdress, ArrayList<Chicken> chickens){
        int maxSize = chickens.size();
        maxSize--;
        int position=0;
        try {
            while(position < maxSize){
                position++;
            }
            
               FileWriter writer = new FileWriter(fileAdress, true);
               BufferedWriter bufferedWriter = new BufferedWriter(writer);
               PrintWriter printWriter = new PrintWriter(bufferedWriter);
               printWriter.println(chickens.get(position).getId() + ";" + chickens.get(position).getName() + ";" + chickens.get(position).getColor() + ";" + chickens.get(position).getBirthDate().getDay() + ";" + chickens.get(position).getBirthDate().getMonth() + ";" + chickens.get(position).getBirthDate().getYear() + ";" + chickens.get(position).getAge() + ";" + chickens.get(position).getIsMolting());
               position++;
               
               printWriter.flush();
               printWriter.close();
            
        }catch (Exception e){
            
        }
    }
    
    
    public Chicken asignValues(){        
        Date birthdate=new Date(0,0,0);
        
        int id=Integer.parseInt(field[0]);
        String name=field[1];
        String color=field[2];
        birthdate.setDay(Integer.parseInt(field[3]));
        birthdate.setMonth(Integer.parseInt(field[4]));
        birthdate.setYear(Integer.parseInt(field[5]));
        int age=Integer.parseInt(field[6]);
        boolean isMolting=Boolean.parseBoolean(field[7]);

       return new Chicken(id,name,color,birthdate,age,isMolting);
    }
}
