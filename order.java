/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import javax.swing.*;
import java.sql.*;
public class order extends javax.swing.JFrame {
String i1,i2,i3,i4,i5,i6,p1="",p2="",p3="",p4="",p5="";
public static String x;
    /**
     * Creates new form order
     */
    public order() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Order Form", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 24), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Name :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 67, 79, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Address :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 129, 79, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mobile no. :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(87, 247, 82, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("City :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 187, 70, 30);

        t1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(t1);
        t1.setBounds(197, 69, 270, 30);

        t2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2);
        t2.setBounds(197, 129, 270, 30);

        t3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3);
        t3.setBounds(197, 189, 270, 30);

        t4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(t4);
        t4.setBounds(197, 249, 270, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Date :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 307, 70, 31);

        t5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        t5.setToolTipText("");
        jPanel1.add(t5);
        t5.setBounds(197, 308, 270, 31);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("I:\\Save.png")); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(80, 440, 100, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("I:\\retrieve.png")); // NOI18N
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(420, 440, 100, 30);

        jLabel6.setText("e.g.24-03-2018");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(477, 308, 110, 32);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Car :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 371, 70, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(197, 371, 270, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("I:\\bill.png")); // NOI18N
        jButton3.setText("Bill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(250, 440, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                i1=t1.getText();
                p1=i1;
                i2=t2.getText();
                p2=i2;
                i3=t3.getText();
                p3=i3;
                i4=t4.getText();
                p4=i4;
                i5=t5.getText();
                p5=i5;
                i6=jLabel8.getText();
                    if(i1.equals("") || i2.equals("") || i3.equals("") || i4.equals("") || i5.equals(""))
                    {
                        JOptionPane.showMessageDialog(rootPane,"Fields are Empty!!"); 
                    }
                    else
                    {
                   
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sys");
Statement stmt=con.createStatement();
stmt.executeUpdate("insert into  orders values('"+i1+"','"+i2+"','"+i3+"','"+i4+"','"+i5+"','"+i6+"')");
System.out.println("value inserted");
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
                    JOptionPane.showMessageDialog(rootPane,"Your Order Is Successfully Placed");
                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);
                    t4.setText(null);
                    t5.setText(null);
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Firstpage().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        /*String p1=t1.getText();
        String p2=t2.getText();
        String p3=t3.getText();
        String p4=t4.getText();
        String p5=t5.getText();
        String p6=order.jLabel8.getText();*/
        if(p1.equals("") || p2.equals("") || p3.equals("") || p4.equals("") || p5.equals(""))
                    {
                        JOptionPane.showMessageDialog(rootPane,"Fields are Empty!!"); 
                    }
        else
        {
        x=jLabel8.getText();
        this.setVisible(false);
        new bill().setVisible(true);
        bill.jLabel8.setText(i1);
        bill.jLabel9.setText(i2);
        bill.jLabel10.setText(i4);
        bill.jLabel11.setText(i3);
        bill.jLabel12.setText(i5);
        bill.jLabel13.setText(i6);
        System.out.println(Secondpage7.str);
        if(Secondpage.str=="BMW i8")
     {
          bill.jLabel14.setText("Rs 2.62Cr");
     }
        if(Secondpage.str=="BMW Z4")
     {
          bill.jLabel14.setText("Rs 82.00lakh");
     }
        if(Secondpage.str=="BMW X5")
     {
          bill.jLabel14.setText("Rs 75.80lakh");
     }
        if(Secondpage.str=="BMW 3")
     {
          bill.jLabel14.setText("Rs 45.30lakh");
     }
        if(Secondpage1.str=="Audi a8")
     {
          bill.jLabel14.setText("Rs 5.7Cr");
     }
        if(Secondpage1.str=="Audi Q7")
     {
          bill.jLabel14.setText("Rs 75.60lakh");
     }
        if(Secondpage1.str=="Audi S5")
     {
          bill.jLabel14.setText("Rs 70.60lakh");
     }
        if(Secondpage1.str=="Audi RS6")
     {
          bill.jLabel14.setText("Rs 1.59Cr");
     }
        if(Secondpage2.str=="Mercedes Benz A class")
     {
          bill.jLabel14.setText("Rs 29.80lakh");
     }
        if(Secondpage2.str=="Mercedes Benz S class")
     {
          bill.jLabel14.setText("Rs 1.94Cr");
     }
        if(Secondpage2.str=="Mercedes Benz E class")
     {
          bill.jLabel14.setText("Rs 55.00lakh");
     }
        if(Secondpage2.str=="Mercedes Benz SLC class")
     {
          bill.jLabel14.setText("Rs 79.80lakh");
     }
        if(Secondpage3.str=="Jaguar XJ")
     {
          bill.jLabel14.setText("Rs 1.00Cr");
     }
        if(Secondpage3.str=="Jaguar XF")
     {
          bill.jLabel14.setText("Rs 68.80lakh");
     }
        if(Secondpage3.str=="Jaguar F Type")
     {
          bill.jLabel14.setText("Rs 2.50Cr");
     }
        if(Secondpage3.str=="Jaguar XE")
     {
          bill.jLabel14.setText("Rs 45.60lakh");
     }
        if(Secondpage4.str=="Honda Accord")
     {
          bill.jLabel14.setText("Rs 35.80lakh");
     }
        if(Secondpage4.str=="Honda Amaze")
     {
          bill.jLabel14.setText("Rs 8.00lakh");
     }
        if(Secondpage4.str=="HondaCity")
     {
          bill.jLabel14.setText("Rs 12.65lakh");
     }
        if(Secondpage4.str=="Honda WRV")
     {
          bill.jLabel14.setText("Rs 9.50lakh");
     }
        if(Secondpage5.str=="Hyundai Creta")
     {
          bill.jLabel14.setText("Rs 13.80lakh");
     }
        if(Secondpage5.str=="Hyundai Verna")
     {
          bill.jLabel14.setText("Rs 11.90lakh");
     }
        if(Secondpage5.str=="Hyundai Elantra")
     {
          bill.jLabel14.setText("Rs 17.70lakh");
     }
        if(Secondpage5.str=="Hyundai i20")
     {
          bill.jLabel14.setText("Rs 8.60lakh");
     }
        if(Secondpage6.str=="Maruti Suzuki Ciaz")
     {
          bill.jLabel14.setText("Rs 8.04lakh");
     }
        if(Secondpage6.str=="Maruti Suzuki Ertiga")
     {
          bill.jLabel14.setText("Rs 9.80lakh");
     }
        if(Secondpage6.str=="Maruti Suzuki Swift Dzire")
     {
          bill.jLabel14.setText("Rs 8.80lakh");
     }
        if(Secondpage6.str=="Maruti Suzuki Vitara Breeza")
     {
          bill.jLabel14.setText("Rs 9.80lakh");
     }
        if(Secondpage7.str=="Mahindra Bolero")
     {
          bill.jLabel14.setText("Rs 8.90lakh");
     }
        if(Secondpage7.str=="Mahindra Scorpio")
     {
          bill.jLabel14.setText("Rs 15.30lakh");
     }
        if(Secondpage7.str=="Mahindra Thar")
     {
          bill.jLabel14.setText("Rs 7.80lakh");
     }
        if(Secondpage7.str=="Mahindra XUV500")
     {
          bill.jLabel14.setText("Rs 16.80lakh");
     }   
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
    }

