package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDao;
import entidade.comum.Usuario;

@WebServlet("/listarTransportadores")
public class ListaTransportadoresServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UsuarioDao userDao = new UsuarioDao();
		List<Usuario> transpotadores = userDao.findAlltransportadores();
		
		req.setAttribute("transportadores", transpotadores);
		
		req.getRequestDispatcher("listar.jsp").forward(req, resp);
	}
}
