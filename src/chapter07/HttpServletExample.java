package chapter07;

public class HttpServletExample {
	public static void main(String[] args) {
//		LoginServlet ll = new LoginServlet();
//		FileDownloadServlet ff = new FileDownloadServlet();
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
