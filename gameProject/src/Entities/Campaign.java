package Entities;

public class Campaign {
	private int campaignId;
	private double discount;
	private String campaignDuration;
	
	public Campaign(int campaignId, double discount, String campaignDuration) {
		super();
		this.campaignId = campaignId;
		this.discount = discount;
		this.campaignDuration = campaignDuration;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getCampaignDuration() {
		return campaignDuration;
	}

	public void setCampaignDuration(String ccampaignDuration) {
		this.campaignDuration = ccampaignDuration;
	}

}
