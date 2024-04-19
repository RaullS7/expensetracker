package com.nextstep.expensetracker.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.nextstep.expensetracker.databaseconnection.DatabaseConnection;
import com.nextstep.expensetracker.model.CategoryModel;

public class ExpenseTrackerImpl implements ExpenseTracker  {
	PreparedStatement ps=null;
	@Override
	public void addCategory(CategoryModel categoryModel) {
	String sql="insert into category (type,name) values(?,?)";
	try {
		ps=DatabaseConnection.getConnection().prepareStatement(sql);
		ps.setString(1, categoryModel.getType());
		ps.setString(2, categoryModel.getCategoryName());
		ps.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	@Override
	public List<String> getCategoryName() {
		List<String>nameList=new ArrayList<>();
		String sql="select name from category";
		try {
			ps=DatabaseConnection.getConnection().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				nameList.add(rs.getString("name"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return nameList;
	}
	@Override
	public List<CategoryModel> getIncomeList() {
	ArrayList<CategoryModel>list=new ArrayList<CategoryModel>();
	String sql="select distinct name,id from category where type='income'";
	try {
		ps=DatabaseConnection.getConnection().prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			CategoryModel model= new CategoryModel();
			model.setCategoryName(rs.getString("name"));
			model.setId(rs.getInt("id"));
			list.add(model);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return list;
		
	}
	@Override
	public List<CategoryModel> getExpenseList() {
		ArrayList<CategoryModel>expenseList=new ArrayList<CategoryModel>();
		String sql="select distinct name,id from category where type='expense'";
		try {
			ps=DatabaseConnection.getConnection().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				CategoryModel model= new CategoryModel();
				model.setCategoryName(rs.getString("name"));
				model.setId(rs.getInt("id"));
				expenseList.add(model);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return expenseList;
	}
	@Override
	public void deleteCategory(int id) {
		String sql="delete from category where id=?";
		try {
			ps=DatabaseConnection.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public List<CategoryModel> getCategoryDetails() {
		ArrayList<CategoryModel>getCategoryList= new ArrayList<CategoryModel>();
		String sql="select * from category";
		try {
			ps=DatabaseConnection.getConnection().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				CategoryModel model= new CategoryModel();
				model.setId(rs.getInt("id"));
				model.setType(rs.getString("type"));
				model.setCategoryName(rs.getString("name"));
				getCategoryList.add(model);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		

		return getCategoryDetails();
	}

}
