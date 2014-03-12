package org.model.product;

import org.category.Category;

public class Product {
	private Long productId;
	private String productName;
	private Double price;
	private Category category;
	
	public Product(){
		
	}
	
	public Product(String productName, Double price, Category category){
		this.productName = productName;
		this.price = price;
		this.category = category;
	}
	

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
