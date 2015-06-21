package thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoadPosts", urlPatterns = {"/LoadPosts"})
public class LoadPosts extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String file;
        
        String directoryPath = System.getenv("OPENSHIFT_DATA_DIR");
        
        if (directoryPath == null) {
            file = getServletContext().getRealPath("/") + "posts.txt";
        } else {
            file = directoryPath + "posts.txt";
        }

         BufferedReader reader = new BufferedReader(new FileReader(file));
        
        List<ForumPost> posts = new ArrayList<ForumPost>(); 
        
        
        String line; 
        while ((line = reader.readLine()) != null) {
            String username;
            Date date;
            String content;
            
            line = reader.readLine();
            
            username = line;
            line = reader.readLine();
            
            String stringDate = line;
            SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd HH:mm:ss");
            try {
                date = ft.parse(stringDate);
            } catch (ParseException ex) {
                Logger.getLogger(LoadPosts.class.getName()).log(Level.SEVERE, null, ex);
                date = new Date(0);
            }
            line = reader.readLine();
            
            content = line;
            
            posts.add(new ForumPost(username, date, content));
            
            
            
        }
        
        Collections.sort(posts);
        
        request.setAttribute("posts", posts);
        request.getRequestDispatcher("viewPosts.jsp").forward(request, response);
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
