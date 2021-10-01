/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theatrebookingsystem;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author 2018/E/070
 */
public class LoginUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginUI
     */
    public LoginUI() {
        initComponents();
        setSize(300, 370);
        setResizable(false);
        setLocation(575,250);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    String user = "";
    String pass = "";
    static int user_id=0;
    static int role_id = 0;
    static String roles = "";
    static Timestamp loginTime = new Timestamp(System.currentTimeMillis());
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passtext = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 130, 100, 20);
        jLabel1.getAccessibleContext().setAccessibleName("username");

        usertext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(usertext);
        usertext.setBounds(50, 160, 174, 30);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 190, 90, 20);

        passtext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(passtext);
        passtext.setBounds(50, 220, 175, 30);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Sign Up");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(160, 280, 80, 32);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Sign In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 280, 73, 32);

        jLabel5.setFont(new java.awt.Font("Webdings", 0, 84)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 30, 90, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\PROJECT\\TheatreBookingSystem\\ss\\Purple Love.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 300, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Sign in button function
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String username = "root";
       String password = "Lachu123@#";
       String url = "jdbc:mysql://127.0.0.1:3306/theatre_booking";
       user = usertext.getText();
       pass = passtext.getText();
      
       
       try{
               String query2 = "SELECT * FROM roles where role_name=? and role_password=?";
               Connection connect = DriverManager.getConnection(url,username,password);
               PreparedStatement ps1 = connect.prepareStatement(query2); //PS1 PREPARED STATEMENT
               ps1.setString(1,user);
               ps1.setString(2,pass);
               ResultSet rset1 = ps1.executeQuery();
                
               if(rset1.next()){
                 role_id = rset1.getInt("role_id");
                 
              }
               System.out.println("role_id : "+role_id);
              }catch(Exception e){
                  System.out.println("error in role_id");
              }
       
       
       try{
               String query3 = "SELECT * FROM roles where role_name=? and role_id=?";
               Connection connect = DriverManager.getConnection(url,username,password);
               PreparedStatement ps4 = connect.prepareStatement(query3); //PS1 PREPARED STATEMENT
               ps4.setString(1,user);
               ps4.setInt(2,role_id);
               ResultSet rset2 = ps4.executeQuery();
                
               if(rset2.next()){
                 roles = rset2.getString("role_desc");
                 
              }
               System.out.println("role_desc : "+roles);
              }catch(Exception e){
                  System.out.println("error in roles");
              }
       
       
       
       try{
           Connection con = DriverManager.getConnection(url,username,password);
           String str = "select * from user where username=?";
           PreparedStatement psmt = con.prepareStatement(str);
           psmt.setString(1,user);
           
           ResultSet rs = psmt.executeQuery();
           
           if(rs.next()){
               user_id = Integer.parseInt(rs.getString("user_id"));
           }
           System.out.println("user_id "+user_id);
           
       }catch(Exception e){
           e.printStackTrace();
       }
       
       if(user.equals(null)||pass.equals(null)){
             JOptionPane.showMessageDialog(rootPane,"Enter your username and password");
          }
       
         try{
           
           Connection con = DriverManager.getConnection(url,username,password);
           
          String query = "SELECT username , password FROM user where username=? and password=?";
          
          PreparedStatement pstmt = con.prepareStatement(query);
          pstmt.setString(1,user);
          pstmt.setString(2,pass);
          ResultSet rset = pstmt.executeQuery();
          if(rset.next()){
              Timestamp login = new Timestamp(System.currentTimeMillis());
              loginTime = login;
              if(roles.equals("customers")){
              dispose();
              MenuForm menu = new MenuForm();
              menu.jButton5.setEnabled(false);
//              menu.jButton6.setEnabled(false);
              menu.setVisible(true);
              
          }else{
              dispose();
              MenuForm menu1 = new MenuForm();
              menu1.setVisible(true);
              }  
          }else{
              JOptionPane.showMessageDialog(rootPane,"Check your username and password");
          }
           }catch(Exception e){
           e.printStackTrace();
          
       }
           
              
//            
          
          
      
       
        
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        SignupForm sup = new SignupForm();
        sup.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField passtext;
    public static final javax.swing.JTextField usertext = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}




