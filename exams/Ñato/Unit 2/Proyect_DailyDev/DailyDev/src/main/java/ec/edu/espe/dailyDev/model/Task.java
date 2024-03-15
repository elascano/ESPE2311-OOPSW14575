package ec.edu.espe.dailyDev.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.dailyDev.utils.FileHandler;
import ec.edu.espe.dailyDev.utils.MenuUtils;
import com.google.gson.GsonBuilder;
import static com.mongodb.client.model.Updates.set;
import static ec.edu.espe.dailyDev.utils.MongoDBHandler.createDocument;
import static ec.edu.espe.dailyDev.utils.MongoDBHandler.deleteDocument;
import static ec.edu.espe.dailyDev.utils.MongoDBHandler.replaceDocument;
import static ec.edu.espe.dailyDev.utils.MongoDBHandler.updateDocument;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Team Number: 4 - CodingNinjas
 */
public class Task {

    private UUID id;
    private String name;
    private String description;
    private String priority;
    private Date dueDate;
    private Date creationDate;
    private UUID userId;
    private boolean completed;
    private static List<String> taskList = new ArrayList<>();

    public Task(UUID id, String name, String description, String priority, Date dueDate, Date creationDate, UUID userId, boolean completed) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.creationDate = creationDate;
        this.userId = userId;
        this.completed = completed;
    }

//    public void showMenu() {
//        String[] taskOptions = {
//            "Create Task",
//            "Show Tasks",
//            "Update Task",
//            "Back to Main Menu"
//        };
//
//        int option;
//
//        do {
//            option = MenuUtils.getUserOption("Task", taskOptions);
//
//            switch (option) {
////                case 1 ->
////                    create();
//                case 2 ->
//                    show();
//                case 3 ->
//                    showTasksTodays();
//                case 4 ->
//                    MenuUtils.backToMainMenu();
//                default ->
//                    System.out.println("Invalid option. Please try again.");
//            }
//        } while (option != 4);
//    }
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public static Message createAllTasksCompletedMessage() {
        return new Message(UUID.randomUUID(), "All Tasks Completed", "Congratulations! All tasks are completed.\n");
    }

    public static Message createTasksPendingMessage() {
        return new Message(UUID.randomUUID(), "Tasks Pending", "You have tasks that are not completed yet.\n");
    }

    public static boolean areAllTasksCompleted(ArrayList<Task> tasks) {
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                return false;
            }
        }
        return true;
    }

    public static void printFormattedTaskHeader() {
        String format = "| %-36s | %-20s | %-35s | %-15s | %-15s | %-10s |%n";
        System.out.format(format, "ID", "Name", "Description", "Due Date", "Creation Date", "Completed");
    }

    public void printFormattedTask() {
        String format = "| %-36s | %-20s | %-35s | %-15s | %-15s | %-10s |%n";
        System.out.format(format, getId(), getName(), getDescription(), formatDate(getDueDate()), formatDate(getCreationDate()), isCompleted());
    }

    private String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public static ArrayList<Task> getTasksFromFile(String fileAddress) {
        return FileHandler.readFile(fileAddress, new TypeToken<ArrayList<Task>>() {
        }.getType());
    }

//        public static void create(String title, String description, ) {
//        
//        }
//    public static void create() {
//        String collectionName = "Tasks";
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Creating a new task...");
//
//        UUID taskId = UUID.randomUUID();
//
//        System.out.println("Enter the task name:");
//        String taskName = scanner.nextLine();
//
//        System.out.println("Enter the task description:");
//        String taskDescription = scanner.nextLine();
//
//        System.out.println("Enter the due date (yyyy-MM-dd):");
//        String dueDateInput = scanner.nextLine();
//        Date dueDate;
//        try {
//            dueDate = truncateTime(new SimpleDateFormat("yyyy-MM-dd").parse(dueDateInput));
//        } catch (ParseException e) {
//            System.out.println("Invalid date format. Using the current date as the due date.");
//            dueDate = truncateTime(new Date());
//        }
//
//        // Estado de completitud predeterminado al crear una nueva tarea
//        boolean completed = false;
//
//        UUID userId = User.getCurrentUserId();
//
//        // Validar que la fecha de vencimiento sea después de la fecha de creación
//        Date creationDate = truncateTime(new Date());
//        if (dueDate.before(creationDate)) {
//            System.out.println("Error: Due date must be after the creation date.");
//            MenuUtils.backToMainMenu();
//            return;
//        }
//
//        Task newTask = new Task(taskId, taskName, taskDescription, dueDate, creationDate, userId, completed);
//
//        newTask.setUserId(userId);
//
//        MongoDBHandler mdbHandler = new MongoDBHandler();
//        mdbHandler.createDocument("Tasks", Document.parse(new Gson().toJson(newTask)));
//
////        ArrayList<Task> existingTasks = getTasksFromFile("./db/tasks.json");
////        existingTasks.add(newTask);
////        writeTasksToFile("tasks.json", existingTasks);
//        System.out.println("Task created!");
//        System.out.println("UserID: " + userId);
//        System.out.println(newTask);
//        MenuUtils.backToMainMenu();
//    }
    public static void writeTasksToFile(String filePath, ArrayList<Task> tasks) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(tasks);

        try {
            File file = new File("./db/" + filePath); // Ruta completa al archivo
            file.getParentFile().mkdirs(); // Asegura que la carpeta exista
            FileWriter writer = new FileWriter(file);
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing tasks to file: " + e.getMessage());
        }
    }

//    public static void show() {
//        System.out.println("\nShowing tasks...");
//
//        UUID userId = User.getCurrentUserId();
//        if (userId == null) {
//            System.out.println("No user logged in. Please log in to view tasks.");
//            MenuUtils.backToMainMenu();
//            return;
//        }
//
//        ArrayList<Task> tasks = getTasksFromFile("./db/tasks.json");
//
//        System.out.println("Tasks created by the current user:");
//
//        // Imprimir la cabecera una vez antes de las tareas
//        Task.printFormattedTaskHeader();
//
//        for (Task task : tasks) {
//            if (task.getUserId() != null && task.getUserId().equals(userId)) {
//                task.printFormattedTask();
//            }
//        }
//
//        if (tasks.isEmpty()) {
//            System.out.println("No tasks found for the current user.");
//        } else {
//            System.out.println("\nOptions:");
//
//            int option = MenuUtils.getUserOption("Select an option", new String[]{" Complete Tasks", " Back to Menu"});
//
//            switch (option) {
//                case 1:
//                    completeTask(tasks);
//                    break;
//                case 2:
//                    MenuUtils.backToMainMenu();
//                    break;
//                default:
//                    System.out.println("Invalid option. Returning to the main menu.");
//                    MenuUtils.backToMainMenu();
//            }
//        }
//    }
    public static Document updateTask(String taskId, String newTitle, String newDescription, String newStatus) {
        // Construct the query to find the task document by its ID
        Document query = new Document("id", taskId);

        // Construct the replacement document with updated fields
        Document replacement = new Document();
        replacement.put("title", newTitle);
        replacement.put("description", newDescription);
        replacement.put("status", newStatus);

        // Call the replaceDocument method to update the task document
        return replaceDocument(query, replacement, "Tasks");
    }

    public static Document completeTask(String taskId) {
        // Construct the query to find the task document by its ID
        Document query = new Document("id", taskId);

        // Construct the update to set the completed field to true
        Bson updates = set("completed", true);

        // Call the updateDocument method to update the task document
        Document updatedDocument = updateDocument(query, updates, "Tasks");

        return updatedDocument;
    }

    public static boolean deleteTask(String taskId) {
        // Construct the query to find the task document by its ID
        Document query = new Document("id", taskId);

        // Call the deleteDocument method to delete the task document
        return deleteDocument(query, "Tasks");
    }

    public static boolean createTask(String title, String description, String priority, String dueDate) {
        // Convert due date string to Date object
        UUID id = UUID.randomUUID();

        Date dueDateObj = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); // Adjust date format as per your formatted field
            dueDateObj = dateFormat.parse(dueDate);
        } catch (ParseException e) {
            System.err.println("Error parsing due date: " + e.getMessage());
            return false;
        }
        System.out.println(dueDateObj);

        // Create a Document representing the new task
        Document newTask = new Document("id", id)
                .append("name", title)
                .append("description", description)
                .append("priority", priority.toLowerCase())
                .append("dueDate", dueDateObj)
                .append("userId", User.getCurrentUserId().toString())
                .append("creationDate", new Date())
                .append("completed", false);

        // Call the createDocument method to insert the task document into the "Tasks" collection
        return createDocument(newTask, "Tasks");
    }

    public static void showTasksTodays() {
        System.out.println("Showing tasks for today...");

        UUID userId = User.getCurrentUserId();
        if (userId == null) {
            System.out.println("No user logged in. Please log in to view tasks.");
            MenuUtils.backToMainMenu();
            return;
        }

        ArrayList<Task> tasks = getTasksFromFile("./db/tasks.json");

        System.out.println("Tasks due today:");

        // Imprimir la cabecera una vez antes de las tareas
        Task.printFormattedTaskHeader();

        // Obtener la fecha actual sin tener en cuenta la parte de hora
        Date currentDate = truncateTime(new Date());

        for (Task task : tasks) {
            if (task.getUserId() != null && task.getUserId().equals(userId)
                    && !task.isCompleted() && isSameDay(task.getDueDate(), currentDate)) {
                task.printFormattedTask();
            }
        }

        if (tasks.isEmpty()) {
            System.out.println("No tasks found for the current user.");
        }

        MenuUtils.backToMainMenu();
    }

    private static boolean isSameDay(Date date1, Date date2) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
        return fmt.format(truncateTime(date1)).equals(fmt.format(truncateTime(date2)));
    }

    // Método auxiliar para truncar la parte de hora de una fecha
    private static Date truncateTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    @Override
    public String toString() {
        return "Task{" + "name=" + name + ", description=" + description + ", dueDate=" + dueDate + ", completed=" + completed + '}';
    }

    /**
     * @return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return the userId
     */
    public UUID getUserId() {
        return userId;
    }

    /**
     * @return the completed
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * @param completed the completed to set
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * @return the taskList
     */
    public static List<String> getTaskList() {
        return taskList;
    }

    /**
     * @param aTaskList the taskList to set
     */
    public static void setTaskList(List<String> aTaskList) {
        taskList = aTaskList;
    }

    /**
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

}
