/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Shubham
 */
public class circularBeans {
    private String title;
    private String body;
    private String priority;
    private String files;

    public circularBeans(String title, String body, String priority, String files) {
        this.title = title;
        this.body = body;
        this.priority = priority;
        this.files = files;
    }
    
     public circularBeans()
        {
            this.title="";
            this.body="";
            this.priority="";
            this.files="";
        }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "circularBeans{" + "title=" + title + ", body=" + body + ", priority=" + priority + ", files=" + files + '}';
    }
    
    
    
}
