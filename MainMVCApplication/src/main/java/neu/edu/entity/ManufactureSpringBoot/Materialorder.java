package neu.edu.entity.ManufactureSpringBoot;

public class Materialorder {

	private Integer idMaterialOrder;
	private String supplierCompany;
	private String materialName;
	private int unitCost;
	private int amount;
	private String statu;
	private String companyName;
	
	
	public Integer getIdMaterialOrder() {
		return idMaterialOrder;
	}
	public void setIdMaterialOrder(Integer idMaterialOrder) {
		this.idMaterialOrder = idMaterialOrder;
	}
	public String getSupplierCompany() {
		return supplierCompany;
	}
	public void setSupplierCompany(String supplierCompany) {
		this.supplierCompany = supplierCompany;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public int getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getStatu() {
		return statu;
	}
	public void setStatu(String statu) {
		this.statu = statu;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
}
