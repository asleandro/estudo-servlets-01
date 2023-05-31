package br.com.java.estudos.administrador.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class removeEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramID = request.getParameter("id");
		Integer id = Integer.valueOf(paramID);

		Banco banco = new Banco();
		banco.remove(id);

		response.sendRedirect("listarEmpresas");

	}

}
