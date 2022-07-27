package com.npci.ecommerce.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productid")
	private int productid;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "unitprice")
	private double unitprice;
	
	@Column(name = "imageurl")
	private String imageurl;
	
	@Column(name = "unitsinstock")
	private int unitsinstock;
	
	@Column(name = "datecreated")
	private Date datecreated;
	
	@Column(name = "lastupdated")
	private Date lastupdated;
	
	@Column(name = "categoryid")
	private int categoryid;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productid, String name, String description, double unitprice, String imageurl, int unitsinstock,
			Date datecreated, Date lastupdated, int categoryid) {
		super();
		this.productid = productid;
		this.name = name;
		this.description = description;
		this.unitprice = unitprice;
		this.imageurl = imageurl;
		this.unitsinstock = unitsinstock;
		this.datecreated = datecreated;
		this.lastupdated = lastupdated;
		this.categoryid = categoryid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public int getUnitsinstock() {
		return unitsinstock;
	}

	public void setUnitsinstock(int unitsinstock) {
		this.unitsinstock = unitsinstock;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public Date getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", description=" + description + ", unitprice="
				+ unitprice + ", imageurl=" + imageurl + ", unitsinstock=" + unitsinstock + ", datecreated="
				+ datecreated + ", lastupdated=" + lastupdated + ", categoryid=" + categoryid + "]";
	}
	
	

}
