package neu.edu.entity;
// Generated 2022��12��16�� ����3:06:55 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "order", catalog = "customer")
public class Order implements java.io.Serializable {

	private Integer idOrder;
	private String customerEmail;
	private String productName;
	private String distributorCompany;
	private String status;

	public Order() {
	}

	public Order(String customerEmail, String productName, String distributorCompany, String status) {
		this.customerEmail = customerEmail;
		this.productName = productName;
		this.distributorCompany = distributorCompany;
		this.status = status;
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

	@Column(name = "customer_email", nullable = false, length = 50)
	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Column(name = "product_name", nullable = false, length = 30)
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "distributor_company", nullable = false, length = 50)
	public String getDistributorCompany() {
		return this.distributorCompany;
	}

	public void setDistributorCompany(String distributorCompany) {
		this.distributorCompany = distributorCompany;
	}

	@Column(name = "status", nullable = false, length = 19)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}