package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.service.ManagerService;

@WebServlet("/rejecto")
public class RejectOwnerController extends HttpServlet { 
	ManagerService managerService=new ManagerService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String ownerid=req.getParameter("oid"); 
		int i=Integer.parseInt(ownerid);   
		
		String managerid=req.getParameter("mid"); 
		int i2=Integer.parseInt(managerid);  

		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("username", ownerid);
		httpSession.setAttribute("password", managerid);
		
		boolean res= managerService.rejectOwnerById(i, i2);
		if(res==true) {  
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("ManagerDashBoard.jsp"); 
			requestDispatcher.forward(req, resp);
		}
			
		else { 
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("rejectOwner.jsp"); 
			requestDispatcher.include(req, resp);

		}
	} 
}