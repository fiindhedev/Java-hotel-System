/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hp
 */
public class EmpSearch extends javax.swing.JFrame {
Connection con= connection.dbcon();
PreparedStatement ps;
ResultSet rs;
   
    
    public EmpSearch() {
        initComponents();
         Image ikon= Toolkit.getDefaultToolkit().getImage("F://iconss project//hotel-3245949-2737141.png");
       this.setIconImage(ikon);
   //    formWindowClosed(java.awt.event.ActionEvent evt);
        
        this.setSize(700,200);
        
      /*  txtpid.setVisible(false);
        txtaid.setVisible(false);
        txtsid.setVisible(false);
        
        btnpsearch.setVisible(false);
        btnasearch.setVisible(false);
        btnmsearch.setVisible(false);
        
        cmbmonth.setVisible(false);
        cmbsmonth.setVisible(false);
        */
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnattandance = new javax.swing.JButton();
        btnpreson = new javax.swing.JButton();
        btnsalary = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnattandance1 = new javax.swing.JButton();
        btnpreson1 = new javax.swing.JButton();
        btnsalary1 = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(692, 292));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ÇALIŞAN İÇİN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(248, 248, 248))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnattandance.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnattandance.setText("Yoklama Bilginizi Arayın");
        btnattandance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnattandanceActionPerformed(evt);
            }
        });

        btnpreson.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnpreson.setText("Şahıs Bilginizi Arayın");
        btnpreson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpresonActionPerformed(evt);
            }
        });

        btnsalary.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnsalary.setText("Maaş Bilginizi iArayın");
        btnsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnpreson, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnattandance)
                .addGap(10, 10, 10)
                .addComponent(btnsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnpreson, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnattandance, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.add(jPanel1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 200, 200));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(692, 292));

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ÇALIŞAN İÇİN");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(248, 248, 248))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnattandance1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnattandance1.setText("Yoklama Bilginizi Arayın");
        btnattandance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnattandance1ActionPerformed(evt);
            }
        });

        btnpreson1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnpreson1.setText("Şahıs Bilginizi Arayın");
        btnpreson1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreson1ActionPerformed(evt);
            }
        });

        btnsalary1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnsalary1.setText("Maaş Bilginizi iArayın");
        btnsalary1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalary1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnpreson1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnattandance1)
                .addGap(10, 10, 10)
                .addComponent(btnsalary1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnpreson1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnattandance1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalary1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnpresonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpresonActionPerformed

        employee e= new employee();
       e.setVisible(true);
       
       
        /*        btnasearch.setVisible(false);
        btnmsearch.setVisible(false);
        
        cmbmonth.setVisible(false);
        cmbsmonth.setVisible(false);
        
            txtaid.setVisible(false);
        txtsid.setVisible(false);
        
        
        txtpid.setVisible(true);
       btnpsearch.setVisible(true);
        this.setSize(700,250);
        */
    }//GEN-LAST:event_btnpresonActionPerformed

    private void btnattandanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnattandanceActionPerformed

         employeeatt ea= new employeeatt();
       ea.setVisible(true);
        /*  txtpid.setVisible(false);
   btnpsearch.setVisible(false);
   
    cmbsmonth.setVisible(false);
    btnmsearch.setVisible(false);
    
    
   
        
        txtaid.setVisible(true);
       btnasearch.setVisible(true);   
       cmbmonth.setVisible(true);
 this.setSize(700,300);
*/
// TODO add your handling code here:
    }//GEN-LAST:event_btnattandanceActionPerformed

    private void btnsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalaryActionPerformed

         empsalary es= new empsalary();
       es.setVisible(true);
       
        /* txtpid.setVisible(false);
        txtaid.setVisible(false);
        
                btnpsearch.setVisible(false);
        btnasearch.setVisible(false);
        
         cmbmonth.setVisible(false);
        
        txtsid.setVisible(true);
       btnmsearch.setVisible(true);   
       cmbsmonth.setVisible(true);  
 this.setSize(700,300);       
        
        */
// TODO add your handling code here:
    }//GEN-LAST:event_btnsalaryActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
   
        if(roles.role.equals("kullanici")){
        this.setVisible(false);
        login lg = new login();
lg.setVisible(true);   
        }
        
        else{
            this.setVisible(false);
         
        }
    }//GEN-LAST:event_formWindowClosed

    private void btnattandance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnattandance1ActionPerformed

        employeeatt empat = new employeeatt();
empat.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnattandance1ActionPerformed

    private void btnpreson1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreson1ActionPerformed

        employee emp = new employee();
emp.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnpreson1ActionPerformed

    private void btnsalary1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalary1ActionPerformed

        empsalary emps = new empsalary();
emps.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalary1ActionPerformed

    
  
    
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
            java.util.logging.Logger.getLogger(EmpSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnattandance;
    private javax.swing.JButton btnattandance1;
    private javax.swing.JButton btnpreson;
    private javax.swing.JButton btnpreson1;
    private javax.swing.JButton btnsalary;
    private javax.swing.JButton btnsalary1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}