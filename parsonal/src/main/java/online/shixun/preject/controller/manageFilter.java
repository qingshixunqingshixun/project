package online.shixun.preject.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet Filter implementation class AtmFilter
 */
@WebFilter("/*")
public class manageFilter implements Filter {


	public void destroy() {
	}
	@SuppressWarnings("unused")
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest=(HttpServletRequest) request;
		HttpServletResponse httpResponse=(HttpServletResponse) response;
		HttpSession session=httpRequest.getSession();
		String name=(String) session.getAttribute("aaa");
		String path=httpRequest.getServletPath();
		if (name!=null||path.indexOf("user_struts-hibernate-spring")!=-1||path.equals("/login.jsp")||path.indexOf("images")!=-1||path.indexOf("css")!=-1) {
			chain.doFilter(request, response);
		}else{
			httpResponse.sendRedirect("/user_struts-hibernate-spring/login.jsp");
		}
		
	}


	public void init(FilterConfig fConfig) throws ServletException {

	}

}
