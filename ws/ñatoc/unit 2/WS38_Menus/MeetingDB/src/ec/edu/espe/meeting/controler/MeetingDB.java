//package ec.edu.espe.meeting.controler;
//
////import com.google.gson.Gson;
////import com.google.gson.GsonBuilder;
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoCollection;
//import java.util.Scanner;
//import meetingdb.newpackage.CConexion;
//import meetingdb.newpackage.Meeting;
//import org.bson.Document;
//
///**
// *
// * @author Carlos Ñato, The Javas, DCC-ESPE
// */
//public class MeetingDB {
//
//  private static final Scanner scanner = new Scanner(System.in); 
//
//    public static void main(String[] args) {
//        MongoClient mongoClient = CConexion.createConexion();
//        while (true) {
//            Meeting.printMeeting();
//            System.out.println("Enter the option");
//            int option = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (option) {
//                case 1 -> createNewMeeting(mongoClient);
//                case 2 -> findMeetingBytitle(mongoClient);
//                case 3 -> deletMeeting(mongoClient);
//                case 4 -> updateMeetingBytitle(mongoClient);
//                case 0 -> {
//                    try (mongoClient) {
//                        System.out.println("Exiting the program..");
//                    }
//                    System.exit(0);
//                }
//
//                default -> System.out.println("Invalid option. Please choose a valid option.");
//            }
//        }
//
//    }
//
//
//    private static void createNewMeeting(MongoClient mongoClient) {
//        MongoCollection<Document> collection = CConexion.getCollection(mongoClient);
//
//        System.out.println("Enter the title of the new meeting:");
//        String title = scanner.nextLine();
//
//        System.out.println("Enter the start Time of Meeting");
//        String starTime = scanner.nextLine();
//
//        System.out.println("Enter the end Time of Meeting");
//        String endTime = scanner.nextLine();
//
//        Meeting newMeeting = new Meeting(title, starTime, endTime);
//        collection.insertOne(newMeeting.toDocument());
//        System.out.println("Meeting register successfully");
//    }
//
//    
//    private static void findMeetingBytitle(MongoClient mongoClient) {
//        MongoCollection<Document> collection = CConexion.getCollection(mongoClient);
//        
//        System.out.println("Enter the title the Meeting to find");
//        String titleToFind = scanner.nextLine();
//        
//        Document foundMeeting = collection.find(new Document("title", titleToFind)).first();
//        
//        if (foundMeeting != null) {
//            Meeting meet = Meeting.fromDocument(foundMeeting);
//            System.out.println("Meeting found:\n" + meet.toString());
//        } else {
//            System.out.println("Meeting not found with the given title: " + titleToFind);
//        }
//    }
//
//    
//    private static void updateMeetingBytitle(MongoClient mongoClient){
//        MongoCollection<Document> collection = CConexion.getCollection(mongoClient);
//        System.out.println("Enter the title the Meeting to update");
//        String titleToUpdate = scanner.nextLine();
//
//        Document exitingMeeting = collection.find(new Document("title", titleToUpdate)).first();
//
//        if (exitingMeeting != null) {
//
//            System.out.println("Enter the new starttime");
//            String newstartTime = scanner.nextLine();
//
//            System.out.println("Enter the new endtime");
//            String newendTime = scanner.nextLine();
//
//            collection.updateOne(
//                    new Document("title", titleToUpdate),
//                    new Document("$set", new Document("startTime", newstartTime)
//                            .append("endTime", newendTime))
//            );
//
//            System.out.println("Meeting upfate successfully.");
//
//            Document updateMeeting = collection.find(new Document("title", titleToUpdate)).first();
//            Meeting meet = Meeting.fromDocument(updateMeeting);
//            System.out.println("\nUpdate information of the meeting:" + meet);
//        } else {
//            System.out.println("No meeting found whit the providesd title.");
//        }
//    }
//     
//    private static void deletMeeting(MongoClient mongoClient) {
//        MongoCollection<Document> collection = CConexion.getCollection(mongoClient);
//        System.out.println("Enter the title the Meeting to delet");
//        String titleToDelet = scanner.nextLine();
//        Document foundMeeting = collection.find(new Document("title", titleToDelet)).first();
//        if (foundMeeting != null) {
//            collection.deleteOne(new Document("title", titleToDelet));
//           
//            System.out.println("Meeting delet successfully:\n");
//        } else {
//            System.out.println("No meeting delet with the privided title.");
//        }
//        
//        
//
//    }
//   
//    
//}
