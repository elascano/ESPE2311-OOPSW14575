
package espe.edu.chickenfarm.view;
import com.google.gson.Gson;
import espe.edu.chickenfarm.model.Chicken;
import espe.edu.chickenfarm.model.Egg;
import espe.edu.chickenfarm.model.Poop;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import com.google.gson.annotations.SerializedName;



/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class ChickenFamrSystem {
    public static void main(String[] args){
        Chicken chickens[] = new Chicken[5];
         LocalDate fHoy= LocalDate.now();
        
        Poop poop = new Poop();
        Egg egg = new Egg();
        Chicken chicken1= new Chicken(1,"lucy","white",2,true);
        System.out.println("Hello chickens from the simulator");
        System.out.println("My name is  Alex Cuzco ");
        System.out.println("Poop" + poop);  
        System.out.println("egg" + egg); 
        int id=1;
        String name="lucy";
        String color="whithe";
        int age=1;
        boolean isMolting=true;
        int years=0;
        int month=0;
        int day=0;
        Scanner sc = new Scanner(System.in);
        int select=-1;

       do{      
           System.out.println("OPTIONS TO CHOOSE");
           System.out.println("1. ADD CHICKENS");
           System.out.println("0. CLOSE");
           System.out.printf("Chosse an option: ");
           select=sc.nextInt();
		switch(select){ 
        
                    case 1:
                    for(int i=0;i<1;i++){
         
            System.out.println("chicken number "+(i+1));
            System.out.print("Introduce the id: ");
            id = sc.nextInt();  
            System.out.print("Introduce the name: ");
            name = sc.next();
            System.out.print("Introduce the color: ");
            color = sc.next();
            System.out.print("Introduce the age: ");
            age = sc.nextInt();
            System.out.print("is Molting?: ");
            isMolting = sc.nextBoolean();
            
            
             
            //año, mes y dia
         
		System.out.print("Birthday: ");
		day = sc.nextInt();
		System.out.print("Month of birth: ");
		month = sc.nextInt();
		System.out.print("Year of birth: ");
		years = sc.nextInt();
                LocalDate fechaHoy = LocalDate.now();
                LocalDate fechaNacimiento = LocalDate.of(years, month, day);
                Period periodo = Period.between(fechaNacimiento, fechaHoy);
               chickens[i]=new Chicken(id,name,color,age,isMolting);
                System.out.print("\nThe age of the chicken is: " + periodo.getYears()+ " anios");
                System.out.print(" ");
                System.out.println("NEXT CHICKEN");
                System.out.println(" ");
       ChickenFamrSystem chickencvs = new  ChickenFamrSystem();
       chickencvs.writeCVS("pollos.cvs",id,name,color,age,isMolting);
        

         
            
        }
        
            for(int i=0;i<1;i++){
         
            System.out.println("chicken number "+(i+1));
            System.out.println("chicken number "+chickens[i]);
            System.out.println(" ");
       Gson objGson = new Gson();
       String strJson = objGson.toJson(chickens[i]);
       	System.out.println(strJson);
        System.out.println(" ");
        }
            break;
            
                    case 0:
                             System.out.println("THANK YOU");
            break;
                    
                    default:
                        System.out.println("CHOOSE A VALID OPTION");
                }
       }
       while(select!=0);
      

       
                }
    
    void writeCVS(String File, int id, String nombre, String color, int edad, boolean isMolting){

       try{
            FileWriter fileWriter = new FileWriter(File,true);
             BufferedWriter bufferedwriter=new BufferedWriter(fileWriter);
             PrintWriter printwriter = new PrintWriter(bufferedwriter);
             printwriter.println(id + "," + nombre + ","+color+","+edad+","+isMolting);
             
             printwriter.flush();
             printwriter.close();
       }catch (IOException e){
            System.out.println(e);    
    }
    
    }
    
    
}


