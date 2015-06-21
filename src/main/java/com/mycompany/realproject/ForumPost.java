package thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ForumPost implements Comparable<ForumPost> {
    private String username;
    private Date date;
    private String content;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public String getDateAsString() {
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a");
        return ft.format(date);
    }
    
    public String getDateAsWritableString() {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd HH:mm:ss");
        return ft.format(date);
    }

    public ForumPost(String username, String content) {
        this.username = username;
        this.content = content;
        this.date = new Date();
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public void setDateToCurrentTime() {
        this.date = new Date();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ForumPost(String username, Date date, String content) {
        this.username = username;
        this.date = date;
        this.content = content;
    }

    public ForumPost() {
        this.username = "Default";
        this.date = new Date();
        this.content = "Default content";
    }
    
    @Override
    public String toString() {
        String toReturn = "<ul class='list-group'>" + "\n";
        toReturn += "<li class='list-group-item list-group-item-info'><strong>" 
                + username + "</strong> - " + getDateAsString() + "</li" + "\n";
        toReturn += "<li class='list-group-item'>" + content + "</li>" + "\n";
        toReturn += "</ul>";
        
        return toReturn;
    }

    @Override
    public int compareTo(ForumPost comparePost) {
        return comparePost.date.compareTo(this.date);
    }
    
    
    
}
