package com.ning.servlet;

import com.ning.service.AirportService;
import com.ning.service.impl.AirportServiceImpl;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//spring无法管理servlet
@WebServlet("/airport")
public class AirportServlet extends HttpServlet {
    private AirportService airportService;

    @Override
    public void init() throws ServletException {
        //对service实例化
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //spring和web整合后所有的信息都存放在webApplicationContext
        WebApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        airportService = ac.getBean("airportService", AirportServiceImpl.class);
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list",airportService.show());
        request.getRequestDispatcher("/show.jsp").forward(request,response);
    }
}
