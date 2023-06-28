package neu.edu.entity.SupplierSpringBoot;

public class Materialinventory {
	
	private Integer idRawMaterialAvailable;
	private int inventory;
	private int unitCost;
	private String companyName;
	private String material;
	
	
	public Integer getIdRawMaterialAvailable() {
		return idRawMaterialAvailable;
	}
	public void setIdRawMaterialAvailable(Integer idRawMaterialAvailable) {
		this.idRawMaterialAvailable = idRawMaterialAvailable;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public int getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
