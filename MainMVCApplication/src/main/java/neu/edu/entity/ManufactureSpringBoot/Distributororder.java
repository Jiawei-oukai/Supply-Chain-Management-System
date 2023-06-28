package neu.edu.entity.ManufactureSpringBoot;

public class Distributororder {
	private Integer idDistributorOrder;
	private String productName;
	private String companyName;
	private String distributorCompany;
	private int amount;
	private String status;
	
	
	public Integer getIdDistributorOrder() {
		return idDistributorOrder;
	}
	public void setIdDistributorOrder(Integer idDistributorOrder) {
		this.idDistributorOrder = idDistributorOrder;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDistributorCompany() {
		return distributorCompany;
	}
	public void setDistributorCompany(String distributorCompany) {
		this.distributorCompany = distributorCompany;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
