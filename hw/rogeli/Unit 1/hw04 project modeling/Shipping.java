public class Shipping{
	private Package[] packages;
	private String transportationMode;
	private Date dispatchDate;
	private Date arrivalDate;
	private String currentLocation;

	public String getCurrentLocation();
	public void updateLocation(String location);
}