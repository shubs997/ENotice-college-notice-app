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
public class hod
{
    private String hid;
    private String hname;
    private String hpassword;
    private String hphone;
    private String hdeptname;


    public hod()
    {
            this.hid="";
            this.hname="";
            this.hpassword="";
            this.hphone="";    
            this.hdeptname="";
    }
    
    public hod(String hid,String hname,String hpassword,String hphone,String hdeptname)
    {
            this.hid= hid;
            this.hname=hname;
            this.hpassword=hpassword;
            this.hphone=hphone;
            this.hdeptname=hdeptname;
            
    }
    public String gethid() 
    {
        return hid;
    }

    public void sethid(String hid) 
    {
        this.hid = hid;
    }

    public String gethname()
    {
        return hname;
    }

    public void sethname(String hname) 
    {
        this.hname = hname;
    }

    public String gethpassword() 
    {
        return hpassword;
    }

    public void sethpassword(String hpassword) 
    {
        this.hpassword = hpassword;
    }

    public String gethphone() 
    {
        return hphone;
    }

    public void sethphone(String hphone) 
    {
        this.hphone = hphone;
    }
        
    public String gethdeptname() {
        return hdeptname;
    }

    public void sethdeptname(String hdeptname) {
        this.hdeptname = hdeptname;
    }

    @Override
    public String toString() {
        return "hod{" + "hid=" + hid + ", hname=" + hname + ", hpassword=" + hpassword + ", hphone=" + hphone + ", hdeptname=" + hdeptname + '}';
    }
    
   
    
}