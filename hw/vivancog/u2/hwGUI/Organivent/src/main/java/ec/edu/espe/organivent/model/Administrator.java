package ec.edu.espe.organivent.model;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.organivent.utils.Encriptation;
import ec.edu.espe.organivent.utils.HandleInput;
import ec.edu.espe.organivent.utils.UseMongoDB;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class Administrator extends Person{

    private String userName;
    private byte[] password;
    private String email;
    private int phoneNumber;
    
    public static MongoCollection<Administrator> getFromDB(){
       Class classType = Administrator.class;
        String collectionName = "Administrator";
        
        MongoCollection<Administrator> administratorInDB = UseMongoDB.getFromCollection(collectionName, classType);  
        
        return administratorInDB;
    }

    public static void registerAdministrator(){
        
        MongoCollection<Administrator> administratorInDB = Administrator.getFromDB();
        
        ArrayList<Administrator> administratorList = new ArrayList<>();
        administratorInDB.find().into(administratorList);
        
        int asignId = administratorList.size()+1;
        
        System.out.println("Enter a User Name");
        String userName = validateUserName();
        
        System.out.println("Enter your password (at least 10 digits)");
        String password = validatePassword();
        byte[] encriptedPassword = Encriptation.encrypt(password);
        
        System.out.println("Enter your full name");
        String name = HandleInput.insertRealName();
        
        System.out.println("Enter your Email Address");
        String email = validateEmail();
        
        System.out.println("Enter your Phone Number");
        int phoneNumber = validatePhoneNumber();
        
        System.out.println("Enter your Wage");
        float wage = HandleInput.insertPrice();
        
        Administrator generatedAdministrator = new Administrator(userName, encriptedPassword, email, phoneNumber, asignId, name,wage);
        
        administratorInDB.insertOne(generatedAdministrator);
    }
    
    private static String validateUserName(){
        MongoCollection<Administrator> administratorInDB = Administrator.getFromDB();
        ArrayList<Administrator> administratorList = new ArrayList<>();
        administratorInDB.find().into(administratorList);
        
        boolean isTaken=false;
        String userToCheck;
        
 
        do{
            userToCheck = HandleInput.insertNonBlankString();
            for(Administrator currentAdministrator:administratorList){
                if(currentAdministrator.getUserName().equals(userToCheck)){
                    System.out.println("User Name Already taken! Try again");
                    System.out.println("Enter a User Name");
                    isTaken=true;
                    break;
                }else{
                    isTaken=false;
                }
            }    
        }while(isTaken==true);
        
        return userToCheck;
    }
    
    private static String validatePassword(){
        boolean passed=true;
        String passwordToCheck;
        do{
            passwordToCheck = HandleInput.insertNonBlankString();
            if(passwordToCheck.length()<10){
                System.out.println("Password without enough characters!");
                System.out.println("Enter your password (at least 10 digits)");
                passed=false;
            }else{
                passed=true;
                for(char currentchar:passwordToCheck.toCharArray()){
                    if(currentchar == ',' || currentchar == ';' || currentchar == ' ' || currentchar == '\n'){
                        System.out.println("Invalid characters, ',' ';' ' ' ");
                        System.out.println("Enter your password (at least 10 digits)");
                        passed=false;
                        break;
                    }
                }
            }
        }while(passed==false);
        
        return passwordToCheck;
    }
    
    private static int validatePhoneNumber(){
        boolean passed=true;
        int phoneToCheck=0;
 
        do{
            phoneToCheck = HandleInput.insertInteger();
            if(phoneToCheck < 100000000 || phoneToCheck > 999999999 ){
                System.out.println("Invalid phone number");
                System.out.println("Enter your Phone Number");
                passed=false;
            }else{
                passed=true;
            }
        }while(passed==false);
        
        return phoneToCheck;
    }
    
    private static String validateEmail() {
        boolean passed = true;
        String emailToCheck = "";     

        do {
            emailToCheck = HandleInput.insertNonBlankString();
            if (!isValidEmail(emailToCheck)) {
                System.out.println("Invalid email address");
                System.out.println("Enter your Email Address");
                passed = false;
            } else {
                passed = true;
            }
        } while (!passed);

        return emailToCheck;
    }

    private static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    
    public static void logIn(){
        MongoCollection<Administrator> administratorInDB = Administrator.getFromDB();
        
        ArrayList<Administrator> administratorList = new ArrayList<>();
        administratorInDB.find().into(administratorList);
        
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");
        String userToCheck;
        byte[] realPassword=null;
        int attempts=3;
        boolean matchUserName=false;
        
        do{
            System.out.println("Enter your User Name: ");
            System.out.println("Attempts: " + attempts + "/3");
            userToCheck = HandleInput.insertNonBlankString();
            for(Administrator currentAdministrator:administratorList){
                if(currentAdministrator.getUserName().equals(userToCheck)){
                     realPassword=currentAdministrator.getPassword();
                     matchUserName=true;
                     break;
                }
            }
            attempts--;
        }while(attempts>0 && matchUserName==false);
        
        if(attempts>0 || matchUserName==true){
            insertCorrectPassword(realPassword);
        }else{
            System.out.println("Number of attempts ended, try again");
            System.out.println("Press any button to continue");
            scanner.nextLine();
        }
        
        
    }
    
    private static void insertCorrectPassword(byte[] realPassword){
        String tryPassword=null;
        boolean passwordAccepted=false;
        int attempts=3;
        
        do{
             System.out.println("Enter your Password: ");
             System.out.println("Attempts: " + attempts + "/3");
             tryPassword = HandleInput.insertNonBlankString();
             
            passwordAccepted= Encriptation.comparePasswords(tryPassword,realPassword);
            if(passwordAccepted==true){
                administratorMenu();
            }else{
                attempts--;
            }
        }while(attempts>0);
    }
    
    private static void administratorMenu(){
        int option;
        
        do {
            System.out.println("----- ADMINISTRATOR MENU -----");
            System.out.println("-------------------------------");
            System.out.println("__________________________________");
            System.out.println("|    1.- Manage employees        |");
            System.out.println("|    2.- Manage staff            |");
            System.out.println("|    3.- Manage artists          |");
            System.out.println("|    4.- Manage place            |");
            System.out.println("|    5.- Manage equipment        |");
            System.out.println("|    6.- Manage events           |");
            System.out.println("|    7.- Exit                    |");
            System.out.println("__________________________________");
            System.out.println("");
            System.out.println("Select an option (1-7): ");
            option = HandleInput.insertInteger();
            switch (option) {
                case 1:
                    Employee.menu();
                    break;
                case 2:
                    Staff.menu();
                    break;
                case 3:
                    Artist.menu();
                    break;
                case 4:
                    EventPlace.menu();
                    break;
                case 5:
                    Equipment.menu();
                    break;
                case 6:
                    Event.menu();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 7);
    }
    
    public Administrator(){}

    public Administrator(String userName, byte[] password, String email, int phoneNumber, int id, String name, float wage) {
        super(id, name, wage);
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public byte[] getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(byte[] password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}