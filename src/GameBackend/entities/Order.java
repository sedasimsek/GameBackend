package GameBackend.entities;

public class Order {
	private int id;
	private int gameId;
	private int campaignId;
	
	public Order(int id, int gameId) {
		this.id = id;
		this.gameId = gameId;
	}

	public Order(int id, int gameId, int campaignId) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.campaignId = campaignId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	
	
}
