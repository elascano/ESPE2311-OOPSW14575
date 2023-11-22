public class Package{
	private int packageId;
	private String distric;
	private Country contry;
	private ConsularOffice consularOffice;
	private PackageType packageType;
	private Vote[] votes;
	private String status;

	public void updateStatus(String status);
	public int getVotesCount();
}