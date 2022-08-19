package entities;

public class Campaign {
	private int id;
	private String campaingName;
	private int valueOfCampaign;
	private double discount;
	public Campaign(int id,String campaignName,int valueOfCampaign,double discount) {
		this.id=id;
		this.campaingName=campaignName;
		this.valueOfCampaign=valueOfCampaign;
		this.discount=discount;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaingName() {
		return campaingName;
	}
	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}
	public int getValueOfCampaign() {
		return valueOfCampaign;
	}
	public void setValueOfCampaign(int valueOfCampaign) {
		this.valueOfCampaign = valueOfCampaign;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	

}
