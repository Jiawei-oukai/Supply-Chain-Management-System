package neu.edu.entity;
// Generated 2022��12��16�� ����3:10:41 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Customerorder generated by hbm2java
 */
@Entity
@Table(name = "customerorder", catalog = "distributor")
public class Customerorder implements java.io.Serializable {

	private Integer idCustomerOrder;
	private String customerEmail;
	private String companyName;
	private String productName;
	private String status;
	private String customerName;

	public Customerorder() {
	}

	public Customerorder(String customerEmail, String companyName, String productName, String status,
			String customerName) {
		this.customerEmail = customerEmail;
		this.companyName = companyName;
		this.productName = productName;
		this.status = status;
		this.customerName = customerName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_customer_order", unique = true, nullable = false)
	public Integer getIdCustomerOrder() {
		return this.idCustomerOrder;
	}

	public void setIdCustomerOrder(Integer idCustomerOrder) {
		this.idCustomerOrder = idCustomerOrder;
	}

	@Column(name = "customer_email", nullable = false, length = 50)
	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
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

	@Column(name = "status", nullable = false, length = 9)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "customer_name", nullable = false, length = 45)
	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
