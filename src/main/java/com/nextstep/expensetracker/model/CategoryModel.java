package com.nextstep.expensetracker.model;

public class CategoryModel {
private String categoryName,type;
private int id;


public void setCategoryName(String categoryName) {
	this.categoryName=categoryName;
}
public String getCategoryName() {
	return categoryName;
}

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
