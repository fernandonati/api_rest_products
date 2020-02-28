package com.products.product.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Products implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="product_sequence")
	@SequenceGenerator(name="product_sequence", sequenceName="seq_product")	
	private Long id;
	
    @Column(name="name", nullable=false, length=60)
	private String Name;
	
    @Column(name="description", nullable=false, length=100)
    private String Description;
	
    @Column(name="price", nullable=false)
	private BigDecimal Price;
	
    @Column(name="stock", nullable=false)
	private Integer Stock;		
    
    
    
    //getters and setters
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public BigDecimal getPrice() {
		return Price;
	}

	public void setPrice(BigDecimal price) {
		Price = price;
	}

	public Integer getStock() {
		return Stock;
	}

	public void setStock(Integer stock) {
		Stock = stock;
	}
	
}
