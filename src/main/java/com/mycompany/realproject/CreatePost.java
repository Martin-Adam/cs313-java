package thread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CreatePost", urlPatterns = {"/CreatePost"})
public class CreatePost extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if (request.getParameter("content") == null) {
            response.sendRedirect("./newPost.jsp");
            return;
        }
        
        HttpSession session = request.getSession();
        if (session.getAttribute("username") == null) {
            response.sendRedirect("./login.jsp");
            return;
        }
        
        String username = (String) session.getAttribute("username");
        String content = request.getParameter("content");
        
        ForumPost newPost = new ForumPost(username, content);
        
        
        String filepath;
        
        String directoryPath = System.getenv("OPENSHIFT_DATA_DIR");
        
        if (directoryPath == null || directoryPath.equals("")) {
            filepath = getServletContext().getRealPath("/") + "posts.txt";
        } else {
            filepath = directoryPath + "posts.txt";
        }

        try {
            File file = new File(filepath);
            
            if (!file.exists()) {
                file.createNewFile();
            }
            
            
            FileWriter writer = new FileWriter(file, true);
            
            writer.append("NEWPOST");
            writer.append("\n");
            writer.append(newPost.getUsername());
            writer.append("\n");
            writer.append(newPost.getDateAsWritableString());
            writer.append("\n");
            writer.append(newPost.getContent().replace("\n", "").replace("\r", "<br />"));
            writer.append("\n");
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }
        response.sendRedirect("./LoadPosts");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
