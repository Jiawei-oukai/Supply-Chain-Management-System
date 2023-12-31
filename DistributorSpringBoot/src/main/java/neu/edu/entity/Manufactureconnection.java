package neu.edu.entity;
// Generated 2022��12��16�� ����3:10:41 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Manufactureconnection generated by hbm2java
 */
@Entity
@Table(name = "manufactureconnection", catalog = "distributor")
public class Manufactureconnection implements java.io.Serializable {

	private Integer idManufactureConnection;
	private String companyName;
	private String manufactureCompany;
	private String transportation;
	private int time;
	private int cost;

	public Manufactureconnection() {
	}

	public Manufactureconnection(String companyName, String manufactureCompany, String transportation, int time,
			int cost) {
		this.companyName = companyName;
		this.manufactureCompany = manufactureCompany;
		this.transportation = transportation;
		this.time = time;
		this.cost = cost;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_manufacture_connection", unique = true, nullable = false)
	public Integer getIdManufactureConnection() {
		return this.idManufactureConnection;
	}

	public void setIdManufactureConnection(Integer idManufactureConnection) {
		this.idManufactureConnection = idManufactureConnection;
	}

	@Column(name = "company_name", nullable = false, length = 50)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "manufacture_company", nullable = false, length = 50)
	public String getManufactureCompany() {
		return this.manufactureCompany;
	}

	public void setManufactureCompany(String manufactureCompany) {
		this.manufactureCompany = manufactureCompany;
	}

	@Column(name = "transportation", nullable = false, length = 7)
	public String getTransportation() {
		return this.transportation;
	}

	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}

	@Column(name = "time", nullable = false)
	public int getTime() {
		return this.time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Column(name = "cost", nullable = false)
	public int getCost() {
		return this.cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
