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
public class student
{
    private String sid;
    private String sname;
    private String spassword;
    private String sclass;
    private String sphone;

    public student()
    {
            this.sid="";
            this.sname="";
            this.spassword="";
            this.sclass="";
            this.sphone="";           
    }
    public String getsid() 
    {
        return sid;
    }

    public void setsid(String sid) 
    {
        this.sid = sid;
    }

    public String getsname()
    {
        return sname;
    }

    public void setsname(String sname) 
    {
        this.sname = sname;
    }

    public String getspassword() 
    {
        return spassword;
    }

    public void setspassword(String spassword) 
    {
        this.spassword = spassword;
    }
    public String getsclass() 
    {
        return sclass;
    }

    public void setsclass(String sclass) 
    {
        this.sclass = sclass;
    }
    public String getsphone() 
    {
        return sphone;
    }

    public void setsphone(String sphone) 
    {
        this.sphone = sphone;
    }
    
    public student(String sid,String sname,String spassword,String sclass,String sphone)
    {
            this.sid= sid;
            this.sname=sname;
            this.spassword=spassword;
            this.sclass = sclass;
            this.sphone=sphone;            
    }
    @Override
    public String toString() 
    {
        return "student{" + "sid=" + sid + ", sname=" + sname + ", spassword=" + spassword + ", sclass =" + sclass + ", sphone=" + sphone + '}';
    }
}