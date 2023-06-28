package neu.edu.entity.ManufactureSpringBoot;

public class Materialinventory {
	
	private Integer idMaterialInventory;
	private String companyName;
	private int amount;
	private String materialName;
	
	public Integer getIdMaterialInventory() {
		return idMaterialInventory;
	}
	public void setIdMaterialInventory(Integer idMaterialInventory) {
		this.idMaterialInventory = idMaterialInventory;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	
	
}
