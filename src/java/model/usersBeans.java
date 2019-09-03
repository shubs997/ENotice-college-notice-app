package model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubham
 */
public class usersBeans 
{   
       private int sid;
       private String name;
       private String last;
       private String pass;
       private String emailid;
       private String gend;
       private String dept;
        
        public usersBeans()
        {
            this.sid=0;
            this.name="";
            this.last="";
            this.emailid="";
            this.gend="";
            this.dept="";
        }
        
        public usersBeans(int sid,String name,String last,String emailid,String gend,String dept)
        {
            this.sid=this.sid;
            this.name=name;
            this.last=last;
            this.pass=pass;
            this.emailid=emailid;
            this.gend=gend;
            this.dept=dept;
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getGend() {
        return gend;
    }

    public void setGend(String gend) {
        this.gend = gend;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "usersBeans{" + "sid=" + sid + ", name=" + name + ", last=" + last + ", pass=" + pass + ", emailid=" + emailid + ", gend=" + gend + ", dept=" + dept + '}';
    }
        
    
        
        



   

}