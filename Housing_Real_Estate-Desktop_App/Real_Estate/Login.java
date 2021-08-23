/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real_Estate;

import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sangramjithazarika
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Connection con = null;
    public Login() {
        initComponents();
         JLabel background;
        setSize(1025,700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("C:\\Users\\dell\\Downloads\\SignUp_Background_Img.jpeg");
        
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1025,700);
        add(background);
        setVisible(true);
        btnOTP.setVisible(false);
        btnS.setVisible(false);
        lblOTP.setVisible(false);
        txtOTP.setVisible(false);
        con=(Connection) DB.dbconnect();
    }

    String gp=null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtU = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtP = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnL = new javax.swing.JButton();
        txtOTP = new javax.swing.JTextField();
        btnOTP = new javax.swing.JButton();
        lblOTP = new javax.swing.JLabel();
        btnFP = new javax.swing.JButton();
        btnS = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setOpaque(false);

        jPanel5.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Enter Username");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Enter Password");

        jLabel3.setBackground(new java.awt.Color(102, 102, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 25)); // NOI18N
        jLabel3.setText("Login Form");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(207, 207, 207)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtU)
                    .addComponent(txtP, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(337, 337, 337))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPanel4.setOpaque(false);

        jPanel1.setOpaque(false);

        btnL.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnL.setText("Login");
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });

        txtOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOTPActionPerformed(evt);
            }
        });

        btnOTP.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnOTP.setText("Send OTP");
        btnOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOTPActionPerformed(evt);
            }
        });

        lblOTP.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblOTP.setForeground(new java.awt.Color(255, 255, 255));
        lblOTP.setText("Enter OTP");

        btnFP.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnFP.setText("Forget Password");
        btnFP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFPMouseClicked(evt);
            }
        });
        btnFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFPActionPerformed(evt);
            }
        });

        btnS.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnS.setText("Submit");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnOTP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOTP)
                        .addGap(36, 36, 36)
                        .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnFP))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnS)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnL)
                .addGap(18, 18, 18)
                .addComponent(btnFP)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOTP))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOTP))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOTPActionPerformed
        Random random = new Random();
        String generatePin = String.format("%04d", random.nextInt(100000));
        gp = generatePin;
        String email = null;
        try
        {
            String user = txtU.getText();
            if(user.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fields can't be empty"); 
                return;
            }
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("Select * from user_info where  Username=?");
            pst.setString(1, user);
            ResultSet r = pst.executeQuery(); 
            if(r.next()) //Result set value if true
            {
                email = r.getString("Email");
                System.out.println(email);
                JOptionPane.showMessageDialog(null, "OTP has been sent to your registered email id.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sorry, you are not a registered user. Please create an account first.");
            }
        }
        catch(Exception e1) {
            e1.printStackTrace();
        }
        if(email!=null) {
            String ToEmail = email;
            String FromEmail = "sangramoosd123@gmail.com";
            String FromEmailPassword = "Sangram24";//Your EmailPassword
            String Subject = "OTP Sent";

            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");

            Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
               protected PasswordAuthentication getPasswordAuthentication() {
                   return new PasswordAuthentication(FromEmail,FromEmailPassword);
               }
            });

            try {
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(FromEmail));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
                message.setSubject(Subject);
                message.setText("Your OTP is: " + generatePin);
                Transport.send(message);

            }catch(Exception ex) {
                System.out.println("" + ex);
            }
        }
        
        
    }//GEN-LAST:event_btnOTPActionPerformed

    private void btnFPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFPMouseClicked

    private void btnFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFPActionPerformed
        btnOTP.setVisible(true);
        btnS.setVisible(true);
        lblOTP.setVisible(true);
        txtOTP.setVisible(true);
    }//GEN-LAST:event_btnFPActionPerformed

    private void txtOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOTPActionPerformed
        
    }//GEN-LAST:event_txtOTPActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        String temp = txtOTP.getText();
        String user_id = txtU.getText();
        if(gp!=null) {
            if(temp.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter the OTP sent in the registered Email Id!!!");
            }
            else if(temp.compareTo(gp)==0)
            {
                new LoginFrame(user_id).setVisible(true);
                this.setVisible(false);
            }
            else if(temp.compareTo(gp)!=0)
            {
                JOptionPane.showMessageDialog(null, "Sorry, OTP entered is incorrect!!!");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter the OTP sent in the registered Email Id!!!");
        }
    }//GEN-LAST:event_btnSActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        try
        {
            String user = txtU.getText();
            String pwd = String.valueOf(txtP.getPassword()); //Converts a password into string
            System.out.println(pwd);
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("Select * from user_info where  Username=? and Password=?");
            System.out.println(pwd);
            pst.setString(1, user);
            pst.setString(2, pwd);
            ResultSet r = pst.executeQuery();
            boolean res= r.next();
            //System.out.println(r.getString("F_Name"));
            if(user.equals("") && pwd.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fields can't be empty"); 
                return;                
            }
           /* if(pwd==r.getString("Password"))
            {
                JOptionPane.showMessageDialog(null, "Wrong Password"); 
                return;                
            }*/
            if(res==true) //Result set value if true
            {
                //Home h = new Home(r.getString("F_Name"), r.getString("L_Name"));
                Home_after_login HAL=new Home_after_login(user);
                HAL.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect id or password.");
            }
            dispose();
        }
        catch(Exception e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_btnLActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFP;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnOTP;
    private javax.swing.JButton btnS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblOTP;
    private javax.swing.JTextField txtOTP;
    private javax.swing.JPasswordField txtP;
    private javax.swing.JTextField txtU;
    // End of variables declaration//GEN-END:variables
}
