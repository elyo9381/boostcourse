package kr.or.connect.Todo.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.connect.Todo.Dao.TodoDao;
import kr.or.connect.Todo.Dto.TodoDto;
/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
    
    TodoDao todoDao = new TodoDao();
    
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<TodoDto> list = todoDao.getTodos();
		
		for(TodoDto todoDto : list) {
			System.out.println(todoDto);
		}
	
		
		
		boolean suc = todoDao.istable();
		
		System.out.println(suc);
		
		request.setAttribute("list",list);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("main.jsp");
		requestDispatcher.forward(request,response);
		
	}

}
