/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theatrebookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 2018/E/070
 */

public class SignupForm extends javax.swing.JFrame {

    /**
     * Creates new form SignupForm
     */
    public SignupForm() {
        initComponents();
        setSize(500,470);
        setLocation(450,150);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emailtext = new javax.swing.JTextField();
        addresstext = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passtext = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        usertext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        phonetext = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("frame");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Email : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 240, 90, 21);

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Username : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 80, 110, 21);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Address : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 190, 110, 21);

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 300, 100, 21);

        emailtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailtext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(emailtext);
        emailtext.setBounds(130, 240, 250, 30);

        addresstext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addresstext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(addresstext);
        addresstext.setBounds(130, 186, 330, 30);

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Sex : ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(300, 140, 60, 20);

        passtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passtext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(passtext);
        passtext.setBounds(130, 300, 153, 26);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(350, 140, 80, 21);

        usertext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usertext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(usertext);
        usertext.setBounds(130, 80, 153, 26);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 360, 90, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Application Form");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 20, 390, 40);

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Phone No :  ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 140, 110, 21);

        phonetext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phonetext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(phonetext);
        phonetext.setBounds(130, 140, 156, 26);
        phonetext.getAccessibleContext().setAccessibleName("");

        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\PROJECT\\TheatreBookingSystem\\ss\\Mirage.jpg")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 500, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //connect to sql database
        String username = "root";
         String password = "Lachu123@#";
         String url = "jdbc:mysql://127.0.0.1:3306/theatre_booking";
         
         if(passtext.getText().equals(null)||emailtext.getText().equals(null)||usertext.getText().length()==0){
             JOptionPane.showMessageDialog(rootPane,"fill all the blanks ");
         }else{
             try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection = DriverManager.getConnection(url,username,password);
             
             Statement stmt = connection.createStatement();
             String query = "INSERT INTO user (username,sex,email,address,phone,password) VALUES(?,?,?,?,?,?)";
             
             PreparedStatement pstmt = connection.prepareStatement(query);
             pstmt.setString(1, usertext.getText());
             pstmt.setString(2, jComboBox1.getSelectedItem().toString());
             pstmt.setString(3,emailtext.getText());
             pstmt.setString(4, addresstext.getText());
             pstmt.setString(5, phonetext.getText());
             pstmt.setString(6, passtext.getText());
             
             pstmt.executeUpdate();
             
             //getting user_id for update role column
             String query2 = "select * from user where username=?";
             PreparedStatement psmt2 = connection.prepareStatement(query2);
             psmt2.setString(1,usertext.getText());
             ResultSet re = psmt2.executeQuery();
             
             int user_id = 0;
             
             if(re.next()){
                 user_id = Integer.parseInt(re.getString("user_id"));
                 System.out.println("user_id retreived : "+user_id);
             }
             
             String query1 = "INSERT INTO roles (role_name,role_password) VALUES(?,?)";
             PreparedStatement psmt1 = connection.prepareStatement(query1);
             psmt1.setString(1, usertext.getText());
             psmt1.setString(2, passtext.getText());
             
             
             psmt1.executeUpdate();
             
             
             
             connection.close();
             
             JOptionPane.showMessageDialog(rootPane, "Successfully created :)");
             
             dispose();
             LoginUI l = new LoginUI();
             l.setVisible(true);
             
             
             
         }catch(Exception e){
             e.printStackTrace();
         }
         }
         
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstext;
    private javax.swing.JTextField emailtext;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField passtext;
    private javax.swing.JTextField phonetext;
    private javax.swing.JTextField usertext;
    // End of variables declaration//GEN-END:variables
}