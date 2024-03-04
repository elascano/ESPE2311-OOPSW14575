package ec.edu.espe.organivent.model;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import ec.edu.espe.organivent.utils.HandleInput;
import ec.edu.espe.organivent.utils.UseMongoDB;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.conversions.Bson;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO
 * ESPE
 */
public class Employee extends Person{
    
    private static MongoCollection<Employee> getFromDB(){
        Class classType = Employee.class;
        String collectionName = "Employee";
        
        MongoCollection<Employee> employeeInDB = UseMongoDB.getFromCollection(collectionName, classType);  
        
        return employeeInDB;        
    }
    
    private static void deleteInDB(int idToDelete){
        MongoCollection<Employee> employeeInDB = Employee.getFromDB();
        
        Bson filter = eq("_id", idToDelete);
        employeeInDB.deleteOne(filter);
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("----------- Employee Manager ------------");
            System.out.println("_________________________________________");
            System.out.println("|   1.- See the current employees       |");
            System.out.println("|   2.- Add a new employee              |");
            System.out.println("|   3.- Modify a employee              |");
            System.out.println("|   4.- Delete a employee              |");
            System.out.println("|   5.- Return                          |");
            System.out.println("_______________________________________");
            System.out.println("Select an option (1-5): ");
            option = HandleInput.insertInteger();
            switch (option) {
                case 1:
                    seeEmployees();
                    System.out.println("\nPress any button to return");
                    scanner.nextLine();
                    break;
                case 2:
                    addEmployee();
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    break;
                case 3:
                    modifyEmployee();
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    break;
                case 4: 
                    deleteEmployee();
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (option != 5);

    }

    private static void addEmployee() {
        MongoCollection<Employee> employeeInDB = Employee.getFromDB();
        
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeInDB.find().into(employeeList);
        
        int asignId = employeeList.size()+1;

        System.out.println("Enter the employee's name:");
        String name = HandleInput.insertRealName();
        System.out.println("Enter the employee's hourly wage:");
        float hourlyWage = HandleInput.insertPrice();
        
        Employee addedEmployee = new Employee(asignId, name, hourlyWage);
        
        employeeInDB.insertOne(addedEmployee);
    }

    public static void seeEmployees() {
        MongoCollection<Employee> employeeInDB = Employee.getFromDB();
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeInDB.find().into(employeeList);
        
        System.out.println("Employees:");
        for (Employee currentEmployee : employeeList) {
            System.out.print(currentEmployee);
           } 
        System.out.print("\n");
    }
    
    public static void seeEmployees(ArrayList<Employee> employeeList) {
        System.out.println("Employees:");
        for (Employee currentEmployee : employeeList) {
            System.out.print(currentEmployee);
           } 
        System.out.print("\n");
    }
    
    private static void modifyEmployee(){
        Employee employeeToChange = searchForEmployee();
        int changeFromThisId = employeeToChange.getId();
        
        MongoCollection<Employee> employeeInDB = Employee.getFromDB();
        Bson filter = eq("_id", changeFromThisId);
        Bson updateField;
        
        int option;
        do {
            System.out.println("-------------------------------------");
            System.out.println("|  Employee id: " + employeeToChange.getId());
            System.out.println("|  Employee name: " + employeeToChange.getName());
            System.out.println("|  Employee hourly wage: $" + employeeToChange.getWage());
            System.out.println("|    1.- Update name                |");
            System.out.println("|    2.- Update hourly wage         |");
            System.out.println("|    3.- Return                     |");
            System.out.println("-------------------------------------");
            System.out.println("Select an option (1-3): ");
            option = HandleInput.insertInteger();
            switch (option) {
                case 1:
                    System.out.println("Enter the employee's name:");
                    employeeToChange.setName(HandleInput.insertRealName());
                    updateField = set("name", employeeToChange.getName());
                    
                    employeeInDB.updateOne(filter, updateField);
                    
                    break;
                case 2:
                    System.out.println("Enter the employee's hiring cost:");
                    employeeToChange.setWage(HandleInput.insertPrice());
                    updateField = set("wage", employeeToChange.getWage());
                    
                    employeeInDB.updateOne(filter, updateField);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 3);
    }
    
    public static Employee searchForEmployee(){
        MongoCollection<Employee> employeeInDB = Employee.getFromDB();
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeInDB.find().into(employeeList);
        
        Employee employee =null;
        int searchId;
        boolean passed=false;
        int sizeCount=0;
        
        do{
            sizeCount=0;
            System.out.println("Enter the employee's id:");
            searchId = HandleInput.insertInteger();
            
            for(Employee currentEmployee : employeeList) {
                if(currentEmployee != null && currentEmployee.getId()==searchId){
                    employee=currentEmployee;
                    passed=true;
                    break;
                } else {
                }
                sizeCount++;
            }
            
            if(sizeCount==employeeList.size()){
                System.out.println("The employee: " + searchId + " was not found");
            }
        }while(passed==false);
        
        return employee;
    }
    
    private static void deleteEmployee(){        
        Employee employeeToSearch = searchForEmployee();
        int idToDelete = employeeToSearch.getId();
        
        deleteInDB(idToDelete);
        
    }
    
    public static ArrayList<Employee> enterEmployees() {
        ArrayList<Employee> employeesInEvent = new ArrayList<>();

        int searchId;
        int addMore = 1;
        boolean passed = false;
        int sizeCount = 0;

        do {
            sizeCount = 0;
            System.out.println("Insert the Employee Id to add");
            searchId = HandleInput.insertInteger();

            for (Employee currentEmployee : employeesInEvent) {
                if (currentEmployee.getId() == searchId) {
                    System.out.println("The Id: " + searchId + " is already in this Staff group");
                    passed = false;
                    break;
                }
                sizeCount++;
            }
            if (sizeCount == employeesInEvent.size()) {
                addMore = addEmployeeInEvent(employeesInEvent, searchId);
            }
        } while (passed == false && addMore == 1);

        return employeesInEvent;
    }

    private static int addEmployeeInEvent(ArrayList<Employee> employeesInEvent, int searchId) {
        MongoCollection<Employee> employeeInDB = Employee.getFromDB();
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeInDB.find().into(employeeList);

        int addMore = 1;
        boolean passed = false;
        int sizeCount = 0;

        do {
            sizeCount = 0;
            for (Employee currentEmployee : employeeList) {
                if (currentEmployee.getId() == searchId) {
                    employeesInEvent.add(currentEmployee);
                    passed = true;
                    System.out.println("Want to add another Employee? 1) Yes - 2) No");
                    addMore = HandleInput.insertInteger();
                    break;
                }
                sizeCount++;
            }
            if (sizeCount == employeeList.size()) {
                System.out.println("The Id: " + searchId + " was not found");
                passed = true;
            }
        } while (passed == false && addMore == 1);

        return addMore;
    }

    @Override
    public String toString() {
        return String.format("|Id: %-5d | %-20s |$ %-10.2f per hour|%n", super.getId(), super.getName(), super.getWage());
    }
    
    public Employee(int id, String name, float wage) {
        super(id, name, wage);
    }

    public Employee() {
    }
}
