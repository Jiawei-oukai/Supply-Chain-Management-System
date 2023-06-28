package neu.edu.entity.SupplierSpringBoot;

public class Allorder {

	private Integer idOrder;
	private String materialName;
	private int amount;
	private String status;
	private String companyName;
	private String manufactureCompanyName;
	public Integer getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getManufactureCompanyName() {
		return manufactureCompanyName;
	}
	public void setManufactureCompanyName(String manufactureCompanyName) {
		this.manufactureCompanyName = manufactureCompanyName;
	}
	
	
}
