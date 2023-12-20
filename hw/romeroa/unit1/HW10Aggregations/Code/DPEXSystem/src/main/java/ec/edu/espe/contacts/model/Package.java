package ec.edu.espe.contacts.model;

public class Package {
	private int packageId;
	private String contry;
	private String status;

	public Package(int packageId, String contry, String status) {
		this.packageId = packageId;
		this.contry = contry;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Package [packageId=" + packageId + ", contry=" + contry + ", status=" + status
				+ "]";
	}
}