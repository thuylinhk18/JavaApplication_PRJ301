/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Category;
import model.CategoryDAO;
import model.Product;
import model.ProductDAO;

/**
 *
 * @author bebet
 */
public class ProductServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProductServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        String command = request.getParameter("COMMAND");
        switch (command) {
            case "LIST" ->
                productList(request, response);
            case "ADD" ->
                addProduct(request, response);
            case "REMOVE" ->
                deleteProduct(request, response);
            case "Return to Product List" ->
                productList(request, response);
            case "Add Product" ->
                addProduct(request, response);
            case "List Category" ->
                categoryList(request, response);
            case "Add Category" ->
                addCategory(request, response);
//            case "BEFORE_UPDATE" ->
//                beforeUpdate(request, response);
//            case "UPDATE" ->
//                updateProduct(request, response);
//        }
        }
    }

    protected void productList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDAO productDAO = new ProductDAO();
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        request.setAttribute("ProductList", productDAO.getProducts());
        request.getRequestDispatcher("ListProduct.jsp").include(request, response);
    }

    protected void addProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDAO productDAO = new ProductDAO();

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String unit = request.getParameter("unit");
        String category = request.getParameter("category");
        double price = Double.parseDouble(request.getParameter("price"));

        productDAO.addProduct(new Product(name, unit, category, price));
        productList(request, response);
    }

    protected void deleteProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDAO productDAO = new ProductDAO();
        productDAO.removeProduct(Integer.parseInt(request.getParameter("id")));
        productList(request, response);
    }

    protected void categoryList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CategoryDAO categoryDAO = new CategoryDAO();
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        request.setAttribute("CategoryList", categoryDAO.getCategories());
        request.getRequestDispatcher("ListCategory.jsp").include(request, response);
    }

    protected void addCategory(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CategoryDAO categoryDAO = new CategoryDAO();

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String description = request.getParameter("description");

        categoryDAO.addCategory(new Category(name, description));
        categoryList(request, response);
    }

//
//    protected void beforeUpdate(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String id = request.getParameter("productId");
//        request.setAttribute("ProductID", id);
//        request.getRequestDispatcher("update.jsp").include(request, response);
//    }
//
//    protected void updateProduct(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        ProductDAO productDAO = new ProductDAO();
//        String id = request.getParameter("id");
//        String name = request.getParameter("name");
//        Byte Gender = (byte) (request.getParameter("gender").equals("male") ? 0 : 1);
//        LocalDate DOB = LocalDate.parse(request.getParameter("DOB"));
//        productDAO.updateProduct(new product(id, name, Gender, DOB));
//        productList(request, response);
//    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
