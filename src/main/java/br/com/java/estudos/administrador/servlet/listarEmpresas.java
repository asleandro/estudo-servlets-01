package br.com.java.estudos.administrador.servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class listarEmpresas
 */
public class listarEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		RequestDispatcher rd = request.getRequestDispatcher("/listarEmpresas.jsp");
		request.setAttribute("empresas", lista);
		rd.forward(request, response);
		
		/*
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("Empresas cadastradas: ");
		out.println("<ul>");
		for(Empresa empresa : lista) {
			out.println("<li>" + empresa + "</li>");
		}
		out.println("</ul>");
		out.println("</html></body>");
		*/
	}

}
