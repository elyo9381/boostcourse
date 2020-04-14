package kr.or.connect.Todo.api;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.connect.Todo.Dao.TodoDao;
import kr.or.connect.Todo.Dto.TodoDto;

/**
 * Servlet implementation class TodoTypeServlet
 */
@WebServlet("/todoType")
public class TodoTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	TodoDao todoDao =  new TodoDao();
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idsucess = 0;
		TodoDto todoDto = new TodoDto();
		todoDto.setId(Long.parseLong(request.getParameter("id")));
		todoDto.setType(request.getParameter("type"));
		
		idsucess = todoDao.updateTodo(todoDto);
		if(idsucess !=0)
		{
			response.addHeader("result","success");
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("main.jsp");
		requestDispatcher.forward(request, response);
	}


}
