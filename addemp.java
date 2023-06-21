/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Hp
 */


public class addemp extends javax.swing.JFrame {

    Connection con=  connection.dbcon();
    PreparedStatement ps;
    ResultSet rs;
    public String gender,weekend;
    
      private ImageIcon format=null;
   String fname=null;
   int s=0;
   byte[] pimage=null;
    
    private void chboxcontrol(){
        if(checkwork.isSelected()){
            checksat.setSelected(true);
            checksun.setSelected(true);
            
        }
     //   else if(!(checksat.isSelected())||!(checksun.isSelected())){
            checkwork.setSelected(false);
       // }
        
        if((checkwork.isSelected())||(checksat.isSelected())||(checksun.isSelected())){
            checknowork.setVisible(false);
        }
        else{
            checknowork.setVisible(true);
        }
        
        if(checknowork.isSelected()){
            checkwork.setVisible(false);  
            checksat.setVisible(false);
            checksun.setVisible(false);
        }
        else{
             checkwork.setVisible(true);  
            checksat.setVisible(true);
            checksun.setVisible(true); 
        }
        
       
    }
    
        public void calcs(){
            try{
                
            
        int t1=Integer.parseInt(txtsalphour.getText());
        int t2=Integer.parseInt(txthours.getText());
        
       if ((checkwork.isSelected())||((checksun.isSelected())&&checksat.isSelected())){
            
       
        int salary=t2*t1*30;
        
        txtsalary.setText(String.valueOf(salary));
         }
       else if((checksat.isSelected())){
                 int salary=t2*t1*26;
        
        txtsalary.setText(String.valueOf(salary));
               }
       
       else if(checksun.isSelected()){
            int salary=t2*t1*26;
        
        txtsalary.setText(String.valueOf(salary));
       }
        else if(checknowork.isSelected()){
            int salary=t2*t1*22;
        
        txtsalary.setText(String.valueOf(salary));
       }
       }
            
            catch(Exception e){
                System.out.println(e.getMessage());
            }
       
       
       
        
    }
        
        
        private void reset(){
            txtname.setText("");
            txtid.setText("");
            txtphone.setText("");
            btngroup.setSelected(null, false);
            txttype.setText("");
            txthours.setText("");
            checkwork.setSelected(false);
            checksat.setSelected(false);
            checksun.setSelected(false);
            checknowork.setSelected(false);
            txtsalphour.setText("");
            dtstart.setDate(null);
             dtend.setDate(null);
             txtsalary.setText("");
            
            
            
        }
        
    public addemp() {
       //  btnupdate.setVisible(false);
        initComponents();
         Image ikon= Toolkit.getDefaultToolkit().getImage("F://iconss project//hotel-3245949-2737141.png");
       this.setIconImage(ikon);
       
       btnupdate.setVisible(false);
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
        btngroup = new javax.swing.ButtonGroup();
        btngroup1 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        cmbtime = new javax.swing.JComboBox();
        btnadd = new javax.swing.JButton();
        rdbmale = new javax.swing.JRadioButton();
        rdbfemale = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dtstart = new com.toedter.calendar.JDateChooser();
        dtend = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        txtsalary = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txthours = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtsalphour = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        checkwork = new javax.swing.JCheckBox();
        checksat = new javax.swing.JCheckBox();
        checksun = new javax.swing.JCheckBox();
        txtname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        checknowork = new javax.swing.JCheckBox();

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
        jLabel1.setText("CALIŞAN KAYDETMEK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("TC/PASPORT NO");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("TELEFON NUM");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("CİNSİYET");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("ÇALIŞMA ZAMANI");

        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });

        cmbtime.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbtime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tam Zamanı/Full-time", "Yarı Zamanı/Part-time" }));

        btnadd.setBackground(new java.awt.Color(0, 153, 102));
        btnadd.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Ekleyin");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btngroup.add(rdbmale);
        rdbmale.setText("Erkek");
        rdbmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbmaleActionPerformed(evt);
            }
        });

        btngroup.add(rdbfemale);
        rdbfemale.setText("Kadın");
        rdbfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbfemaleActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("BAŞLAMA ZAMANI");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("İŞ TİPİ");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("SÖZ.BİTİŞ ZAMANI");

        btnupdate.setBackground(new java.awt.Color(51, 0, 255));
        btnupdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("GUNCELLEYiN");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        txtsalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsalaryMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("AYLIK MAAŞI");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("ÇALIŞMA SAATLERİ");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("SAATLİK MAAŞI");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("HAFTA SONULARI");

        checkwork.setText("ÇALIŞIR");
        checkwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkworkActionPerformed(evt);
            }
        });

        checksat.setText("CUMARTESİ");
        checksat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checksatActionPerformed(evt);
            }
        });

        checksun.setText("PAZAR");
        checksun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checksunActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("ÇALISAN ADI");

        checknowork.setText("ÇALIŞMAZ");
        checknowork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checknoworkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnupdate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(87, 87, 87))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel10))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dtend, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                        .addComponent(dtstart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(txtsalphour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkwork)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checksat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checksun)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checknowork)))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(rdbmale)
                                            .addGap(18, 18, 18)
                                            .addComponent(rdbfemale))
                                        .addComponent(cmbtime, 0, 222, Short.MAX_VALUE)
                                        .addComponent(txtphone)
                                        .addComponent(txtid)
                                        .addComponent(txttype, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtname, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addComponent(txthours, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbmale)
                    .addComponent(rdbfemale)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbtime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txthours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(checkwork)
                            .addComponent(checksat)
                            .addComponent(checksun))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtsalphour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtstart, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtend, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(checknowork, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
try{
    

        
        String sql="insert into calisanlar (calisadi,kimlik,cinsiyeti,telefon,istipi,calismasaat,haftasonu,saatlikmaas,sozbasla,sozbitis,maasi) values(?,?,?,?,?,?,?,?,?,?,?)";
ps=con.prepareStatement(sql);
ps.setString(1,txtname.getText());
ps.setString(2,txtid.getText());
ps.setString(3,gender);
ps.setString(4,txtphone.getText());
ps.setString(5, txttype.getText());
ps.setString(6,txthours.getText());
ps.setString(7, weekend);
ps.setString(8, txtsalphour.getText());

SimpleDateFormat dateformats= new SimpleDateFormat("YYYY-MM-DD");
String dps=dateformats.format(this.dtstart.getDate());
String dps1=dateformats.format(this.dtend.getDate());

ps.setString(9,dps);
ps.setString(10, dps1);
ps.setString(11,txtsalary.getText());



ps.executeUpdate();

JOptionPane.showMessageDialog(null,"Çalışanı başarıyla kaydedildi");

reset();



}

catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
employees emps = new employees();
        try{
    String sql="update calisanlar set calisadi=?,cinsiyeti=?,telefon=?,istipi=?,calismasaat=?,haftasonu=?,saatlikmaas=?,sozbasla=?,sozbitis=?,maasi=? where kimlik=?";
    ps=con.prepareStatement(sql);
    
    ps.setString(1,txtname.getText());
    ps.setString(2, gender);
    ps.setString(3, txtphone.getText());
    ps.setString(4, txttype.getText());
    ps.setString(5, txthours.getText());
    ps.setString(6,weekend);
    ps.setString(7, txtsalphour.getText());
    ps.setString(8, dtstart.getDate().toString());
    ps.setString(9,dtend.getDate().toString());
    ps.setString(10,txtsalary.getText());
        ps.setString(11,txtid.getText());
    
    ps.executeUpdate();
    
    JOptionPane.showMessageDialog(null,"Çalışanı başarıyla güncellendi");
    reset();
    
    emps.showemps();
    this.setVisible(false);
    emps.setVisible(true);
    
    
}
catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage());
}
// TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
this.setVisible(false);
        employees emp = new employees();
emp.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void txtsalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsalaryMouseClicked
calcs();        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalaryMouseClicked

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void rdbmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbmaleActionPerformed
gender="Erkek";        // TODO add your handling code here:
    }//GEN-LAST:event_rdbmaleActionPerformed

    private void rdbfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbfemaleActionPerformed
gender="Kadın";         // TODO add your handling code here:
    }//GEN-LAST:event_rdbfemaleActionPerformed

    private void checkworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkworkActionPerformed
weekend="Çalışır";       

chboxcontrol();// TODO add your handling code here:
    }//GEN-LAST:event_checkworkActionPerformed

    private void checksatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checksatActionPerformed
weekend="Cumartesi";  

chboxcontrol();// TODO add your handling code here:
    }//GEN-LAST:event_checksatActionPerformed

    private void checksunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checksunActionPerformed
weekend="Pazar";  
chboxcontrol();// TODO add your handling code here:
    }//GEN-LAST:event_checksunActionPerformed

    private void checknoworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checknoworkActionPerformed
        weekend="Çalışmaz";

chboxcontrol();
// TODO add your handling code here:
    }//GEN-LAST:event_checknoworkActionPerformed

 
  /*  public ImageIcon resizeImage(String imagePath, byte[] pic){
          
        ImageIcon myImage=null;
        if(imagePath !=null)
        {
        myImage=new ImageIcon(imagePath);
        
        }else{
         myImage=new ImageIcon(pic);
        }
                
        Image img=myImage.getImage();
//        Image img2=img.getScaledInstance(lblimage.getHeight(),    lblimage.getWidth(),  Image.SCALE_SMOOTH);
//        ImageIcon image=new ImageIcon(img2);
        //return image;
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
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addemp().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnadd;
    private javax.swing.ButtonGroup btngroup;
    private javax.swing.ButtonGroup btngroup1;
    public javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup3;
    public javax.swing.JCheckBox checknowork;
    public javax.swing.JCheckBox checksat;
    public javax.swing.JCheckBox checksun;
    public javax.swing.JCheckBox checkwork;
    public javax.swing.JComboBox cmbtime;
    public com.toedter.calendar.JDateChooser dtend;
    public com.toedter.calendar.JDateChooser dtstart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JRadioButton rdbfemale;
    public javax.swing.JRadioButton rdbmale;
    public javax.swing.JTextField txthours;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtname;
    public javax.swing.JTextField txtphone;
    public javax.swing.JTextField txtsalary;
    public javax.swing.JTextField txtsalphour;
    public javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables

    private void ıf(boolean selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}