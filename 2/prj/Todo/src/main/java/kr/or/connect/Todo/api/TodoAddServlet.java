package kr.or.connect.Todo.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.connect.Todo.Dao.TodoDao;
import kr.or.connect.Todo.Dto.TodoDto;

/**
 * Servlet implementation class TodoAddServlet
 */
@WebServlet("/todoAdd")
public class TodoAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private TodoDao todoDao = new TodoDao();
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		TodoDto todoDto = new TodoDto();
		
		todoDto.setTitle(request.getParameter("title"));
		todoDto.setName(request.getParameter("name"));
		todoDto.setSequence(Integer.parseInt(request.getParameter("sequence")));
		todoDao.addTodo(todoDto);
		
		response.sendRedirect("/Todo/main");
	}

}