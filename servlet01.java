import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletBlog")
public class servletBlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter().append("Served at: ").append(request.getContextPath()); 
		pw.println("<html>"); 
		pw.println("<body>");
		pw.println("<div>");
		pw.println("<style>");
		pw.println("p{");
		pw.println("color:orange;");
		pw.println("font-size:78px;");
		pw.println("text-align:center;");
		pw.println("}");
	
		pw.println("body{");
		pw.println("background-color:black");
		pw.println("}");
	
		pw.println("div{");
		pw.println("background-image:url(https://www.comunidadbaratz.com/wp-content/uploads/En-el-mundo-existen-150.000.000-de-libros%E2%80%A6-y-estos-son-los-100-mejores.jpg)");
        pw.println("}");
		pw.println("</style>");
		pw.println("<p>Blog de Arezu Ediciones: próximamente</p>");
		pw.println("</div>");
		pw.println("</body>");
        pw.println("</html>"); 
        
	}
	

}
