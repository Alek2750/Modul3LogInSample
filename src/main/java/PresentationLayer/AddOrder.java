/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LoginSampleException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alek
 */
public class AddOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int getlength = Integer.parseInt(request.getParameter("length"));
        int getwidth = Integer.parseInt(request.getParameter("width"));
        int getheight = Integer.parseInt(request.getParameter("height"));
        HttpSession session = request.getSession();
        session.setAttribute("length", getlength);
        session.setAttribute("width", getwidth);
        session.setAttribute("height", getheight);
        return "myOrder";
    }
}