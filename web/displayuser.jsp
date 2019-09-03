<%-- 
    Document   : displayuser
    Created on : Sep 29, 2018, 7:47:15 PM
    Author     : Shubham
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DBHandlers.DaoMVC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            DaoMVC  dm=new DaoMVC();
            ArrayList arr=dm.returnUser();
            int i=0 ;
            %>
            <select name="sltUser" multiple/>
            <option>----Select User-----</option>
        <%
        while(i<arr.size()) {
        
        %>           
        <option value="<%=arr.get(i).toString()%>"/> <%=arr.get(i).toString()%>
                
        <% 
            i++;
            }
        %>
        
        
             
      
    </body>
</html>
    


<!-- String[] a = request.getParameterValues("multiple");
if(a!=null)
{
    for(int i=0;i<a.length;i++) 
    {
    //out.println(Integer.parseInt(a[i])); //If integer
    out.println(a[i]);
    //
    }
}-->