/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author user
 */
public class teacher
{
    private String tid;
    private String tname;
    private String tpassword;
    private String subject;
    private String tphone;
    private String tdeptname;
    
    public teacher()
    {
            this.tid="";
            this.tname="";
            this.tpassword="";
            this.subject="";
            this.tphone=""; 
            this.tdeptname="";
    }
    
    public teacher(String tid,String tname,String tpassword,String subject,String tphone,String tdeptname)
    {
            this.tid= tid;
            this.tname=tname;
            this.tpassword=tpassword;
            this.subject = subject;
            this.tphone=tphone;     
            this.tdeptname=tdeptname;
    }
    public String gettid() 
    {
        return tid;
    }

    public void settid(String tid) 
    {
        this.tid = tid;
    }

    public String gettname()
    {
        return tname;
    }

    public void settname(String tname) 
    {
        this.tname = tname;
    }

    public String gettpassword() 
    {
        return tpassword;
    }

    public void settpassword(String tpassword) 
    {
        this.tpassword = tpassword;
    }
    public String getsubject() 
    {
        return subject;
    }

    public void setsubject(String subject) 
    {
        this.subject = subject;
    }
    public String gettphone() 
    {
        return tphone;
    }

    public void settphone(String tphone) 
    {
        this.tphone = tphone;
    }

    public String gettdeptname() {
        return tdeptname;
    }

    public void settdeptname(String tdeptname) {
        this.tdeptname = tdeptname;
    }

    @Override
    public String toString() {
        return "teacher{" + "tid=" + tid + ", tname=" + tname + ", tpassword=" + tpassword + ", subject=" + subject + ", tphone=" + tphone + ", tdeptname=" + tdeptname + '}';
    }
    
    


}
