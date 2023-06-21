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
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class bookroom extends javax.swing.JFrame {

    Connection con = connection.dbcon();
    PreparedStatement ps;
    ResultSet rs;
    
    long price;
    
    
    
    public String gender,type;
    
    
    
        private void reset(){
            txtname.setText("");
            txtid.setText("");
            txtphone.setText("");
            btngroup.setSelected(null, false);
            cmbtype.setSelectedIndex(-1);
            cmbrnum.setSelectedIndex(-1);
            dtcheckin.setDate(null);
             dtcheckout.setDate(null);
             txtprice.setText("");
            
            
            
        }
    
    
    
    private void getPrice(){
     String sql1="select odanum from odalar where odatipi='"+cmbtype.getSelectedItem().toString()+"' and durumu='Bos'";  
        try{
            
  
               
             String sql="select fiyati from odalar where odanum=?";
            ps=con.prepareStatement(sql);
            
       
           ps.setString(1, cmbrnum.getSelectedItem().toString());
            
           rs= ps.executeQuery();
            
            while(rs.next()){
                String add=rs.getString(1);
                 price=Long.parseLong(add);
            }
            
            
            
        }
        catch(Exception e){
            
        }
    }
    
    
   public void calc(){
     try{
   
         
        if((dtcheckin!=null)&&(dtcheckout!=null)){
            Date d1= dtcheckin.getDate();
        
       Date d2= dtcheckout.getDate();
       
       long diffInMillies =Math.abs(d2.getTime()-d1.getTime());
       long diff= TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
       
       long total= price*diff;
     txtprice.setText(String.valueOf(total));
       }
         
        else{
            System.out.println("Dates not chosen");
        }
     }
      
         
     catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
     }
         
   }
    public bookroom() {
        initComponents();
         Image ikon= Toolkit.getDefaultToolkit().getImage("F://iconss project//hotel-3245949-2737141.png");
       this.setIconImage(ikon);
      //  fillcmb();
         btnupdate.setVisible(false);
         
      
    }
    
    
    private void clearcmb(){
           cmbrnum.setSelectedIndex(-1);   
    }

    
    /*
    private void fillcmb(){
       try{
           
  if(cmbtype.getSelectedItem()=="Buyuk aile oda"){
      

        String sql="select odanum from odalar where odatipi='"+String.valueOf(cmbtype.getSelectedItem())+"' and durumu='bos'";
        ps=con.prepareStatement(sql);
       
       
     //  ps.setString(1,cmbtype.getSelectedItem().toString());
     //    ps.setString(2,"bos");
        rs=ps.executeQuery();
        
       while(rs.next()){
           // int roomno=Integer.parseInt(sql);
          String add= rs.getString(1);
            cmbarnum.addItem(add);

      }
       }
  else if(cmbtype.getSelectedItem()=="Tek Yatakli oda"){
            String sql="select odanum from odalar where odatipi='"+String.valueOf(cmbtype.getSelectedItem())+"' and durumu='bos'";
        ps=con.prepareStatement(sql);
       
       
     //  ps.setString(1,cmbtype.getSelectedItem().toString());
     //    ps.setString(2,"bos");
        rs=ps.executeQuery();
        
       while(rs.next()){
           // int roomno=Integer.parseInt(sql);
          String add= rs.getString(1);
            cmb1rnum.addItem(add);

      }
  }
  
    else if(cmbtype.getSelectedItem()=="2 Yatakli oda"){
            String sql="select odanum from odalar where odatipi='"+String.valueOf(cmbtype.getSelectedItem())+"' and durumu='bos'";
        ps=con.prepareStatement(sql);
       
       
     //  ps.setString(1,cmbtype.getSelectedItem().toString());
     //    ps.setString(2,"bos");
        rs=ps.executeQuery();
        
       while(rs.next()){
           // int roomno=Integer.parseInt(sql);
          String add= rs.getString(1);
            cmb2rnum.addItem(add);

      }
       
  }
    else if(cmbtype.getSelectedItem()=="3 Yatakli oda"){
            String sql="select odanum from odalar where odatipi='"+String.valueOf(cmbtype.getSelectedItem())+"' and durumu='bos'";
        ps=con.prepareStatement(sql);
       
       
     //  ps.setString(1,cmbtype.getSelectedItem().toString());
     //    ps.setString(2,"bos");
        rs=ps.executeQuery();
        
       while(rs.next()){
           // int roomno=Integer.parseInt(sql);
          String add= rs.getString(1);
            cmb3rnum.addItem(add);

      }
  }
     //  con.close();
      
        }
       catch(Exception e){
           
       }
    }
    
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btngroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        rdbmale = new javax.swing.JRadioButton();
        rdbfemale = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dtcheckin = new com.toedter.calendar.JDateChooser();
        dtcheckout = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        txtprice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmbtype = new javax.swing.JComboBox();
        cmbrnum = new javax.swing.JComboBox();

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
        jLabel1.setText("REZERVASYON YAPMAK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabel6.setText("ODA TİPİ");

        btnadd.setBackground(new java.awt.Color(0, 153, 102));
        btnadd.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Kaydedin");
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
        jLabel7.setText("GİRİS TARİHİ");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("ODA NUM");

        dtcheckout.setDoubleBuffered(false);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("ÇIKIŞ TARİHİ");

        btnupdate.setBackground(new java.awt.Color(51, 0, 255));
        btnupdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("GUNCELLEYiN");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        txtprice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpriceMouseClicked(evt);
            }
        });
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("TOPLAM FİYATI");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("MÜŞTERİ ADI");

        cmbtype.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buyuk aile oda", "Tek Yatakli oda", "2 Yatakli oda", "3 Yatakli oda" }));
        cmbtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dtcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtprice)
                                                .addComponent(dtcheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(cmbrnum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnadd)
                                .addGap(18, 18, 18)
                                .addComponent(btnupdate)
                                .addGap(11, 11, 11)))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(rdbmale)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdbfemale))
                                .addComponent(txtphone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbtype, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 76, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbmale)
                        .addComponent(rdbfemale))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbtype, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cmbrnum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtcheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void fillcmb(){
        String sql="select odanum from odalar where odatipi='"+cmbtype.getSelectedItem()+"'";
        try {
            ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();
            
            while(rs.next()){
                String add= rs.getString(1);
                cmbrnum.addItem(add);
            }
        } catch (SQLException ex) {
            Logger.getLogger(bookroom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    private void roomupdate(){
         String sql1="select odanum from odalar where odatipi='"+cmbtype.getSelectedItem().toString()+"'";
   
       try { 
          String queryupdate="update odalar set durumu='dolu' where odanum=?";
          ps=con.prepareStatement(queryupdate);
   // if((cmbtype.getSelectedItem()=="Tek Yatakli oda")||(cmbtype.getSelectedItem()=="2 Yatakli oda")){
         
       
       
    
    
      /*   if(null != sql1)
         switch (sql1) {
    
          case "Tek Yatakli oda":
           cmb1rnum.getSelectedItem().toString();
              break;
          case "2 Yatakli oda":
             cmb2rnum.getSelectedItem().toString();
              break;
     
      }
     */
            ps.setString(1,cmbrnum.getSelectedItem().toString() );
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Oda durumu güncellendi");
            
       // }
       } catch (SQLException ex) {
            Logger.getLogger(bookroom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed

         String sql1="select odanum from odalar where odatipi='"+cmbtype.getSelectedItem().toString()+"'";
        try{
    

        
        String sql="insert into musteriler (yil,ay,musteriadi,kimlik,telefon,cinsiyet,odatipi,odanum,giris,cikis,toplamfiyati) values(?,?,?,?,?,?,?,?,?,?,?)";
ps=con.prepareStatement(sql);


ps.setString(1,String.valueOf(LocalDate.now().getYear()));
ps.setString(2,LocalDate.now().getMonth().toString());
ps.setString(3,txtname.getText());
ps.setString(4,txtid.getText());

ps.setString(5,txtphone.getText());
ps.setString(6,gender);
ps.setString(7, cmbtype.getSelectedItem().toString());
ps.setString(8,cmbrnum.getSelectedItem().toString());


SimpleDateFormat dateformats= new SimpleDateFormat("YYYY-MM-DD");
String dps=dateformats.format(this.dtcheckin.getDate());
String dps1=dateformats.format(this.dtcheckout.getDate());

ps.setString(9,dps);
ps.setString(10, dps1);
ps.setString(11,txtprice.getText());


ps.executeUpdate();
roomupdate();
JOptionPane.showMessageDialog(null,"Rezervasyonu başarıyla alindi");
reset();




}

catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}     // TODO add your handling code here:
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
customers csts = new customers();
  String sql1="select odanum from odalar where odatipi='"+cmbtype.getSelectedItem().toString()+"' ";
        try{
    String sql="update musteriler set musteriadi=?,telefon=?,cinsiyet=?,odatipi=?,odanum=?,giris=?,cikis=?,toplamfiyati=? where kimlik=?";
    ps=con.prepareStatement(sql);
    
    ps.setString(1,txtname.getText());
      ps.setString(2, txtphone.getText());
    ps.setString(3, gender);
  
    ps.setString(4, cmbtype.getSelectedItem().toString());
    
   
    
     
 
//int num=Integer.parseInt(sql1);
     ps.setString(5,cmbrnum.getSelectedItem().toString());
    ps.setString(6,dtcheckin.getDate().toString());
    ps.setString(7, dtcheckout.getDate().toString());
    ps.setString(8, txtprice.getText());
        ps.setString(9,txtid.getText());
    
    ps.executeUpdate();
    
    JOptionPane.showMessageDialog(null,"Rezervasyonu başarıyla güncellendi");
    roomupdate();
    reset();
  //  roomupdate();
    
    csts.showcustomers();
    this.setVisible(false);
    csts.setVisible(true);
    
    
}
catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtpriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpriceMouseClicked
 getPrice();
        calc();        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
this.setVisible(false);
        customers cst = new customers();
cst.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void rdbmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbmaleActionPerformed
gender="Erkek";        // TODO add your handling code here:
    }//GEN-LAST:event_rdbmaleActionPerformed

    private void rdbfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbfemaleActionPerformed
gender="Kadın";         // TODO add your handling code here:
    }//GEN-LAST:event_rdbfemaleActionPerformed

    private void cmbtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtypeActionPerformed
fillcmb(); 
clearcmb();
// TODO add your handling code here:
    }//GEN-LAST:event_cmbtypeActionPerformed

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
            java.util.logging.Logger.getLogger(bookroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookroom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnadd;
    public javax.swing.ButtonGroup btngroup;
    public javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JComboBox cmbrnum;
    public javax.swing.JComboBox cmbtype;
    public com.toedter.calendar.JDateChooser dtcheckin;
    public com.toedter.calendar.JDateChooser dtcheckout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JRadioButton rdbfemale;
    private javax.swing.JRadioButton rdbmale;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtname;
    public javax.swing.JTextField txtphone;
    public javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
