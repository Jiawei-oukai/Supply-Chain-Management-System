package neu.edu.entity;
// Generated 2022��12��16�� ����2:32:19 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Allorder generated by hbm2java
 */
@Entity
@Table(name = "allorder", catalog = "rawmaterialsupplier")
public class Allorder implements java.io.Serializable {

	private Integer idOrder;
	private String materialName;
	private int amount;
	private String status;
	private String companyName;
	private String manufactureCompanyName;

	public Allorder() {
	}

	public Allorder(String materialName, int amount, String status, String companyName, String manufactureCompanyName) {
		this.materialName = materialName;
		this.amount = amount;
		this.status = status;
		this.companyName = companyName;
		this.manufactureCompanyName = manufactureCompanyName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_order", unique = true, nullable = false)
	public Integer getIdOrder() {
		return this.idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	@Column(name = "material_name", nullable = false, length = 20)
	public String getMaterialName() {
		return this.materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	@Column(name = "amount", nullable = false)
	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Column(name = "status", nullable = false, length = 9)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "company_name", nullable = false, length = 45)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "manufacture_company_name", nullable = false, length = 45)
	public String getManufactureCompanyName() {
		return this.manufactureCompanyName;
	}

	public void setManufactureCompanyName(String manufactureCompanyName) {
		this.manufactureCompanyName = manufactureCompanyName;
	}

}