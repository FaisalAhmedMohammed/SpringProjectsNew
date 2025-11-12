package in.ahmed.beans.Model;

public class Plan {
	private int planid;
	private String description;
	private double price;
	private int validity;

	public Plan(int planid, String description, double price, int validity) {
		super();
		this.planid = planid;
		this.description = description;
		this.price = price;
		this.validity = validity;
	}

	public int getPlanid() {
		return planid;
	}

	public void setPlanid(int planid) {
		this.planid = planid;
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

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	@Override
	public String toString() {
		return "Plan [planid=" + planid + ", description=" + description + ", price=" + price + ", validity=" + validity
				+ "]";
	}

}
