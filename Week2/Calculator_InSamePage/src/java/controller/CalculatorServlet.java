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
import model.CalculatorModel;

/**
 *
 * @author bebet
 */
public class CalculatorServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculatorServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalculatorServlet at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html");
        PrintWriter printToClient = response.getWriter();
        printToClient.println("<html><body>");
        printToClient.println("<form action=\"CalculatorServlet\" method=\"post\">");
        printToClient.println("<table>");

        printToClient.println("<tr>");
        printToClient.println("<td>First</td>");
        printToClient.println("<td><input type=\"number\" name=\"num1\" step=\"any\" required /> </td>");
        printToClient.println("</tr>");

        printToClient.println("<tr>");
        printToClient.println("<td>Second</td>");
        printToClient.println("<td><input type=\"number\" name=\"num2\" step=\"any\" required /> </td>");
        printToClient.println("</tr>");

        printToClient.println("<tr>");
        printToClient.println("<td>Operator</td>");
        printToClient.println("<td>"
                + "<select> "
                + "<option name\"action\" value=\"+\">+</option><\br> "
                + "<option name\"action\" value=\"-\">-</option><\br> "
                + "<option name\"action\" value=\"*\">* </option><\br> "
                + "<option name\"action\" value=\"/\">/</option>"
                + "</select>"
                + "</td>");
        printToClient.println("</tr>");

        printToClient.println("<tr>");
        printToClient.println("<td></td>");
        printToClient.println("<td><input type=\"submit\" value=\"Compute\" /> </td>");
        printToClient.println("</tr>");

        printToClient.println("<tr>");
        printToClient.println("<td>Reusult</td>");
        printToClient.println("<td><output type=\"number\" step=\"any\"/> </td>");
        printToClient.println("</tr>");
        
        printToClient.println("</table>");
        printToClient.println("</body></html>");
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
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String operator = request.getParameter("action");
        CalculatorModel model = new CalculatorModel(Double.parseDouble(num1), Double.parseDouble(num2), operator);
        
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
