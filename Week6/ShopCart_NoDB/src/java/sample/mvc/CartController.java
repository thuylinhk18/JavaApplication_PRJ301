package sample.mvc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;


public class CartController extends HttpServlet {
    private final String homePage="index.jsp";
    private final String showPage="show.jsp";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        String action=request.getParameter("action");
        try {
            if (action.equals("AddMore")) {
                RequestDispatcher rd = request.getRequestDispatcher(homePage);
                rd.forward(request, response);
            }
        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action.equals("Add to Cart")){
            HttpSession session=request.getSession();
            CartBean shop=(CartBean)session.getAttribute("SHOP");
            if(shop==null){
                shop=new CartBean();
            }
            String title=request.getParameter("cboBook");
            BookDTO book=new BookDTO(title);
            shop.addBook(book);
            session.setAttribute("SHOP", shop);
            RequestDispatcher rd=request.getRequestDispatcher(homePage);
            rd.forward(request, response);
        }else if(action.equals("View Cart")){
            RequestDispatcher rd=request.getRequestDispatcher(showPage);
            rd.forward(request, response);
        }else if(action.equals("AddMore")){
            RequestDispatcher rd=request.getRequestDispatcher(homePage);
            rd.forward(request, response);
        }else if(action.equals("Remove")){
            String[] list=request.getParameterValues("rmv");
            if(list!=null){
                HttpSession session=request.getSession();
                if(session!=null){
                    CartBean shop=(CartBean)session.getAttribute("SHOP");
                    if(shop!=null){
                        for (int i = 0; i < list.length; i++) {
                            shop.removeBook(list[i]);
                        }
                    }
                }
            }
            String url="CartController?action=View Cart";
            RequestDispatcher rd=request.getRequestDispatcher(url);
            rd.forward(request, response);
        }
    }
}