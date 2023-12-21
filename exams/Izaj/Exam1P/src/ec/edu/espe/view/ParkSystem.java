
package ec.edu.espe.view;


import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exam.model.Park;
import ec.edu.espe.icecream.utils.UseJson;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
class ParkSystem {

    public static void main(String[] args) {
        ArrayList<Park> parks = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        UseJson<Park> jsonUtilParks = new UseJson<>();
        parks = jsonUtilParks.readFile("parksdata.json", new TypeToken<ArrayList<Park>>() {
        }.getType());
        if (parks == null) {
        parks = new ArrayList<>(); 
    }
        int optionPark = 0;
        while (optionPark!=4) {
            System.out.println("//////////PARKS/////////");
            System.out.println("1.Enter Park");
            System.out.println("2.Number of parks");
            System.out.println("3.Show parks");
            System.out.println("4.Exit");
            optionPark = scan.nextInt();

            switch (optionPark) {
                case 1:
                    Park.addPark(parks);
                    jsonUtilParks.writeFile("parksdata.json", parks);
                    break;
                case 2:
                    Park.printNumberOfObjects(parks);
                    break;
                case 3:
                    System.out.println("ID       Name            Location");
                    System.out.println("------------------------------------");
                        for (Park park : parks) {
                            System.out.println(park);
                        }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
   
}
