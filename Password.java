
import javax.swing.*;
import java.sql.*;
import java.net.*;
public class Password extends javax.swing.JFrame {
String r1,r2;
    /**
     * Creates new form Password
     */
    public Password() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 540));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Entered Registered Mobile Number");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 130, 270, 45);

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1);
        t1.setBounds(110, 210, 350, 54);

        jButton1.setIcon(new javax.swing.ImageIcon("I:\\signin.png")); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 330, 111, 39);

        jButton2.setIcon(new javax.swing.ImageIcon("I:\\back.png")); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(220, 390, 111, 38);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new login1().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                String str=t1.getText();
                int flag=0;
                try
                {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sys");
                    Statement stmt=con.createStatement();
                    ResultSet rst=stmt.executeQuery("select * from project");
                    
                         while(rst.next())
                         {
                               r1=rst.getString("mobile");
                               r2=rst.getString("password");
                 if((str.equals(r1)))
                {
                    
                     /*String fn=JOptionPane.showInputDialog("Enter new password");
                     System.out.println(fn);
                     PreparedStatement ps=con.prepareStatement("update project set password=? where mobile=?");
                     ps.setString(1, fn);
                     ps.setString(2, str);
                     ps.executeUpdate();
                     this.setVisible(false);
                     new login1().setVisible(true);
                     t1.setText(null);*/
                    try {
String apikey = "i8QIT8pGd0eHqnlZBEnZNw";
String senderid = "TESTIN";
String channel = "2";
String DCS = "0";
String flashsms = "0";
String mobile = "91"+r1;
String message = "Your Password is\n"+r2;
String route = "13";
 
String requestUrl = "https://www.smsgatewayhub.com/api/mt/SendSMS?" +
"APIKey=" + URLEncoder.encode(apikey, "UTF-8") +
"&senderid=" + URLEncoder.encode(senderid, "UTF-8") +
"&channel=" + URLEncoder.encode(channel, "UTF-8") +
"&DCS=" + URLEncoder.encode(DCS, "UTF-8") +
"&flashsms=" + URLEncoder.encode(flashsms, "UTF-8") +
"&number=" + URLEncoder.encode(mobile, "UTF-8") +
"&text=" + URLEncoder.encode(message, "UTF-8") +
"&route=" + URLEncoder.encode(route, "UTF-8");
 
 
 
URL url = new URL(requestUrl);
HttpURLConnection uc = (HttpURLConnection)url.openConnection();
 
System.out.println(uc.getResponseMessage());
 JOptionPane.showMessageDialog(rootPane,"Your password has been sent!!");
  t1.setText(null);
uc.disconnect();
 
} catch(Exception ex) {
System.out.println(ex.getMessage());
 
}
                     flag=1;
                }
                         }
                 if(str.equals(""))
                {
                    JOptionPane.showMessageDialog(rootPane,"Field is empty!!");
                    t1.setText(null);
                }
                 else if(flag==0)
                {
                    JOptionPane.showMessageDialog(rootPane,"Invalid Mobile Number!!");
                    t1.setText(null);  
                }    
                    con.close();
                }
                catch(ClassNotFoundException ex)
                {
                  System.out.println(ex);
                }
                catch(SQLException ex)
                {
                  System.out.println(ex);
                }
                catch(NullPointerException ex)
                {
                  System.out.println(ex);
                }
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

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
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
