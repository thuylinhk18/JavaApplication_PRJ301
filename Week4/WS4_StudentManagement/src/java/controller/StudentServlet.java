/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author bebet
 */
public class StudentServlet extends HttpServlet {

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
            out.println("<title>Servlet StudentServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StudentServlet at " + request.getContextPath() + "</h1>");
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
                listStudent(request, response);
            case "ADD" ->
                addStudent(request, response);
            case "DELETE" ->
                removeStudent(request, response);
            case "BEFORE_UPDATE" ->
                beforeUpdateStudent(request, response);
            case "UPDATE" ->
                updateStudent(request, response);
            case "SEARCH" ->
                searchStudent(request, response);
            case "BACK" ->
                request.getRequestDispatcher("search.jsp").forward(request, response);
        }

    }

    protected void listStudent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        StudentDAO dao = new StudentDAO();
        List<Student> sList = new ArrayList<>();
        sList = dao.getAllStudents();
        request.setAttribute("sList", sList);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    protected void addStudent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        StudentDAO dao = new StudentDAO();
        String id = request.getParameter("id");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        Student student = new Student(id, firstName, lastName, email);
        dao.addStudent(student);
        listStudent(request, response);

    }

    protected void removeStudent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        StudentDAO dao = new StudentDAO();
        String studentIDToRemove = request.getParameter("id");
        dao.removeStudent(studentIDToRemove);
        listStudent(request, response);
    }

    protected void beforeUpdateStudent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        StudentDAO dao = new StudentDAO();
        String id = request.getParameter("id");
        request.setAttribute("id", id);
        Student studentToUpdate = dao.searchStudentById(id);
        request.setAttribute("firstName", studentToUpdate.getFirstName());
        request.setAttribute("lastName", studentToUpdate.getLastName());
        request.setAttribute("email", studentToUpdate.getEmail());
        request.getRequestDispatcher("update.jsp").forward(request, response);

    }

    protected void updateStudent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        StudentDAO dao = new StudentDAO();
        String id = request.getParameter("id");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        dao.updateStudent(new Student(id, firstName, lastName, email));
        listStudent(request, response);
    }

    protected void searchStudent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        StudentDAO dao = new StudentDAO();
        String id = request.getParameter("id");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        List<Student> result = new ArrayList<>();
        result = dao.searchStudentsByAnyInfo(id, firstName, lastName, email);
        request.setAttribute("result", result);
        request.getRequestDispatcher("search-result.jsp").forward(request, response);
    }

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
