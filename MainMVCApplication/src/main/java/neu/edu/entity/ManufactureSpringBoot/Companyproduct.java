package neu.edu.entity.ManufactureSpringBoot;

public class Companyproduct {
	private Integer idCompanyProduct;
	private String companyName;
	private String productName;
	private int inventory;
	
	public Integer getIdCompanyProduct() {
		return idCompanyProduct;
	}
	public void setIdCompanyProduct(Integer idCompanyProduct) {
		this.idCompanyProduct = idCompanyProduct;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	
	
}
