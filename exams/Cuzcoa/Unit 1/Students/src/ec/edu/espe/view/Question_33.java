
package ec.edu.espe.view;
import com.google.gson.Gson;
import ec.edu.espe.model.DataStudents;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class Question_33 {
    public static void main(String[] args) {
        Scanner namefile = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner select = new Scanner(System.in);
        String nameA="archive";
        System.out.print("Enter the names's archive: ");
        nameA=namefile.nextLine();
        
        List<DataStudents> StudentList= new ArrayList<>();
        int sel=0;
        int cont=0;
        
        do {
            System.out.println("-----  Inventory Menu  -----");
            System.out.println("1. Input Data");
            System.out.println("2. Save Json");
            System.out.println("3. Cont number Json");
            System.out.println("4. Back");
            System.out.print("Choose an option (1-4): ");
            sel=Integer.parseInt(select.nextLine());
            switch (sel) {
                case 1:
                        for (int i=0; i<4; i++){
                           System.out.println("Enter de data Students");
                           System.out.print("Enter the number list of Student: ");
                           int Id= Integer.parseInt(sc.nextLine());
                           System.out.print("Enter the name's Student: ");
                           String nameStudent= sc.nextLine();
                           System.out.print("Enter the carrer: ");
                           String carrerStudent= sc.nextLine();

                           DataStudents students=new DataStudents(Id, nameStudent, carrerStudent);
                           StudentList.add(students);  
                       }
                    break;
                case 2:
                            for (DataStudents students : StudentList) {
                            System.out.println(students.toString());

                            Gson objGson = new Gson();
                            String strJson = objGson.toJson(students);
                            Question_33 archivo = new Question_33();
                            archivo.writeJSON(nameA,strJson);
                            } 

                            for (DataStudents students : StudentList) {
                            Gson objGson = new Gson();
                            String strJson = objGson.toJson(students);
                                 System.out.println(strJson);
                             } 
                    break;
                case 3:
                        for (DataStudents students : StudentList) {
                             
                              cont++;
                             }  
                        System.out.println("Number of Json: "+cont);
                    break;
                case 4:
                    System.out.println("Returning to the previous menu");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        } while (sel!=4);
   
        
        }
    
         void writeJSON(String File, String strJson){

       try{
            FileWriter fileWriter = new FileWriter(File,true);
            //filewriter; sirve para crear el archivo
             BufferedWriter bufferedwriter=new BufferedWriter(fileWriter);
             //BufferedWriter; para guardar el archivo
             PrintWriter printwriter = new PrintWriter(bufferedwriter);
             //PrintWriter; permisos de modificacion
             printwriter.println(strJson);
             
             printwriter.flush();
             printwriter.close();
             
       }catch (IOException e){
            System.out.println(e);    
    }
}
}
    

