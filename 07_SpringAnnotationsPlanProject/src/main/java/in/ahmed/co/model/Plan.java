package in.ahmed.co.model;

public class Plan {

	private int planid;
	private int validity;
	private String description;
	private double price;

	public Plan(int planid, int validity, String description, double price) {
		super();
		this.planid = planid;
		this.validity = validity;
		this.description = description;
		this.price = price;
	}

	public int getPlanid() {
		return planid;
	}

	public void setPlanid(int planid) {
		this.planid = planid;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Plan [planid=" + planid + ", validity=" + validity + ", description=" + description + ", price=" + price
				+ "]";
	}

}
