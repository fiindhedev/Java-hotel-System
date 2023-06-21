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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class empatt extends javax.swing.JFrame {

    Connection con = connection.dbcon();
    
      PreparedStatement ps;
    ResultSet rs;
    int year;
    
    public empatt() {
       //  btnupdate.setVisible(false);
        initComponents();
         Image ikon= Toolkit.getDefaultToolkit().getImage("F://iconss project//hotel-3245949-2737141.png");
       this.setIconImage(ikon);
        btnupdate.setVisible(false);
      //  fillwork();
    }

    
  
    private void calchour(){
 
            try{
             //   SimpleDateFormat dateFormatss = new SimpleDateFormat("yyyy-MM-dd");
               // String dps = dateFormatss.format(this.dtp1.getDate());
                //String dps1 = dateFormatss.format(this.dtp2.getDate());
                String sql ="select calismasaat from calisanlar where kimlik=? ";

                ps=con.prepareStatement(sql);
ps.setString(1,txtid.getText());
//ps.setString(2,String.valueOf(year));
//ps.setString(3,cmbmonth.getSelectedItem().toString())
                rs=ps.executeQuery();
                while(rs.next()){
                    String add1 =rs.getString(1);
                    txthour.setText(add1);

                }
int query= Integer.parseInt(txthour.getText());
int worked=Integer.parseInt(txtworked.getText());

int minus=query-worked;

txtminus.setText(String.valueOf(minus));

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "No Data");
            }
            finally {

                try{

                    rs.close();
                    ps.close();

                }
                catch(Exception e){

                }
            }
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        cmbtime = new javax.swing.JComboBox();
        btnadd = new javax.swing.JButton();
        txtstart = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dtdate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        txtend = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtminus = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtworked = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txthour = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

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
        jLabel1.setText("YOKLAMA KAYDETMEK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("ÇALIŞAN ADI");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("ÇALIŞMA ZAMANI");

        cmbtime.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbtime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tam Zamanı/Full-time", "Yarı Zamanı/Part-time" }));

        btnadd.setBackground(new java.awt.Color(0, 153, 102));
        btnadd.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Kaydedin");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("İŞE GİRİŞ ZAMANI");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("TARİH");

        btnupdate.setBackground(new java.awt.Color(51, 0, 255));
        btnupdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("GUNCELLEYiN");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("ÇIKIŞ ZAMANI");

        txtminus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtminusMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("EKSİK ZAMANI");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("ÇALIŞTIĞI ZAMANI");

        txthour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txthourMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("ÇALIŞMA SAATLERİ");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("TC/PASPORT NO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnupdate))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(229, 229, 229))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(txthour, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(229, 229, 229))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(txtworked, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtminus, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(8, 8, 8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(21, 21, 21)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtstart, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbtime, 0, 225, Short.MAX_VALUE)
                            .addComponent(txtname)
                            .addComponent(dtdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbtime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtstart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtworked, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtminus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
this.setVisible(false);
        empattandance empa = new empattandance();
empa.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
empattandance empsa = new empattandance();
 year = LocalDate.now().getYear();     
try{
    String sql="update calisanyok set yil=? ,ay=?,calisadi=?,caliszamani=?,giris=?,cikis=?,calismasaat=?,calistigi=?,eksik=?,tarih=? where kimlik=?";
    ps=con.prepareStatement(sql);
    
    
    ps.setString(1,String.valueOf(year));
    ps.setString(2,LocalDate.now().getMonth().toString());
    ps.setString(3,txtname.getText());
    ps.setString(4, cmbtime.getSelectedItem().toString());
    ps.setString(5, txtstart.getText());
    ps.setString(6, txtend.getText());
    ps.setString(7, txthour.getText());
    ps.setString(8,txtworked.getText());
    ps.setString(9, txtminus.getText());
    ps.setString(10,dtdate.getDate().toString());
    ps.setString(11,txtid.getText());
    
    ps.executeUpdate();
    
    JOptionPane.showMessageDialog(null,"Çalışan yoklamasi başarıyla güncellendi");
    reset();
    
    empsa.showattandance();
    this.setVisible(false);
    empsa.setVisible(true);
    
    
}
catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void verify(){
      try{
          
     
        
    
        
         }
      catch(Exception e){
          
      }
    }
    
    
           private void reset(){
//           cmbmonth.setSelectedIndex(-1);
               txtid.setText("");
            txtname.setText("");
            cmbtime.setSelectedIndex(-1);
           txtstart.setText("");
            txtend.setText("");
           txthour.setText("");
            txtworked.setText("");
             txtminus.setText("");
             dtdate.setDate(null);
            
            
            
            
        }
    
           private void fillwork(){
        try {
            String sql="select calismasaat from calisanlar where kimlik='"+txtid.getText()+"'";
            ps=con.prepareStatement(sql);
            
            rs= ps.executeQuery();
            
            while(rs.next()){
                String add= rs.getString(1);
                txthour.setText(add);
            }
        } catch (SQLException ex) {
            Logger.getLogger(empatt.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
           
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
year = LocalDate.now().getYear(); 
        try{
            
            String sql1="Select * from calisanlar where kimlik='"+txtid.getText()+"'";
        ps=con.prepareStatement(sql1);
        
        rs=ps.executeQuery();
        
        if(rs.next()){
            
       
        
        String sql="INSERT INTO calisanyok (yil,ay,calisadi,kimlik,caliszamani,giris,cikis,calismasaat,calistigi,eksik,tarih) values(?,?,?,?,?,?,?,?,?,?,?)";
    ps= con.prepareStatement(sql);
   
    ps.setString(1,String.valueOf(year));
    ps.setString(2,LocalDate.now().getMonth() .toString());
    ps.setString(3,txtname.getText());
    ps.setString(4, txtid.getText());
    ps.setString(5,cmbtime.getSelectedItem().toString());
    ps.setString(6, txtstart.getText());
    ps.setString(7,txtend.getText());
    ps.setString(8,txthour.getText());
    ps.setString(9, txtworked.getText());
    ps.setString(10,txtminus.getText());
    
    SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
String dps = dateFormatss.format(this.dtdate.getDate());
ps.setString(11,dps);

    
    if((roles.role.equals("yardimci"))&&(txtid.getText()).equals(roles.id)){
            JOptionPane.showMessageDialog(null,"Kendi yoklamanızı kaydedemezsiniz");
        }
    else if(!(txtid.getText()).equals(roles.id)){
        
    
    ps.executeUpdate();
    JOptionPane.showMessageDialog(null,"Kaydetme Başarılı olmuş");
    reset();
    }

       
         }    
        else{
            JOptionPane.showMessageDialog(null,"Çalışan kayıtlı değil");
        }
    
    
    }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage());
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnaddActionPerformed

    private void txtminusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtminusMouseClicked
calchour();        // TODO add your handling code here:
    }//GEN-LAST:event_txtminusMouseClicked

    private void txthourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txthourMouseClicked
fillwork();      // TODO add your handling code here:
    }//GEN-LAST:event_txthourMouseClicked

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
            java.util.logging.Logger.getLogger(empatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new empatt().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnadd;
    public javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox cmbtime;
    public com.toedter.calendar.JDateChooser dtdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtend;
    public javax.swing.JTextField txthour;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtminus;
    public javax.swing.JTextField txtname;
    public javax.swing.JTextField txtstart;
    public javax.swing.JTextField txtworked;
    // End of variables declaration//GEN-END:variables
}
