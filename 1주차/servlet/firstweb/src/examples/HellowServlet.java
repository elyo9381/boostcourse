package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HellowServlet
 */

// 3.0이상 버전에서는 @WebServlet("/HellowServlet") 처럼클래스를 불러오는방법을 사용한다. 
// 3.0 이하 버전에서는 안스처럼 xml 처럼 사용하게 된다.
@WebServlet("/HellowServlet")
public class HellowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public HellowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8"); // doget 메소드를 통해서 로컬서버의 내용을 가져간다. 
		PrintWriter out = response.getWriter(); // 웹상의 입출력을 위해서 PrintWrite 클래스를 사용하여 입력한다.
		out.print("<h1>Hello servlet</h1>"); // printWrite 메소드의 변수 out을 이용하여 출력한다.  
		
	}

}
