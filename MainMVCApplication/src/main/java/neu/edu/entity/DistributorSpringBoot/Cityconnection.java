package neu.edu.entity.DistributorSpringBoot;

public class Cityconnection {
	private Integer idCityConnection;
	private String companyName;
	private String city;
	private int shipTime;
	private int cost;
	public Integer getIdCityConnection() {
		return idCityConnection;
	}
	public void setIdCityConnection(Integer idCityConnection) {
		this.idCityConnection = idCityConnection;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getShipTime() {
		return shipTime;
	}
	public void setShipTime(int shipTime) {
		this.shipTime = shipTime;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
