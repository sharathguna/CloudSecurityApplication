//import java.rmi.*;
//import java.rmi.server.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import java.lang.*;
import java.awt.*;
import javax.swing.filechooser.FileSystemView;
import java.util.StringTokenizer;
import java.net.InetAddress;
import java.rmi.Naming;
import java.util.Date;
import java.util.Vector;
import java.util.Random;
public class Login extends javax.swing.JFrame 
{
String honey="192.168.56.1";
	    RMISImpl ref;
	   JOptionPane op;
	    Vector v= new Vector(2);
            Vector u=new Vector(2);
	    String sss=null;
		static String username,passwd;
  ImageIcon image4 = new ImageIcon(LoginDialog.class.getResource("images/JpgStop.gif"));

    /** Creates new form Login */

	    public Login()
	 {
	        initComponents();
    	 }
  
  	  private void initComponents() 
		{
		//GEN-BEGIN:initComponents
        	         jPan = new javax.swing.JPanel();
	         jLabel1 = new javax.swing.JLabel();
	        user = new javax.swing.JTextField();
	        jLabel2 = new javax.swing.JLabel();
	        submit = new javax.swing.JButton();
	        reset = new javax.swing.JButton();
	        exit = new javax.swing.JButton();
	        pass = new javax.swing.JPasswordField();
	        jLabel3 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
	       op=new JOptionPane();
	       getContentPane().setLayout(null);
	
       	       jPanel1 = new javax.swing.JPanel();
	       listres = new javax.swing.JList();
	        jLab = new javax.swing.JLabel();
	        download = new javax.swing.JButton();
		upload=new javax.swing.JButton();
	        resArea = new TextArea();
	        save = new javax.swing.JButton();

	        getContentPane().setLayout(null);
            
	        addWindowListener(new java.awt.event.WindowAdapter() 
		{
		            public void windowClosing(java.awt.event.WindowEvent evt) 
			{
	
                		exitForm(evt);
	
            			}
		  });

	        jPan.setLayout(null);

	        jPan.setBackground(new java.awt.Color(0, 116, 232));
	        jPan.setBorder(new javax.swing.border.EtchedBorder());
	        jLab.setFont(new java.awt.Font("Arial", 0, 14));
			jLab.setForeground(new java.awt.Color(255, 255, 255));
	        jLab.setText("User ID:");
	        jPan.add(jLab);
	        jLab.setBounds(40, 40, 90, 30);

	        jPan.add(user);
	        user.setBounds(140, 40, 100, 30);

	        jLabel2.setFont(new java.awt.Font("Arial", 0, 14));
			jLabel2.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel2.setText("Password:");
	        jPan.add(jLabel2);
	        jLabel2.setBounds(40, 90, 90, 30);

	        submit.setBackground(new java.awt.Color(255, 255, 255));
	        submit.setFont(new java.awt.Font("Arial", 0, 14));
	        submit.setForeground(new java.awt.Color(0, 0, 0));
	        submit.setText("Submit");

	        submit.addActionListener(new java.awt.event.ActionListener() 
		{
		        public void actionPerformed(java.awt.event.ActionEvent evt)
			 {
			                submitActionPerformed(evt);
           			 }
        		});

	        jPan.add(submit);
	        submit.setBounds(20, 150, 80, 27);

	        reset.setBackground(new java.awt.Color(255, 255, 255));
	        reset.setFont(new java.awt.Font("Arial", 0, 14));
	        reset.setForeground(new java.awt.Color(0, 0, 0));
	        reset.setLabel("Reset");

	        reset.addActionListener(new java.awt.event.ActionListener()
		 {
		            public void actionPerformed(java.awt.event.ActionEvent evt) 
			{
		                resetActionPerformed(evt);
            			}
        		});

	        jPan.add(reset);
	        reset.setBounds(120, 150, 80, 27);

	        exit.setBackground(new java.awt.Color(255, 255, 255));
	        exit.setFont(new java.awt.Font("Arial", 0, 14));
	        exit.setForeground(new java.awt.Color(0, 0, 0));
	        exit.setLabel("Exit");
	        exit.addActionListener(new java.awt.event.ActionListener() 
		{
	            		public void actionPerformed(java.awt.event.ActionEvent evt) 
				{
			                exitActionPerformed(evt);
           				 }
		  });

	        jPan.add(exit);
	        exit.setBounds(220, 150, 70, 27);

	        jPan.add(pass);
	        pass.setBounds(140, 91, 100, 30);

	        getContentPane().add(jPan);
	        jPan.setBounds(60, 100, 320, 200);

	        jLabel3.setFont(new java.awt.Font("Arial", 0, 20));
	        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
	        jLabel3.setText("Ensuring Data Storage Security in Cloud Computing");
	        getContentPane().add(jLabel3);
	        jLabel3.setBounds(200, 10, 700, 30);

		jLabel4.setFont(new java.awt.Font("Arial", 0, 20));
	        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
	        jLabel4.setText("By Team 13");
	        getContentPane().add(jLabel4);
	        jLabel4.setBounds(500, 375, 700, 30);


		
		jLabel5.setFont(new java.awt.Font("Arial", 0, 20));
	        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
	        jLabel5.setText("G Sharath, Sruthi , Divyashree and Sukrithi");
	        getContentPane().add(jLabel5);
	        jLabel5.setBounds(500, 375+25, 1000, 30);

		jLabel6.setFont(new java.awt.Font("Arial", 0, 20));
	        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
	        jLabel6.setText("Under Ms. Ciji K R");
	        getContentPane().add(jLabel6);
	        jLabel6.setBounds(550, 425+25, 1000, 30);


			JLabel imageLabel = new JLabel();
            ImageIcon ii = new ImageIcon(LoginDialog.class.getResource("images/network.JPG"));
            imageLabel.setIcon(ii);
            imageLabel.setBounds(400,500,481,241);
            imageLabel.setBackground(new Color(0, 116, 232));
            this.getContentPane().add(imageLabel);
		

	        pack();

	        jPanel1.setLayout(null);
            jPanel1.setBackground(new java.awt.Color(0, 116, 232));
	        jPanel1.setBorder(new javax.swing.border.EtchedBorder());
	        listres.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
	        jPanel1.add(listres);
	        listres.setBounds(20, 50, 150, 220);

	        jLabel1.setFont(new java.awt.Font("Arial", 0, 17));
			jLabel1.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel1.setText("Resources Available:");
	        jPanel1.add(jLabel1);
	        jLabel1.setBounds(20, 5, 200, 40);

	        download.setBackground(new java.awt.Color(255, 255, 255));
	        download.setFont(new java.awt.Font("Arial", 0, 15));
			download.setForeground(new java.awt.Color(0, 0, 0));
	        download.setText("View File");
	
	        download.addActionListener(new java.awt.event.ActionListener() 
		{
		            public void actionPerformed(java.awt.event.ActionEvent evt) 
			{
			                downloadActionPerformed(evt);
            			}
		   });

	        jPanel1.add(download);
	        download.setBounds(180, 60, 110, 27);
	
	        getContentPane().add(jPanel1);
	        jPanel1.setBounds(20, 40, 340, 280);
	
	
	        getContentPane().add(resArea);
	        resArea.setBounds(20, 330, 450, 200);






		 upload.setBackground(new java.awt.Color(255, 255, 255));
	        upload.setFont(new java.awt.Font("Arial", 0, 15));
			upload.setForeground(new java.awt.Color(0, 0, 0));
	        upload.setText("Upload File");
	
	        upload.addActionListener(new java.awt.event.ActionListener() 
		{
		            public void actionPerformed(java.awt.event.ActionEvent evt) 
			{
			                uploadActionPerformed(evt);
            			}
		   });

	        jPanel1.add(upload);
	        upload.setBounds(180, 100, 110, 27);
	
	        getContentPane().add(jPanel1);
	        jPanel1.setBounds(20, 40, 340, 280);
	
	
	        getContentPane().add(resArea);
	        resArea.setBounds(20, 330, 450, 200);





	        save.setBackground(new java.awt.Color(255, 0, 0));
	        save.setFont(new java.awt.Font("Arial", 0, 15));
			save.setForeground(new java.awt.Color(255, 255, 255));
	        save.setText("Save");
	        save.addActionListener(new java.awt.event.ActionListener() 
		{
		            public void actionPerformed(java.awt.event.ActionEvent evt) 
			{

		                saveActionPerformed(evt);
				
            			}
        		});

	        getContentPane().add(save);
	        save.setBounds(500, 340, 70, 27);
	       resArea.setVisible(false);
	       save.setVisible(false);
       
	        jPanel1.setVisible(false);
	        setBackground(new java.awt.Color(0, 204, 204));
	
    	}
	//GEN-END:initComponents

	    private void exitActionPerformed(java.awt.event.ActionEvent evt)
		 {
		//GEN-FIRST:event_exitActionPerformed
	
		          System.exit(0);
		    }


	    private void resetActionPerformed(java.awt.event.ActionEvent evt) 
		{
		//GEN-FIRST:event_resetActionPerformed

		        user.setText("");
		        pass.setText("");
		    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt) 
	{
					//System.out.println("foo");
					//InetAddress Address = InetAddress.getLocalHost();	
					//String c =Address.getHostAddress();
					//System.out.println(c);
					String ip="";

						username=user.getText();
                                                passwd=pass.getText();
                                                System.out.println(username);
                                                System.out.println("pass :"+passwd);
                                                if(username.equals(passwd)){
                                                        try{ 
                                                 InetAddress local = InetAddress.getLocalHost();
							ip=(local.getHostAddress()).trim();
                                                 //System.out.println("IP of my system is := "+(local.getHostAddress()).trim());
						System.out.println(ip);
                                                }
                                                catch(UnknownHostException uhEx) { 
			System.out.println( "Could not find local address!"); 
                                                } 
						//String key=(String)JOptionPane.showInputDialog(this,"Enter your Key:");
						
							//getContentPane().remove(jPan);//.visible(false);
							jPan.setVisible(false);
							jPanel1.setVisible(true);
							resArea.setVisible(true);
							save.setVisible(true);
							//StringTokenizer token=new StringTokenizer(ss,";");
							//while(token.hasMoreTokens())
							//{
							//String nextToken = token.nextToken();
                                                        try (BufferedReader br = new BufferedReader(new FileReader("readres.txt"))){
                                                        String line,first="",rest="";
							char ch;
                                                        int i;
                                                    while ((line = br.readLine()) != null) {
                                                         first="";
                                                         rest="";
							for(i=0;i<line.length();i++)
								{ch=line.charAt(i);
								if(ch!=':')
								first+=ch;
								else break;
								}
							for(i=i+1;i<line.length();i++){
							ch=line.charAt(i);
								rest+=ch;
								}
                                                                if(username.equals(rest))
                                                           v.addElement(first);

                                                                }
							listres.setListData(v);	
							
							}catch(Exception e){System.out.println(e);}
                                                
                                                
                                               }
else{
JOptionPane.showMessageDialog(this,"You are an Unauthorised User", "Attempt Failure", JOptionPane.INFORMATION_MESSAGE,image4);
}

    }

	private void uploadActionPerformed(java.awt.event.ActionEvent evt)
	{
Server ser=new Server();
String ip="",line="";
                    Boolean flag=true;
try{ 
                                                 InetAddress local = InetAddress.getLocalHost();
							ip=(local.getHostAddress()).trim();
                                                 //System.out.println("IP of my system is := "+(local.getHostAddress()).trim());
						//System.out.println(ip);
                                                }
                                                catch(UnknownHostException uhEx) { 
			System.out.println( "Could not find local address!"); 
                                                } 
                                        
                                        try (BufferedReader br = new BufferedReader(new FileReader("readip.txt"))){
                                             while ((line = br.readLine()) != null) {
                                                  System.out.println(line);
                                                 if(ip.equals(line)){
                                                     flag=false;
                                                     break;
                                                 }
                                             }
                                        }catch(Exception e){System.out.println(e);}
                                   if(flag)     {


String Fn=(String)JOptionPane.showInputDialog(this,"Enter The new FileName:");


if(Fn==null ||Fn.equals(""))
	{
	op.showConfirmDialog(this,"Enter proper Data Only","Alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
	}
else{
username=user.getText();
try{
BufferedWriter bw = null;
		FileWriter fw = null;
		String data = Fn+":"+username;
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


		System.out.println(Fn+"added");
                }catch(Exception e){System.out.println(e);}
jPan.setVisible(false);
							jPanel1.setVisible(true);
							resArea.setVisible(true);
							save.setVisible(true);
try (BufferedReader br = new BufferedReader(new FileReader("readres.txt"))){
                                                        String lines,first="",rest="";
							char ch;
                                                        int i;
                                                    while ((lines = br.readLine()) != null) {
                                                         first="";
                                                         rest="";
							for(i=0;i<lines.length();i++)
								{ch=lines.charAt(i);
								if(ch!=':')
								first+=ch;
								else break;
								}
							for(i=i+1;i<lines.length();i++){
							ch=lines.charAt(i);
								rest+=ch;
								}
                                                                if(username.equals(rest))
                                                           u.addElement(first);

                                                                }
							listres.setListData(u);
							}catch(Exception e){System.out.println(e);} }


}
                                   else 
JOptionPane.showMessageDialog(this,"Your IP Address is restricted", "Attempt Failure", JOptionPane.INFORMATION_MESSAGE,image4);
}

    private void downloadActionPerformed(java.awt.event.ActionEvent evt) 
		{
		//System.out.println(username);
		//GEN-FIRST:event_downloadActionPerformed
                    String ip="",line="";
                    Boolean flag=true;
                                        try{ 
                                                 InetAddress local = InetAddress.getLocalHost();
							ip=(local.getHostAddress()).trim();
                                                 //System.out.println("IP of my system is := "+(local.getHostAddress()).trim());
						//System.out.println(ip);
                                                }
                                                catch(UnknownHostException uhEx) { 
			System.out.println( "Could not find local address!"); 
                                                } 
                                        
                                        try (BufferedReader br = new BufferedReader(new FileReader("readip.txt"))){
                                             while ((line = br.readLine()) != null) {
                                                  System.out.println(line);
                                                 if(ip.equals(line)){
                                                     flag=false;
                                                     break;
                                                 }
                                             }
                                        }catch(Exception e){System.out.println(e);}
                                   if(flag)     {
	               sss=(String)listres.getSelectedValue();
	               System.out.println(sss);
		//int ch=0;
                
                              try  (Scanner scanner = new Scanner( new File(sss) )){
        String text = scanner.useDelimiter("\\A").next();
                    scanner.close();
			   resArea.setText(text);
}catch(Exception e){System.out.println(e);}
                                   
                                   }
                                   else{
                                       resArea.setText("");
					JOptionPane.showMessageDialog(this,"Your IP Address is restricted", "Attempt Failure", JOptionPane.INFORMATION_MESSAGE,image4);
                                   }
                                   
  		//} catch(Exception e) 
			//{
			// System.out.println(e);      
			//}
        
    }


    private void saveActionPerformed(java.awt.event.ActionEvent evt) 
		{
			//GEN-FIRST:event_saveActionPerformed

String ip="",line="";
                    Boolean flag=true;
                                        try{ 
                                                 InetAddress local = InetAddress.getLocalHost();
							ip=(local.getHostAddress()).trim();
                                                 //System.out.println("IP of my system is := "+(local.getHostAddress()).trim());
						//System.out.println(ip);
                                                }
                                                catch(UnknownHostException uhEx) { 
			System.out.println( "Could not find local address!"); 
                                                } 
                                        
                                        try (BufferedReader br = new BufferedReader(new FileReader("readip.txt"))){
                                             while ((line = br.readLine()) != null) {
                                                  System.out.println(line);
                                                 if(ip.equals(line)){
                                                     flag=false;
                                                     break;
                                                 }
                                             }
                                        }catch(Exception e){System.out.println(e);}
                                   if(flag)     {



		try {
			FileDialog fd=new FileDialog(this,"File Store", FileDialog.SAVE);
			fd.setVisible(true);
			String f= fd.getFile();
			fd.setFile(f); // Filename filter
			fd.setDirectory("."); // Current directory
			//fd.show();
			FileOutputStream out=new FileOutputStream(f);	
			String s=resArea.getText();
			System.out.println(s);
			byte b[]=s.getBytes();
			out.write(b);
		} catch(Exception e)
			{
			System.out.println(e);
			}

}
else JOptionPane.showMessageDialog(this,"Your IP Address is restricted", "Attempt Failure", JOptionPane.INFORMATION_MESSAGE,image4);




    }
    
    /** Exit the Application */

    private void exitForm(java.awt.event.WindowEvent evt)
	 {
	//GEN-FIRST:event_exitForm
	        System.exit(0);
    	}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	JFrame jf1=new Login();
	 jf1.setResizable(false);
	 jf1.setSize(1200,900);
	 jf1.setTitle("Ensuring Data Storage Security in Cloud Computing");
	jf1.show();


    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel5,jLabel6; 
private javax.swing.JLabel jLabel4;   
 private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPan;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JTextField user;
    private javax.swing.JButton download;
    private javax.swing.JLabel jLab;
    private javax.swing.JButton upload;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList listres;
    private java.awt.TextArea resArea;
    private javax.swing.JButton save;

    // End of variables declaration//GEN-END:variables
    
}

