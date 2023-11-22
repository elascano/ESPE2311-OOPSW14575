public class Administrator{
	private int id;
	private String name;
	private String email;
	private int phoneNumber;

	public void addEvent(Event event);
	public void modifyEvent(int eventId);
	public void removeEvent();
	public void reviewEvent(int eventId);
}