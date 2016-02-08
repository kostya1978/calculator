package ru.tesoft.calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Konstantin on 08.02.2016.
 */
public class CalculatorServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException {



        CalculatorBean calculatorBean = (CalculatorBean) request.getSession().getAttribute("calculatorBean");
        if (calculatorBean == null) {
            calculatorBean = new CalculatorBean();
            request.getSession().setAttribute("calculatorBean", calculatorBean);
        }

        String value = request.getParameter("btn");
        calculatorBean.processButtonPress(value);

        RequestDispatcher view =
                request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }

}
