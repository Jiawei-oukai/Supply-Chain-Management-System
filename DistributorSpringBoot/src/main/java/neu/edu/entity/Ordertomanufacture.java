package neu.edu.entity;
// Generated 2022��12��16�� ����3:10:41 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ordertomanufacture generated by hbm2java
 */
@Entity
@Table(name = "ordertomanufacture", catalog = "distributor")
public class Ordertomanufacture implements java.io.Serializable {

	private Integer idOrderToManufacture;
	private String companyName;
	private String productName;
	private int amount;
	private String manufactureCompany;
	private String status;

	public Ordertomanufacture() {
	}

	public Ordertomanufacture(String companyName, String productName, int amount, String manufactureCompany,
			String status) {
		this.companyName = companyName;
		this.productName = productName;
		this.amount = amount;
		this.manufactureCompany = manufactureCompany;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_order_to_manufacture", unique = true, nullable = false)
	public Integer getIdOrderToManufacture() {
		return this.idOrderToManufacture;
	}

	public void setIdOrderToManufacture(Integer idOrderToManufacture) {
		this.idOrderToManufacture = idOrderToManufacture;
	}

	@Column(name = "company_name", nullable = false, length = 50)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "product_name", nullable = false, length = 50)
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "amount", nullable = false)
	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Column(name = "manufacture_company", nullable = false, length = 45)
	public String getManufactureCompany() {
		return this.manufactureCompany;
	}

	public void setManufactureCompany(String manufactureCompany) {
		this.manufactureCompany = manufactureCompany;
	}

	@Column(name = "status", nullable = false, length = 19)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
