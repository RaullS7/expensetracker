package com.nextstep.expensetracker.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nextstep.expensetracker.model.CategoryModel;
import com.nextstep.expensetracker.service.ExpenseTracker;
import com.nextstep.expensetracker.service.ExpenseTrackerImpl;

@WebServlet("/categoryController")
public class categoryController extends HttpServlet {
	ExpenseTracker expenseTracker= new ExpenseTrackerImpl();
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String type=request.getParameter("type");
		String name=request.getParameter("name");
		
		CategoryModel model= new CategoryModel();
		model.setType(type);
		model.setCategoryName(name);
		
		expenseTracker.addCategory(model);
		
		RequestDispatcher rd=request.getRequestDispatcher("AddCategory.jsp");
		rd.forward(request, response);
				
		
		
		
	}
	

}
