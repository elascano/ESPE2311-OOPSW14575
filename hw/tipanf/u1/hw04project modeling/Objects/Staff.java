public class Staff {

    private String type;
    private Workday workday;
    private Employee[] employees;
    private float totalStaffCost;

    public void asingWorkday(Workday workday);
    public void addEmployee(Employee employee);
    public float calculateCost(Workday workday);
}