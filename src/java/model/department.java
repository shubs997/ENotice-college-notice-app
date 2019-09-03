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

public class department
{
    private String deptno;
    private String deptname;
    
    public department()
    {
        this.deptno="";
        this.deptname="";
    }
    
    public String getdeptno() 
    {
        return deptno;
    }

    public void setdeptno(String deptno) 
    {
        this.deptno = deptno;
    }

    public String getdeptname() 
    {
        return deptname;
    }

    public void setLast(String deptname) 
    {
        this.deptname = deptname;
    }

    public department(String deptno,String deptname)
    {
            this.deptno = deptno;
            this.deptname = deptname;            
    }
    
    @Override
    public String toString() 
    {
        return "department{" + "deptno=" + deptno + ", deptname=" + deptname + '}';
    }

}
