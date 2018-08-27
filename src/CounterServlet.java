import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;


@WebServlet("/textarea")
public class CounterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tekst = request.getParameter("tekst");
        PrintWriter writer = response.getWriter();
        writer.println(tekst);
        String[] split = tekst.split(" ");
        writer.println("Ilość słów: " + split.length);
        writer.println("Ilość znaków: " + tekst.length());
        writer.println("Ilość znaków bez spacji: " + tekst.replace(" ", "").length());
        writer.println("Palindrom: " + palindrom(tekst));

    }


    public static boolean palindrom(String tekst){
        StringBuilder text = new StringBuilder((tekst));
        return tekst.equals(text.reverse().toString());
    }

}
