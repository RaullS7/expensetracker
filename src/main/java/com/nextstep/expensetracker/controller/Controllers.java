package com.nextstep.expensetracker.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nextstep.expensetracker.model.CategoryModel;
import com.nextstep.expensetracker.service.ExpenseTracker;
import com.nextstep.expensetracker.service.ExpenseTrackerImpl;

@WebServlet("/Controllers")
public class Controllers extends HttpServlet {
	ExpenseTracker tracker= new ExpenseTrackerImpl();
	
			
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String navigateTo="";
	String action=request.getParameter("actions");
	if(action.equalsIgnoreCase("dashboard")){
		navigateTo= "Dashboard.jsp";
	}
	else if(action.equalsIgnoreCase("add_category")) {
		
		List<CategoryModel>incomeList=tracker.getIncomeList();
		request.setAttribute("categoryList",incomeList);
		request.setAttribute("expenseList", tracker.getExpenseList());
		navigateTo="AddCategory.jsp";
	
	}
	else if(action.equalsIgnoreCase("add_new")) {
		request.setAttribute("name", tracker.getCategoryName());
		navigateTo="Form.jsp";
	}
	else if(action.equalsIgnoreCase("delete")) {
		int id=Integer.parseInt(request.getParameter("id"));
		tracker.deleteCategory(id);
		request.setAttribute("categoryList",tracker.getIncomeList());
		request.setAttribute("expenseList", tracker.getExpenseList());
		navigateTo="AddCategory.jsp";
	}
	
	
	RequestDispatcher rd=request.getRequestDispatcher(navigateTo);
	rd.forward(request, response);
	}
}
