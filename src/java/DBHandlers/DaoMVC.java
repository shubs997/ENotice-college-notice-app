package DBHandlers;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.admin;
import model.circularBeans;
import model.hod;
import model.noticeBeans;
import model.teacher;

import model.usersBeans;


public class DaoMVC
{

    private static Connection connect()
    {
    	String url="jdbc:mysql://localhost:3306/testapp";
    	String username="root";
    	String password="root";

        Connection con=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        }

        catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }


        public static int register(usersBeans ub)
    {
        int i=0;
        String sql="insert into newuser (firstname,lastname,password,email,gender,department) values(?,?,?,?,?,?)";
        Connection con=connect();
        try
        {
            PreparedStatement stm =con.prepareStatement(sql);
            stm.setString(1,ub.getName());
            stm.setString(2,ub.getLast());
            stm.setString(3,ub.getPass());
            stm.setString(4,ub.getEmailid());
            stm.setString(5,ub.getGend());
            stm.setString(6,ub.getDept());

            i = stm.executeUpdate();
        }

        catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }






	public static ResultSet loginUser(usersBeans ub)
	{
		ResultSet rs=null;
                String sql="select * from newuser where firstname=? and password=?";
		Connection con=connect();
		try
		{
			PreparedStatement stm=con.prepareStatement(sql);
			stm.setString(1, ub.getName());
			stm.setString(2,ub.getPass());

			rs=stm.executeQuery();


		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}

  public static ResultSet login_admin(admin an)
	{
		ResultSet rs=null;
                String sql="select * from login_admin where id=? and password=?";
		Connection con=connect();
		try
		{
			PreparedStatement stm=con.prepareStatement(sql);
			stm.setString(1,an.getid());
			stm.setString(2,an.getpassword());

			rs=stm.executeQuery();


		}
		catch (SQLException e) 
                {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}

        public static ResultSet login_hod(hod hn)
	{
		ResultSet rs=null;
                String sql="select * from hod where hid=? and hpassword=?";
		Connection con=connect();
		try
		{
			PreparedStatement stm=con.prepareStatement(sql);
			stm.setString(1, hn.gethid());
			stm.setString(2, hn.gethpassword());

			rs=stm.executeQuery();


		}
		catch (SQLException e) 
                {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}

        public static ResultSet login_teacher(teacher tn)
	{
		ResultSet rs=null;
                String sql="select * from teacher where tid=? and tpassword=?";
		Connection con=connect();
		try
		{
			PreparedStatement stm=con.prepareStatement(sql);
			stm.setString(1, tn.gettid());
			stm.setString(2, tn.gettpassword());
                        System.out.println("tid:" +tn.gettid());
                        System.out.println("tpass:" +tn.gettpassword());
                        
			rs=stm.executeQuery();


		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}


    public static int updateUser(usersBeans ub)
    {
        int i=0;
        ResultSet rs=null;
            String sql="call updateUser(?,?,?,?,?,?);";
	Connection con=connect();
	try
	{
                System.out.println("Pass:"+ub.getPass());
                System.out.println("Gender:"+ub.getGend());
                System.out.println("email:"+ub.getEmailid());
                System.out.println("Last:" +ub.getLast());
                System.out.println("Dept:" +ub.getDept());
                System.out.println("name:"+ub.getName());
		//PreparedStatement stm=con.prepareStatement(sql);
                
                CallableStatement cstm= con.prepareCall(sql);
                cstm.setString(1, ub.getName());
                cstm.setString(2, ub.getLast());
                cstm.setString(3, ub.getPass());
                cstm.setString(4, ub.getEmailid());
                cstm.setString(5, ub.getGend());
                cstm.setString(6, ub.getDept());
                //cstm.registerOutParameter(7, java.sql.Types.INTEGER);
                cstm.execute();
                //i=cstm.getInt(7);
                
                System.out.println("str:"+sql);

                System.out.println("VALUE OF i is" +i);

	} catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public static int updatestudent(usersBeans ub)
    {
        int i=0;
        ResultSet rs=null;
        String sql="update newuser set lastname=?,password=?,email=?,gender=?,department=? where firstname=?";
	Connection con=connect();
	try
	{
                  System.out.println("Pass:"+ub.getPass());
                System.out.println("Gender:"+ub.getGend());
                System.out.println("email:"+ub.getEmailid());
                System.out.println("Last:" +ub.getLast());
                System.out.println("Dept:" +ub.getDept());
                System.out.println("name:"+ub.getName());
		PreparedStatement stm=con.prepareStatement(sql);

		stm.setString(1, ub.getLast());
                stm.setString(2, ub.getPass());
                stm.setString(3, ub.getEmailid());
                stm.setString(4, ub.getGend());
		stm.setString(5, ub.getDept());

		stm.setString(6,ub.getName()); //for name in where condition

		 //for name in where condition



                //stm.setString(7,ub.getName()); //for: "where username=?"
                System.out.println("str:"+sql);


                 i=stm.executeUpdate();

                System.out.println("VALUE OF i is" +i);

	}
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
   
    
    public static int updatehod(hod hd)
    {
        int i=0;
        ResultSet rs=null;
        String sql="update hod set hname=?,hpassword=?,hphone=?,hdeptbname=? where hid=?";
	Connection con=connect();
	try
	{
                 System.out.println("id:" +hd.gethid());
                System.out.println("name:"+hd.gethname());
                System.out.println("Pass:"+hd.gethpassword());
                System.out.println("phone:"+hd.gethphone());
                System.out.println("dept:"+hd.gethdeptname());
               
                
		PreparedStatement stm=con.prepareStatement(sql);

		stm.setString(1, hd.gethname());
                stm.setString(2, hd.gethpassword());
                stm.setString(3, hd.gethphone());
                stm.setString(4, hd.gethdeptname());
		stm.setString(5, hd.gethid());

		 //for name in where condition



                //stm.setString(7,ub.getName()); //for: "where username=?"
                System.out.println("str:"+sql);


                 i=stm.executeUpdate();

                System.out.println("VALUE OF i is" +i);

	}
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public static int storeNotice(noticeBeans nb)  //publish notice
    {
        int i=0;
        String sql="insert into notice (title,body,priority,sltUser,files) values(?,?,?,?,?)";
        Connection con=connect();
        try
        {
            PreparedStatement stm =con.prepareStatement(sql);
            stm.setString(1,nb.getTitle());
            stm.setString(2,nb.getBody());
            stm.setString(3,nb.getPriority());
            
            String uarraystr = Arrays.toString(nb.getSltUser());
            stm.setString(4,uarraystr);
            System.out.println("users in DAO class :" +uarraystr);

            stm.setString(5,nb.getFiles());
            
            i = stm.executeUpdate(); 
        }

        catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

   
    
    public static ArrayList displayNotice(usersBeans ub)
    {
        ResultSet rs=null;
        String sql="select * from notice where sltuser like ? ORDER BY priority";
	Connection con=connect();
        ArrayList<noticeBeans> nlist = new ArrayList<>();

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());
                    stm.setString(1,"%"+ub.getName()+"%");
                    
                    System.out.println("value of ? is:"+"%"+ub.getName()+"%");
                    System.out.println("sltuser: " +ub.getName());
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){

                        String title = rs.getString(1);
                        String body = rs.getString(2);
                        String priority = rs.getString(3);
                        String sltUser = rs.getString(4);
                        String files = rs.getString(5);
                        System.out.println("Table Contents in dispNotice class:" +title+" "+body+" "+priority+" "+sltUser);
                        
                        //set the values in noticeBeans model
                        noticeBeans nb=new noticeBeans();
                        nb.setTitle(title);
                        nb.setBody(body);
                        nb.setPriority(priority);
                        nb.setStlUserStrings(sltUser);
                        nb.setFiles(files);
                        System.out.println("Table Contents in dispNotice class to model:" +nb.getTitle()+" "+nb.getBody()+" "+nb.getPriority()+" "+nb.getStlUserStrings());
                        
                        nlist.add(nb);
                     }

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return nlist;
    }

    public static ArrayList displayStaffNotice()
    {
        ResultSet rs=null;
        String sql="select * from notice ORDER BY PRIORITY";
	Connection con=connect();
        ArrayList<noticeBeans> nlist = new ArrayList<>();

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());
                    //stm.setString(1,"%"+ub.getName()+"%");
                    //System.out.println("value of ? is:"+"%"+ub.getName()+"%");
                    //System.out.println("sltuser: " +ub.getName());
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){

                        String title = rs.getString(1);
                        String body = rs.getString(2);
                        String priority = rs.getString(3);
                        String sltUser = rs.getString(4);
                        String files = rs.getString(5);
                        System.out.println("Table Contents in dispNotice class:" +title+" "+body+" "+priority+" "+sltUser);
                        
                        //set the values in noticeBeans model
                        noticeBeans nb=new noticeBeans();
                        nb.setTitle(title);
                        nb.setBody(body);
                        nb.setPriority(priority);
                        nb.setStlUserStrings(sltUser);
                        nb.setFiles(files);
                        System.out.println("Table Contents in dispNotice class to model:" +nb.getTitle()+" "+nb.getBody()+" "+nb.getPriority()+" "+nb.getStlUserStrings()+" "+nb.getFiles());
                        
                        nlist.add(nb);
                     }

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return nlist;
    }
    public static List viewNotice(String NoticeID, usersBeans ub) 
    {   
         ResultSet rs=null;
         String sql="select * from notice where sltuser like ? and title like ? ORDER BY PRIORITY";
	 Connection con=connect();
         ArrayList<noticeBeans> vlist = new ArrayList<>();

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());
                    stm.setString(1,"%"+ub.getName()+"%");
                    stm.setString(2,NoticeID);
                    System.out.println("value of 1st ? is:"+"%"+ub.getName()+"%");
                    System.out.println("value of 2nd ? is:"+"%"+NoticeID+"%");
                    
                    System.out.println("sltuser: " +ub.getName());
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){

                        String title = rs.getString(1);
                        String body = rs.getString(2);
                        String priority = rs.getString(3);
                        String sltUser = rs.getString(4);
                        String files = rs.getString(5);
                        System.out.println("Table Contents in dispNotice class:" +title+" "+body+" "+priority+" "+sltUser);
                        
                        //set the values in noticeBeans model
                        noticeBeans nb=new noticeBeans();
                        nb.setTitle(title);
                        nb.setBody(body);
                        nb.setPriority(priority);
                        nb.setStlUserStrings(sltUser);
                        nb.setFiles(files);
                        System.out.println("Table Contents in dispNotice class to model:" +nb.getTitle()+" "+nb.getBody()+" "+nb.getPriority()+" "+nb.getStlUserStrings());
                        
                        vlist.add(nb);
                     }

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vlist;

    }

    
    public static List viewStaffNotice(String NoticeID) 
    {   
         ResultSet rs=null;
         String sql="select * from notice where title like ? ORDER BY PRIORITY";
	 Connection con=connect();
         ArrayList<noticeBeans> vlist = new ArrayList<>();

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());
                    stm.setString(1,NoticeID);
                    //System.out.println("value of 1st ? is:"+"%"+ub.getName()+"%");
                    System.out.println("value of 2nd ? is:"+"%"+NoticeID+"%");
                    
                    //System.out.println("sltuser: " +ub.getName());
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){

                        String title = rs.getString(1);
                        String body = rs.getString(2);
                        String priority = rs.getString(3);
                        String sltUser = rs.getString(4);
                        String files = rs.getString(5);
                        System.out.println("Table Contents in dispNotice class:" +title+" "+body+" "+priority+" "+sltUser);
                        
                        //set the values in noticeBeans model
                        noticeBeans nb=new noticeBeans();
                        nb.setTitle(title);
                        nb.setBody(body);
                        nb.setPriority(priority);
                        nb.setStlUserStrings(sltUser);
                        nb.setFiles(files);
                        System.out.println("Table Contents in dispNotice class to model:" +nb.getTitle()+" "+nb.getBody()+" "+nb.getPriority()+" "+nb.getStlUserStrings());
                        
                        vlist.add(nb);
                     }

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vlist;

    }
    
    
    public static String returnFileName(String NoticeID) 
    {
         ResultSet rs=null;
         String sql="select files from notice where title like ?";
	 Connection con=connect();
         ArrayList<noticeBeans> vlist = new ArrayList<>();
        
          

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());

                    stm.setString(1,NoticeID);
                    System.out.println("IN returnFileName value of ? is:"+NoticeID);
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){
                        String fileName1 = rs.getString(1);                       
                        return fileName1;

                     }                   
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null; 
    }

    public static int addUser(usersBeans ub) 
    {
        int i=0;
        String sql="insert into newuser (firstname,lastname,password,email,gender,department) values(?,?,?,?,?,?)";
        Connection con=connect();
        try
        {
            PreparedStatement stm =con.prepareStatement(sql);
            stm.setString(1,ub.getName());
            stm.setString(2,ub.getLast());
            stm.setString(3,ub.getPass());
            stm.setString(4,ub.getEmailid());
            stm.setString(5,ub.getGend());
            stm.setString(6,ub.getDept());

            i = stm.executeUpdate();
        }

        catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public static int registerHod(hod hd) 
    {
        int i=0;
        String sql="insert into hod (hid,hname,hpassword) values(?,?,?)";
        Connection con=connect();
        try
        {
            PreparedStatement stm =con.prepareStatement(sql);
            stm.setString(1,hd.gethid());
            stm.setString(2,hd.gethname());
            stm.setString(3,hd.gethpassword());
            

            i = stm.executeUpdate();
            
        }

        catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;

    }

    public static int storeCircular(circularBeans cb) 
    {
        int i=0;
        String sql="insert into circular (title,body,priority,files) values(?,?,?,?)";
        Connection con=connect();
        try
        {
            PreparedStatement stm =con.prepareStatement(sql);
            stm.setString(1,cb.getTitle());
            stm.setString(2,cb.getBody());
            stm.setString(3,cb.getPriority());
            stm.setString(4,cb.getFiles());
            
            i = stm.executeUpdate();
        }

        catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
        
    }

    public static List displayCircular() 
    {   
       ResultSet rs=null;
        String sql="select * from circular";
	Connection con=connect();
        ArrayList<circularBeans> clist = new ArrayList<>();

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){

                        String title = rs.getString(1);
                        String body = rs.getString(2);
                        String priority = rs.getString(3);
                        String files = rs.getString(4);
                        System.out.println("Table Contents in dispCircular method:" +title+" "+body+" "+priority+" ");
                        
                        //set the values in noticeBeans model
                        circularBeans cb=new circularBeans();
                        cb.setTitle(title);
                        cb.setBody(body);
                        cb.setPriority(priority);
                        cb.setFiles(files);
                        System.out.println("Table Contents in dispNotice class to model:" +cb.getTitle()+" "+cb.getBody()+" "+cb.getPriority()+" ");
                        System.out.println("files are set in noticebeans");
                        clist.add(cb);
                     }

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return clist;
    }

    public static List viewCircular(String CircularID) 
    {
        ResultSet rs=null;
         String sql="select * from circular where title like ?";
	 Connection con=connect();
         ArrayList<circularBeans> elist = new ArrayList<>();

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());
                    stm.setString(1,CircularID);
                    //System.out.println("value of 1st ? is:"+"%"+ub.getName()+"%");
                    System.out.println("value of ? is:"+"%"+CircularID+"%");
                    
                    //System.out.println("sltuser: " +ub.getName());
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){
                        System.out.println("in while loop");
                        String title = rs.getString(1);
                        String body = rs.getString(2);
                        String priority = rs.getString(3);
                        String files = rs.getString(4);
                        System.out.println("Table Contents in dispNotice class:" +title+" "+body+" "+priority+" ");
                        
                        //set the values in noticeBeans model
                        circularBeans cb=new circularBeans();
                        cb.setTitle(title);
                        cb.setBody(body);
                        cb.setPriority(priority);
                        cb.setFiles(files);
                        System.out.println("Table Contents in dispNotice class to model:" +cb.getTitle()+" "+cb.getBody()+" "+cb.getPriority()+" "+cb.getFiles());
                        
                        elist.add(cb);
                     }

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return elist;
    }

    public static int registerStudent(usersBeans ub) 
    {
        int i=0;
        String sql="insert into newuser (sid,firstname,password) values(?,?,?)";
        Connection con=connect();
        try
        {
            PreparedStatement stm =con.prepareStatement(sql);
            stm.setInt(1,ub.getSid());
            stm.setString(2,ub.getName());
            stm.setString(3,ub.getPass());
            System.out.println("1 qm set to" +ub.getSid());
            System.out.println("2 qm set to" +ub.getName());
            System.out.println("3 qm set to" +ub.getPass());
            

            i = stm.executeUpdate();
            System.out.println("i in registerStudent:" +i);
        }

        catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;

    }

    public static int storeStaffCircular(circularBeans cb) 
    {
        int i=0;
        String sql="insert into circular_staff (title,body,priority,files) values(?,?,?,?)";
        Connection con=connect();
        try
        {
            PreparedStatement stm =con.prepareStatement(sql);
            stm.setString(1,cb.getTitle());
            stm.setString(2,cb.getBody());
            stm.setString(3,cb.getPriority());
            stm.setString(4,cb.getFiles());
            
            i = stm.executeUpdate();
        }

        catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public static List displayStaffCircular() 
    {
        ResultSet rs=null;
        String sql="select * from circular_staff";
	Connection con=connect();
        ArrayList<circularBeans> clist = new ArrayList<>();

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){

                        String title = rs.getString(1);
                        String body = rs.getString(2);
                        String priority = rs.getString(3);
                        String files = rs.getString(4);
                        System.out.println("Table Contents in dispCircular method:" +title+" "+body+" "+priority+" ");
                        
                        //set the values in noticeBeans model
                        circularBeans cb=new circularBeans();
                        cb.setTitle(title);
                        cb.setBody(body);
                        cb.setPriority(priority);
                        cb.setFiles(files);
                        System.out.println("Table Contents in dispNotice class to model:" +cb.getTitle()+" "+cb.getBody()+" "+cb.getPriority()+" ");
                        System.out.println("files are set in noticebeans");
                        clist.add(cb);
                     }

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return clist;
    }

    public static List viewCircularStaff(String CircularID) 
    {
        ResultSet rs=null;
         String sql="select * from circular_staff where title like ?";
	 Connection con=connect();
         ArrayList<circularBeans> elist = new ArrayList<>();

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());
                    stm.setString(1,CircularID);
                    //System.out.println("value of 1st ? is:"+"%"+ub.getName()+"%");
                    System.out.println("value of ? is:"+"%"+CircularID+"%");
                    
                    //System.out.println("sltuser: " +ub.getName());
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){
                        System.out.println("in while loop");
                        String title = rs.getString(1);
                        String body = rs.getString(2);
                        String priority = rs.getString(3);
                        String files = rs.getString(4);
                        System.out.println("Table Contents in dispNotice class:" +title+" "+body+" "+priority+" ");
                        
                        //set the values in noticeBeans model
                        circularBeans cb=new circularBeans();
                        cb.setTitle(title);
                        cb.setBody(body);
                        cb.setPriority(priority);
                        cb.setFiles(files);
                        System.out.println("Table Contents in dispNotice class to model:" +cb.getTitle()+" "+cb.getBody()+" "+cb.getPriority()+" "+cb.getFiles());
                        
                        elist.add(cb);
                     }

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return elist;
    }

    public static String returnCircularFileName(String CircularID) 
    {
        ResultSet rs=null;
         String sql="select files from circular_staff where title like ?";
	 Connection con=connect();
         ArrayList<noticeBeans> vlist = new ArrayList<>();
        
          

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());

                    stm.setString(1,CircularID);
                    System.out.println("IN returnFileName value of ? is:"+CircularID);
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){
                        String fileName1 = rs.getString(1);                       
                        return fileName1;

                     }                   
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null; 
    }

    public static int returnStudentCount() 
    {
        int i=0;
        ResultSet rs=null;
            //String sql="update newuser set lastname=?,password=?,email=?,gender=?,department=? where firstname=?";
            String sql="call get_student_count(?);";
	Connection con=connect();
	try
	{
                CallableStatement cstm= con.prepareCall(sql);
                cstm.registerOutParameter(1, java.sql.Types.INTEGER);
                cstm.execute();
                i=cstm.getInt(1);
                
                System.out.println("str:"+sql);

                System.out.println("count of users in newuser is" +i);

	} catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public static int returnNoticeCount() 
    {
        int i=0;
        ResultSet rs=null;
            //String sql="update newuser set lastname=?,password=?,email=?,gender=?,department=? where firstname=?";
            String sql="call get_notice_count(?);";
	Connection con=connect();
	try
	{
                CallableStatement cstm= con.prepareCall(sql);
                cstm.registerOutParameter(1, java.sql.Types.INTEGER);
                cstm.execute();
                i=cstm.getInt(1);
                
                System.out.println("str:"+sql);

                System.out.println("count of notices in notice is" +i);

	} catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public static int returnCircularCount() 
    {
        int i=0;
        ResultSet rs=null;
            //String sql="update newuser set lastname=?,password=?,email=?,gender=?,department=? where firstname=?";
            String sql="call get_circular_count(?);";
	Connection con=connect();
	try
	{
                CallableStatement cstm= con.prepareCall(sql);
                cstm.registerOutParameter(1, java.sql.Types.INTEGER);
                cstm.execute();
                i=cstm.getInt(1);
                
                System.out.println("str:"+sql);

                System.out.println("count of notices in notice is" +i);

	} catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public static int updatestaff(teacher td) 
    {
        int i=0;
        ResultSet rs=null;
        String sql="update hod set hname=?,hpassword=?,hphone=?,hdeptbname=? where hid=?";
	Connection con=connect();
	try
	{
                 System.out.println("id:" +td.gettid());
                System.out.println("name:"+td.gettname());
                System.out.println("Pass:"+td.gettpassword());
                System.out.println("phone:"+td.gettphone());
                System.out.println("dept:"+td.gettdeptname());
               
                
		PreparedStatement stm=con.prepareStatement(sql);

		stm.setString(1, td.gettname());
                stm.setString(2, td.gettpassword());
                stm.setString(3, td.gettphone());
                stm.setString(4, td.gettdeptname());
		stm.setString(5, td.gettid());

		 //for name in where condition



                //stm.setString(7,ub.getName()); //for: "where username=?"
                System.out.println("str:"+sql);


                 i=stm.executeUpdate();

                System.out.println("VALUE OF i is" +i);

	}
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public static List getUserViews(String NoticeID) 
    {
        ResultSet rs=null;
         String sql="select userviews from notice_views where NoticeID=?;";
         //String sql="insert into notice_views (userviews) values(?) where NoticeID=?";
	 Connection con=connect();
         ArrayList<String> userslist = new ArrayList<>();

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());
                    //stm.setString(1,"%"+ub.getName()+"%");
                    stm.setString(1,NoticeID);
                    System.out.println("value of 2nd ? is:"+"%"+NoticeID+"%");
                    
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){
                        String users = rs.getString(1);
                        System.out.println("users array in getnoticeviews" +users);
                        
                        userslist.add(users);
                     }

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return userslist;
    }

    public static int insertUserInViews(String NoticeID, String users) 
    {
        int i=0;
        ResultSet rs=null;
        String sql="update notice_views set userviews=? where NoticeID=?";
	Connection con=connect();
	try
	{
		PreparedStatement stm=con.prepareStatement(sql);
		stm.setString(1, users);
                stm.setString(2, NoticeID);
                
                i=stm.executeUpdate();

                System.out.println(" users updated! VALUE OF i is" +i);

	}
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public static String returnViewsToStaff() 
    {
        return null;
        
    }
    

    
    
    
    

    public ArrayList returnUser()
    {
        ResultSet rs=null;
        ArrayList arr=new ArrayList();
        String returnuser="select firstname from newuser";
        Connection con=connect();
        try
        {
            PreparedStatement pss=con.prepareStatement(returnuser);
            rs=pss.executeQuery();

            while(rs.next()){
                arr.add(rs.getString("firstname"));
            }
        }

        catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }


    }//class close
