package com.nextstep.expensetracker.service;

import java.util.List;

import com.nextstep.expensetracker.model.CategoryModel;

public interface ExpenseTracker {
public void addCategory(CategoryModel categoryModel);
public List<String> getCategoryName();
public List<CategoryModel>getIncomeList();
public List<CategoryModel>getExpenseList();
public void deleteCategory(int id);
public List<CategoryModel>getCategoryDetails();
}
