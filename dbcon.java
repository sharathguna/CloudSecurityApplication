
import java.sql.*;
import java.io.*;
public class dbcon 
    {
	
	            Connection con;
                            Statement st;
                            ResultSet rs;
dbcon()
{
	
}
	public String check(String u,String p)
	{ String s=null;	

		
		try{
		
		 st=con.createStatement();
		 rs=st.executeQuery("select * from login where user='"+u+"' and pass='"+p+"' ");

		 if(rs.next())
		
			{
			s="ok";
			}
			else
			{
			s="notok";	
			}
		}catch(Exception e){System.out.println(e);}
		
	return s;	
	}

	public String check_key(String u,String key)
	{ String s=null;	

		
		try{
		
		 st=con.createStatement();
		 rs=st.executeQuery("select * from login where user='"+u+"' and s_code='"+key+"' ");

		 if(rs.next())
		
			{
			s="ok";
			}
			else
			{
			s="notok";	
			}
		}catch(Exception e){System.out.println(e);}
		
	return s;	
	}

public String checkip(String ip)
	{ String s=null;	

		
		try{
			

		 st=con.createStatement();
		 rs=st.executeQuery("select * from ADDRESS where ipaddress='"+ip+"' ");

		 if(rs.next())
		
			{
			s="ok";
			}
			else
			{
			s="notok";	
			}
		}catch(Exception e){System.out.println(e);}
		
	return s;	
	}

public String checkfileoption(String option1)
	{ String s=null;	

		
		try{
			

		 st=con.createStatement();
		 rs=st.executeQuery("select * from RESOURCES where files='"+option1+"' ");

		 if(rs.next())
		
			{
			s=rs.getString(3);
			}
		}catch(Exception e){System.out.println(e);}
		
	return s;	
	}

public String listfile(String clientIp)
	{ String s="";	

		
		try{
			
//select distinct username from userinfo
		 st=con.createStatement();
		 rs=st.executeQuery("select distinct files from RESOURCES where allowedip='"+clientIp+"' ");

		 while(rs.next())
		
			{
			s=s+rs.getString(1)+";";
			}
			
		}catch(Exception e){System.out.println(e);}
		
	return s;	
	}
public String listfile()
	{ String s="";	

		
		/*try{
			

		 st=con.createStatement();
		 rs=st.executeQuery("SELECT distinct files FROM  RESOURCES");

		 while(rs.next())
		
			{
			s=s+rs.getString(1)+";";
			}
			
		}catch(Exception e){System.out.println(e);}
		*/

try (BufferedReader br = new BufferedReader(new FileReader("readres.txt"))) {
    String line;
	String first="",rest="";
	char ch;
	int i;
    while ((line = br.readLine()) != null) {
		first="";
		for(i=0;i<line.length();i++)
			{ch=line.charAt(i);
			if(ch!=':')
			first+=ch;
			else break;
		}
		for(;i<line.length();i++){
		ch=line.charAt(i);
		rest+=ch;
			}

		s=s+first+";";
		}
	}catch(Exception e){System.out.println(e);}
	return s;





	
	}
public String listip()
	{ String s="";	

		
		/*try{
			

		 st=con.createStatement();
		 rs=st.executeQuery("select * from ADDRESS ");

		 while(rs.next())
		
			{
			s=s+rs.getString(1)+";";
			}
			
		}catch(Exception e){System.out.println(e);}
		*/
		try (BufferedReader br = new BufferedReader(new FileReader("readip.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
		s=s+line+";";
		}
	}catch(Exception e){System.out.println(e);}
	return s;
	}

public String getfake(String fil)
	{ String s=null;	

		
		try{
			

		 st=con.createStatement();
		 rs=st.executeQuery("select * from RESOURCES where files='"+fil+"'");

		 if(rs.next())
		
			{
			s=rs.getString(2);
			}
			
		}catch(Exception e){System.out.println(e);}
		System.out.println(s);
	return s;	
	}

//public void removede(String data,String table1,String wh)
public void removede(String data)
	{ 	

		
		try{
			

		/* st=con.createStatement();

		String sql="delete  from "+table1+" where "+wh+"='"+data+"'";
		System.out.println(sql);

		 st.executeUpdate(sql);
		st.executeUpdate(sql);*/

		File inputFile = new File("readip.txt");
		File tempFile = new File("myTempFile.txt");

		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		String lineToRemove = data;
		String currentLine;

while((currentLine = reader.readLine()) != null) {
    // trim newline when comparing with lineToRemove
    String trimmedLine = currentLine.trim();
    if(trimmedLine.equals(lineToRemove)) continue;
    writer.write(currentLine + System.getProperty("line.separator"));
}
writer.close(); 
reader.close(); 
//boolean successful = tempFile.renameTo(inputFile);
 if (!inputFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            // Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(inputFile))
                System.out.println("Could not rename file");


		}catch(Exception e){System.out.println(e);}
		System.out.println("deleted");

	}
public void removederes(String data)
	{ 	

		
		try{
			

		/* st=con.createStatement();

		String sql="delete  from "+table1+" where "+wh+"='"+data+"'";
		System.out.println(sql);

		 st.executeUpdate(sql);
		st.executeUpdate(sql);*/

		File inputFile = new File("readres.txt");
		File tempFile = new File("myTempFile.txt");

		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		String lineToRemove = data;
		String currentLine;

while((currentLine = reader.readLine()) != null) {
    // trim newline when comparing with lineToRemove
    String trimmedLine = currentLine.trim();
    if(trimmedLine.equals(lineToRemove)) continue;
    writer.write(currentLine + System.getProperty("line.separator"));
}
writer.close(); 
reader.close(); 
//boolean successful = tempFile.renameTo(inputFile);
 if (!inputFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            // Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(inputFile))
                System.out.println("Could not rename file");


		}catch(Exception e){System.out.println(e);}
		System.out.println("deleted");

	}
public void add_ip(String s)
	{ 	

		try{
		 /*st=con.createStatement();
		String sql="insert into ADDRESS values('"+s+"')";
		System.out.println(sql);
		 st.executeUpdate(sql);
		//st.executeUpdate(sql);*/

		BufferedWriter bw = null;
		FileWriter fw = null;
		String data = s;
		File file = new File("readip.txt");
		fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);

			bw.write(data);

			System.out.println("Done");
			if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();
		}catch(Exception e){System.out.println(e);}
		System.out.println("added");

	}

public void add_res(String f,String allowedip)
	{ 	

		try{
		 /*st=con.createStatement();

String sql="insert into RESOURCES values('"+f+"','"+ff+"','"+op+"','"+allowedip+"')";
System.out.println(sql);

		 st.executeUpdate(sql);
		//st.executeUpdate(sql);*/


BufferedWriter bw = null;
		FileWriter fw = null;
		String data = f+":"+allowedip;
		File file = new File("readres.txt");
		fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			//bw.write("\n");
			bw.write(System.lineSeparator()+data);

			System.out.println("Done");
			if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();


		}catch(Exception e){System.out.println(e);}
		System.out.println(f+"added");

	}

public void add_user(String user,String pass,String code,int age,String gender,String phone,String address,String mobile)
	{ 	

		try{
			

		 st=con.createStatement();

String sql="insert into LOGIN values('"+user+"','"+pass+"','"+code+"',"+age+",'"+gender+"','"+phone+"','"+address+"','"+mobile+"')";
System.out.println(sql);

		 st.executeUpdate(sql);
		//st.executeUpdate(sql);
		}catch(Exception e){System.out.println(e);}
		System.out.println("added");

	}




public static void main(String arg[])
{
dbcon ob=new dbcon();
/*System.out.println(ob.check("a","a"));
System.out.println(ob.checkip("127.0.0.1"));
System.out.println(ob.listfile());
System.out.println(ob.getfake("Login.java"));
ob.removede("dsds","ADDRESS","IPADDRESS");
*/
//ob.add_ip("aasd");
//ob.add_res("aasd","sss","ddd");
//ob.add_user("a","a","a","w","s","d");
System.out.println(ob.checkfileoption("Logisn.java"));
}
                           
                  
 }
