package org.model.category;

/**
* This class represents a category 
*/
public class Category {
	private Long categoryId;
	private String categoryName;

	public Category(){
		
	}
	
	public Category(String categoryName){
		this.categoryName=categoryName;
	}
	
	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String toString() {
		return this.categoryName;
	}
}
