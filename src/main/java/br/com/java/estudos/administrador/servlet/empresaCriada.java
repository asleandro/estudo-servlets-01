package br.com.java.estudos.administrador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class empresaCriada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		
		Date dataAbertura = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nome);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		if(empresa.getNome() != "") {
			banco.adiciona(empresa);
		}
		
		response.sendRedirect("listarEmpresas");
		
//		//Chamar o JSP
//		RequestDispatcher rd = request.getRequestDispatcher("/listarEmpresas");
//		request.setAttribute("empresa", empresa.getNome());
//		request.setAttribute("data", empresa.getDataAbertura());
//		rd.forward(request, response);
		

	}

}
