package com.jsp.employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmployeeReigistration extends GenericServlet
{
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
	String employeeId = request.getParameter("empid");
	String employeename =	request.getParameter("empname");
	String employeesalary = request.getParameter("empsalary");
	String employeedeptno = request.getParameter("empdeptno");
	
//	System.out.println("Employee Id :"+employeeId);
//	System.out.println("Employee Name :"+employeename);
//	System.out.println("Employee Salary :"+employeesalary);
//	System.out.println("Employee DeptNo :"+employeedeptno);
//		
	
	PrintWriter writer =response.getWriter();
	response.setContentType("text/html");
	
	writer.println("<center><table border ='1'><tr>"
			                  + " <th> Employee Id</th> "
			                  + "<th> Employee Name</th>"
			                  + "<th> Employee Salary</th>"
			                  + "<th> Employee Deptno </th></tr>"
			                  + "<tr><td>"+employeeId+"</td>"
			                  + "<td>"+employeename+"</td>"
			                  + "<td>"+employeesalary+"</td>"
			                  + "<td>"+employeedeptno+"</td>"
			                  + "</tr></center>");
		
		
		
		
		
		
		
		
		
		
		
	}

}
