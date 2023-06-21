/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class kar extends javax.swing.JFrame {
int totalsalary,other,totalexp,totalprice,totalincome;
    Connection con= connection.dbcon();
    
    PreparedStatement ps;
    ResultSet rs;
    
    int year;
    
     public void calc(){
        int t1=Integer.parseInt(txtincome.getText());
        int t2=Integer.parseInt(txtexpenses.getText());
        
        int balance=t1-t2;
        
        txtprofit.setText(String.valueOf(balance));
        
    }
     
     
             private void reset(){
               
//           cmbmonth.setSelectedIndex(-1);
               txtincome.setText("");
            txtexpenses.setText("");
         
           txtprofit.setText("");
           
             dtdate.setDate(null);
            
            
            
            
        }
     
     
     //Income calc:
     
   /*     
         public void otherexpenses(){
        try{
            
       
           
         String sql="select sum(digermiktar) from para where ay=?";
         
         ps=con.prepareStatement(sql);
         ps.setString(1,cmbmonth.getSelectedItem().toString());
         
         rs=ps.executeQuery();
         
         while(rs.next()){
             String add=rs.getString(1);
             other=Integer.parseInt(add);
         }
         
          }
        catch(Exception e){
            
        }
        
            finally{
        try{
            ps.close();
            rs.close();
        }
        catch(Exception e){
            
        }
    }
     }
     
     */
     
     public void roomprice(){
        try{
            
       
           
         String sql="select sum(odenen) from gelir where yil=? and ay=?";
         
         ps=con.prepareStatement(sql);
         
          ps.setString(1, String.valueOf(LocalDate.now().getYear()));
         ps.setString(2, LocalDate.now().getMonth().toString());
         rs=ps.executeQuery();
         
         while(rs.next()){
             String add=rs.getString(1);
             totalprice=Integer.parseInt(add);
         }
         totalincome=totalprice;
         txtincome.setText(String.valueOf(totalincome));
          }
        catch(Exception e){
            
        }
         finally{
        try{
            ps.close();
            rs.close();
        }
        catch(Exception e){
            
        }
    }
     
     }
     
  /*   public void income(){
       
         try{
             
         
         totalexp=totalsalary+other;
         txtexpenses.setText(String.valueOf(totalexp));
         
         }
         
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
     }
     */
     //Expenses calc:
     
         public void otherexpenses(){
        try{
            
       
           
         String sql="select sum(miktar) from digergider where yil=? and ay=?";
         
         ps=con.prepareStatement(sql);
         ps.setString(1, String.valueOf(LocalDate.now().getYear()));
         ps.setString(2, LocalDate.now().getMonth().toString());
         
         rs=ps.executeQuery();
         
         while(rs.next()){
             String add=rs.getString(1);
             other=Integer.parseInt(add);
         }
         
          }
        catch(Exception e){
            
        }
        
            finally{
        try{
            ps.close();
            rs.close();
        }
        catch(Exception e){
            
        }
    }
     }
         
     
     public void salary(){
        try{
            
       
           
         String sql="select sum(aldigi) from gider where yil=? and ay=?";
         
         ps=con.prepareStatement(sql);
         
          ps.setString(1, String.valueOf(LocalDate.now().getYear()));
         ps.setString(2, LocalDate.now().getMonth().toString());
         rs=ps.executeQuery();
         
         while(rs.next()){
             String add=rs.getString(1);
             totalsalary=Integer.parseInt(add);
         }
         
          }
        catch(Exception e){
            
        }
         finally{
        try{
            ps.close();
            rs.close();
        }
        catch(Exception e){
            
        }
    }
     
     }
     
     public void expenses(){
       
         try{
             
         
         totalexp=totalsalary+other;
         txtexpenses.setText(String.valueOf(totalexp));
         
         }
         
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
     }
     
    public kar() {
        initComponents();
         Image ikon= Toolkit.getDefaultToolkit().getImage("F://iconss project//hotel-3245949-2737141.png");
       this.setIconImage(ikon);
        btnupdate.setVisible(false);
        
        txtmonth.setText(LocalDate.now().getMonth().toString());
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtincome = new javax.swing.JTextField();
        txtexpenses = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dtdate = new com.toedter.calendar.JDateChooser();
        btnupdate = new javax.swing.JButton();
        txtprofit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtmonth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KAR/KAYIP HESAPLAMA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("TOPLAM GELİRLERİ");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("TOPLAM GİDERLERİ");

        txtincome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtincomeMouseClicked(evt);
            }
        });

        txtexpenses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtexpensesMouseClicked(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(0, 153, 102));
        btnadd.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Kaydedin");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("TARİH");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        btnupdate.setBackground(new java.awt.Color(51, 0, 255));
        btnupdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("GUNCELLEYiN");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        txtprofit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtprofitMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("KAR/KAYIP");

        txtmonth.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("AY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(102, 102, 102)
                                .addComponent(dtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtincome)
                                    .addComponent(txtprofit)
                                    .addComponent(txtexpenses)
                                    .addComponent(txtmonth))))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnupdate)
                        .addGap(95, 95, 95))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtincome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtexpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprofit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8)
                        .addGap(149, 149, 149))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
profitloss pl = new profitloss();
        try{
    String sql="update kar set toplamgeliri=?,toplamgideri=?,kari=? where yil=? and ay=?";
    ps=con.prepareStatement(sql);
    
    ps.setString(1,txtincome.getText());
    ps.setString(2, txtexpenses.getText());
      ps.setString(3, txtprofit.getText());
    ps.setString(4, dtdate.getDate().toString());
    ps.setString(5,String.valueOf(year));
    ps.setString(6, LocalDate.now().getMonth().toString());
    
    
    
   
  
    
    ps.executeUpdate();
    
    JOptionPane.showMessageDialog(null,"Kar/Kayipi başarıyla güncellendi");
    reset();
    
    pl.showprofit();
    this.setVisible(false);
    pl.setVisible(true);
    
    
}
catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage());
}           // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtprofitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtprofitMouseClicked
calc();        // TODO add your handling code here:
    }//GEN-LAST:event_txtprofitMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
this.setVisible(false);
        profitloss pl = new profitloss();
pl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void txtexpensesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtexpensesMouseClicked
 salary();
        otherexpenses();
        expenses();        // TODO add your handling code here:
    }//GEN-LAST:event_txtexpensesMouseClicked

    private void txtincomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtincomeMouseClicked
roomprice();        // TODO add your handling code here:
    }//GEN-LAST:event_txtincomeMouseClicked

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed

        
        try{                                       
            
            
            year = LocalDate.now().getYear();
            
            String sql1="select * from kar where yil=? and ay=?";
            ps=con.prepareStatement(sql1);
            
            ps.setString(1,String.valueOf(LocalDate.now().getYear()));
            ps.setString(2,LocalDate.now().getMonth().toString());
            
            rs=ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Bu ayın karı daha önce kaydedildi");
            }
            else{
                
                
            try{
                
                String sql="insert into kar (yil,ay,toplamgeliri,toplamgideri,kari,tarih) values(?,?,?,?,?,?)";
                ps=con.prepareStatement(sql);
                
                
                ps.setString(1, String.valueOf(year));
                ps.setString(2, LocalDate.now().getMonth().toString());
                ps.setString(3, txtincome.getText());
                ps.setString(4,txtexpenses.getText());
                ps.setString(5, txtprofit.getText());
                  ps.setString(6, dtdate.getDate().toString());
                
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null,LocalDate.now().getMonth().toString()+"'daki kar/kayıpı başarıyla kaydedildi");
                reset();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            
        }}
              
        catch(SQLException ex){
            Logger.getLogger(kar.class.getName()).log(Level.SEVERE,null, ex);
        }

    }//GEN-LAST:event_btnaddActionPerformed

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
            java.util.logging.Logger.getLogger(kar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnadd;
    public javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    public com.toedter.calendar.JDateChooser dtdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtexpenses;
    public javax.swing.JTextField txtincome;
    private javax.swing.JTextField txtmonth;
    public javax.swing.JTextField txtprofit;
    // End of variables declaration//GEN-END:variables
}
