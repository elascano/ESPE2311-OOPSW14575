public class Reservation {
    private int reservationId;
    private LocalDateTime dateTime;
    private int numberOfPeople;
    private String status;
    
    private List<Customer> customers;
    private float totalAmount;
    private float taxAmount;
    private float discountAmount;
    }