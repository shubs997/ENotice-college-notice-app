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
public class noticeBeans {
    private String title;
    private String body;
    private String priority;
    private String[] sltUser = null;
    private String stlUserStrings;
    private String files;
    
    public noticeBeans()
        {
            this.title="";
            this.body="";
            this.priority="";
            this.sltUser = new String[5];
            this.stlUserStrings="";
            this.files="";
        }

    public String getStlUserStrings() {
        return stlUserStrings;
    }

    public void setStlUserStrings(String stlUserStrings) {
        this.stlUserStrings = stlUserStrings;
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

    public String[] getSltUser() {
        return sltUser;
    }

    public void setSltUser(String[] sltUser) {
        this.sltUser = sltUser;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }
    
      
}
