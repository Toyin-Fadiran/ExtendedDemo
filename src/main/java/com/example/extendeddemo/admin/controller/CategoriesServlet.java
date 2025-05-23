package com.example.extendeddemo.admin.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.extendeddemo.admin.model.Categories;
import com.example.extendeddemo.adminanduser.service.CategoryServiceImpl;
import com.example.extendeddemo.adminanduser.service.ICategoryService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CategoriesServlet
 */
public class CategoriesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LogManager.getLogger(CategoriesServlet.class.getName());

	private ICategoryService categoryService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CategoriesServlet() {
		super();
		// TODO Auto-generated constructor stub
		categoryService = new CategoryServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("i am in doGet method of categoriesServlet");
		
		//begin process of retrieving Category BY ID
		
		//placeholder
		Categories retrievedCategory = null;
		try {
	retrievedCategory =	categoryService.getCategory(Long.parseLong(request.getParameter("id")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		System.out.println("I am inside CategoryServlet");
		String type = request.getParameter("type");

		if (("createCategory".equals(type))) {

			Categories category = loadObject(request);

			// saved to the DB here
			try {
			categoryService.saveCategory(category);
			
			

			request.setAttribute("successMessage", "Category added successfully!");
			request.setAttribute("category", category);
			

			// Forward the request to the JSP for rendering the view
			RequestDispatcher dispatcher = request.getRequestDispatcher("/category-views-jstl.jsp");
			dispatcher.forward(request, response);
			} catch (Exception e) {
				
				request.setAttribute("errorMessage", e);
	
			//an error PAGE, when the request failed for 
			//whatever reason
				request
				.getRequestDispatcher("/category-views-jstl-error.jsp")
				.forward(request, response);
				
				
			}

		} else if ("updateCategory".equals(type)) {

			Categories categoriesUpdate = loadObject(request);

			try {
				// the appropriate to UPDATE the category object created above
				categoryService.updateCategory(categoriesUpdate);
				System.out.println(categoriesUpdate);

				// setting an additional attribute for the end user
				request.setAttribute("successMessage", "Category object Updated successfully!");
				// Forward the request to the JSP for rendering the view
				RequestDispatcher dispatcher = request.getRequestDispatcher("/categories-admin.jsp");
				dispatcher.forward(request, response);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("update failure!: ");
				e.printStackTrace();
				e.getMessage();

			}
		}
	}

	private Categories loadObject(HttpServletRequest request) {
		// create a placeholder Category object
		Categories categories = new Categories();
		// update the category object with appropriate field values
		// drawn from the HttpServletRequest

		// set CategoryId in case its available:
		if (request.getParameter("categoryId") != null) {
			String categoryId = request.getParameter("categoryId");
			categories.setCategoryId(Integer.parseInt(categoryId));

		}

		categories.setCategoryName(request.getParameter("categoryName"));
		categories.setCategoryDescription(request.getParameter("categoryDesc"));
		categories.setCategoryImageUrl(request.getParameter("categoryImgUrl"));
		// transformations of object fields to fit the setter method contract
		Integer activeId = Integer.parseInt(request.getParameter("activeId"));
		categories.setActive(activeId);
		// transformations of object fields to fit the setter method contract
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		String dateString = request.getParameter("addedOn"); // 2024-07-28
		LocalDate addedOn = LocalDate.parse(dateString, formatter);
		categories.setAddedOn(addedOn);
		return categories;
	}

}
