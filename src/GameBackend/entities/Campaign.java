package GameBackend.entities;

public class Campaign {
	private int id;
	private int discount;

	public Campaign() {
		
	}
	
	public Campaign(int id, int discount) {
		super();
		this.id = id;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
