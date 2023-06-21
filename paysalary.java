/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
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
 
public class paysalary extends javax.swing.JFrame {

     Connection con = connection.dbcon();
    
      PreparedStatement ps;
    ResultSet rs;
    
    int eksik,saatlik,hak,aylik,year,balance;
    public void calc(){
        int t1=Integer.parseInt(txtsalary.getText());
        int t2=Integer.parseInt(txtgot.getText());
        
        int balance=t1-t2;
        
        txtbalance.setText(String.valueOf(balance));
        
    }
    
    
      private void calcBalance(){
        int got= Integer.parseInt(txtgot.getText());
        int sal= Integer.parseInt(txtdes.getText());
        
        int balance=sal-got;
        
        txtbalance.setText(String.valueOf(balance));
    }
    
    private void calcltime(){
    try{
        
   
        String sql="Select sum(calistigi) from calisanyok where yil=? and ay=? and kimlik=?";
        ps=con.prepareStatement(sql);
        
           ps.setString(1,String.valueOf(LocalDate.now().getYear()));
        ps.setString(2,LocalDate.now().getMonth().toString());
        ps.setString(3, txtid.getText());
        rs=ps.executeQuery();
        while(rs.next()){
            String add=rs.getString(1);
            txttotal.setText(add);
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
    
    private void updatesalary(){
    
        
        try {
             String sql="update gider set maaskalan=maaskalan-? where yil=? and ay=? and kimlik=?";
             ps=con.prepareStatement(sql);
             
             ps.setString(1, txtgot.getText());
             ps.setString(2, String.valueOf(LocalDate.now().getYear()));
             ps.setString(3, LocalDate.now().getMonth().toString());
             ps.setString(4, txtid.getText());
             
             
             ps.executeUpdate();
             
         } catch (SQLException ex) {
             Logger.getLogger(paysalary.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    private void updateexpense(){
         try {
             String sql="update kar set toplamgideri=toplamgideri+? where yil=? and ay=?";
             ps=con.prepareStatement(sql);
             
             ps.setString(1, txtgot.getText());
             ps.setString(2, String.valueOf(LocalDate.now().getYear()));
             ps.setString(3, LocalDate.now().getMonth().toString());
             
             ps.executeUpdate();
             
         } catch (SQLException ex) {
             Logger.getLogger(paysalary.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    
        private void calclsal(){
    try{
        
   
        String sql="Select sum(eksik) from calisanyok where ay=? and calisadi=?";
     //   String sql1="Select saatlikmaas from calisanlar where calisadi=?";
         String sql2="Select maasi from calisanlar where calisadi=?";
        ps=con.prepareStatement(sql);
       //  ps=con.prepareStatement(sql1);
          ps=con.prepareStatement(sql2);
        ps.setString(1,LocalDate.now().getMonth().toString());
        ps.setString(2, txtname.getText());
           ps.setString(3, txtname.getText());
          // ps.setString(4, txtname.getText());
        
           
        /*      
            int eksik=Integer.parseInt(sql);
             int saatlik=Integer.parseInt(sql1);
             int aylik=Integer.parseInt(sql2);
             int hak=aylik-(eksik*saatlik);
             
            // String add2=rs.getString(1);
            txtdes.setText(String.valueOf(hak));
           */
           
           rs=ps.executeQuery();
        
        
        
        while(rs.next()){
            String add=rs.getString(1);
            txttotal.setText(add);
            
            String add1=rs.getString(3);
            txtsalary.setText(add1);
         
             
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
     
    
        
        
     private void bringsal(){
    try{
        
   
      
    
         String sql="Select maasi from calisanlar where kimlik=?";
        ps=con.prepareStatement(sql);
    
     
        ps.setString(1, txtid.getText());
  
          // ps.setString(4, txtname.getText());
        
           
        /*      
            int eksik=Integer.parseInt(sql);
             int saatlik=Integer.parseInt(sql1);
             int aylik=Integer.parseInt(sql2);
             int hak=aylik-(eksik*saatlik);
             
            // String add2=rs.getString(1);
            txtdes.setText(String.valueOf(hak));
           */
           
           rs=ps.executeQuery();
        
        
        
        while(rs.next()){
            String add=rs.getString(1);
            txtsalary.setText(add);
            
         //   String add1=rs.getString(3);
           // txtsalary.setText(add1);
         
             
        }
        
        aylik=Integer.parseInt(txtsalary.getText());
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
     
     
     
          private void calcmin(){
    try{
        
   
      
    
         String sql="Select sum(eksik) from calisanyok where kimlik=? and yil=? and ay=?";
        ps=con.prepareStatement(sql);
    
     
        ps.setString(1, txtid.getText());
             ps.setString(2, String.valueOf(LocalDate.now().getYear()));
                  ps.setString(3, LocalDate.now().getMonth().toString());
             
 
          // ps.setString(4, txtname.getText());
        
           
         
           
       
             
            // String add2=rs.getString(1);
           
       
           
           rs=ps.executeQuery();
        
           //  
             
             
        
        
       while(rs.next()){
            String add=rs.getString(1);
            eksik=Integer.parseInt(add);
            
         //   String add1=rs.getString(3);
           // txtsalary.setText(add1);
         
             
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
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
     
     
         
     private void bringsaatlik(){
    try{
        
   
      
    
         String sql="Select saatlikmaas from calisanlar where kimlik=?";
        ps=con.prepareStatement(sql);
    
     
        ps.setString(1, txtid.getText());
 
          // ps.setString(4, txtname.getText());
        
           
         
           
       
             
            // String add2=rs.getString(1);
         //   txtdes.setText(String.valueOf(hak));
       
           
           rs=ps.executeQuery();
        
           while(rs.next()){
            String add=rs.getString(1);
            saatlik=Integer.parseInt(add);
            
         //   String add1=rs.getString(3);
           // txtsalary.setText(add1);
         
             
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
     
     
            
     private void calcdes(){
    try{
        aylik=Integer.parseInt(txtsalary.getText());
   hak=aylik-(eksik*saatlik);
   
   txtdes.setText(String.valueOf(hak));
           
           
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
     
 
     
     
             private void reset(){
         
              
            txtname.setText("");
             txtid.setText("");
            txtphone.setText("");
//              cmbmonth.setSelectedIndex(-1);
           txttotal.setText("");
            txtsalary.setText("");
           txtdes.setText("");
            txtgot.setText("");
             txtbalance.setText("");
             dtdate.setDate(null);
            
            
            
            
        }
     
     
    public paysalary() {
        initComponents();
         Image ikon= Toolkit.getDefaultToolkit().getImage("F://iconss project//hotel-3245949-2737141.png");
       this.setIconImage(ikon);
        btnupdate.setVisible(false);
        if(roles.role.equals("yardimci")){
            btngo.setVisible(false);
        }
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
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtgot = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dtdate = new com.toedter.calendar.JDateChooser();
        btnupdate = new javax.swing.JButton();
        txtsalary = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtbalance = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btngo = new javax.swing.JButton();
        txtdes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
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
        jLabel1.setText("MAAŞ ÖDEME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(171, 171, 171))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("ÇALIŞAN ADI");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("TELEFON NUM");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("ALDIĞI");

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

        txtgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtgotMouseClicked(evt);
            }
        });

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

        txtsalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsalaryMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("AYLIK MAAŞI");

        txtbalance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbalanceMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("KALAN");

        btngo.setText("...");
        btngo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngoActionPerformed(evt);
            }
        });

        txtdes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdesMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("HAK ETTİĞİ");

        txttotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttotalMouseClicked(evt);
            }
        });
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("ÇALIŞTIĞI SAATLERİ");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("TC/PASPORT NO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btngo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                    .addComponent(txtphone)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtgot, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtbalance)
                                        .addComponent(dtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txttotal)
                                        .addComponent(txtsalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnadd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnupdate)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btngo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtgot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(158, 158, 158))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
         try {
             String sql1="select maaskalan from gider where  kimlik='"+txtid.getText()+"' and yil='"+String.valueOf(LocalDate.now().getYear())+"' and ay='"+LocalDate.now().getMonth().toString()+"'";
             ps=con.prepareCall(sql1);
             
             rs=ps.executeQuery();
             
             while(rs.next()){
                 String add= rs.getString(1);
                  balance=Integer.parseInt(add);
                //  txtgot.setText(txtdes.getText());
             }
             
           //  int des=Integer.parseInt(txtdes.getText());
             int got=Integer.parseInt(txtgot.getText());;
             
             
             
             
             
             
             if(balance<=0){
                 JOptionPane.showMessageDialog(null, "Çalışan zaten maaşını aldı.");
             }
             else if((balance>0)&&(balance<got)){
                  JOptionPane.showMessageDialog(null, "Çalışana hak ettiği maaşından fazlası veremezsiniz.");
                 
             }
                 
                 else{
                         
                         
                 
                 try{
                     
                     
                     
                     String sql="insert into gider (calisanadi,kimlik,telefon,yil,ay,calistigi,maasi,hak,aldigi,maaskalan,maastarihi) values(?,?,?,?,?,?,?,?,?,?,?)";
                     ps=con.prepareStatement(sql);
                     ps.setString(1,txtname.getText());
                     ps.setString(2,txtid.getText());
                     ps.setString(3,txtphone.getText());
                     ps.setString(4,String.valueOf(LocalDate.now().getYear()));
                     ps.setString(5,LocalDate.now().getMonth().toString());
                     
                     ps.setString(6, txttotal.getText());
                     ps.setString(7,txtsalary.getText());
                     ps.setString(8, txtdes.getText());
                     ps.setString(9, txtgot.getText());
                     ps.setString(10,txtbalance.getText());
                     
                     SimpleDateFormat dateformats= new SimpleDateFormat("YYYY-MM-DD");
                     String dps=dateformats.format(this.dtdate.getDate());
                     
                     ps.setString(11,dps);
                     
                     
                     
                     
                     ps.executeUpdate();
                     updateexpense();
                   updatesalary();
                     JOptionPane.showMessageDialog(null,"Maaşı başarıyla kaydedildi");
                     
                     
                     reset();
                     
                 }
                 catch(Exception e){
                     JOptionPane.showMessageDialog(null,e.getMessage());
                 }
             }
             
             // TODO add your handling code here:
         } catch (SQLException ex) {
             Logger.getLogger(paysalary.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

      
 year = LocalDate.now().getYear();   
  
                         
try{
    String sql="update gider set calisanadi=?,telefon=?,yil=?, ay=?,calistigi=?,maasi=?,hak=?,aldigi=?,maaskalan=?,maastarihi=? where kimlik=?";
    ps=con.prepareStatement(sql);
    
    
      ps.setString(1,txtname.getText());
         ps.setString(2,txtphone.getText());
    ps.setString(3,String.valueOf(LocalDate.now().getYear()));
    ps.setString(4,LocalDate.now().getMonth().toString());
    ps.setString(5, txttotal.getText());
    ps.setString(6, txtsalary.getText());
    ps.setString(7, txtdes.getText());
    ps.setString(8, txtgot.getText());
    ps.setString(9,txtbalance.getText());
    ps.setString(10,dtdate.getDate().toString());
    ps.setString(11,txtid.getText());
    
    ps.executeUpdate();
    
    JOptionPane.showMessageDialog(null,"Çalışan maaşı başarıyla güncellendi");
    reset();
    updateexpense();
    updatesalary();
            
  salary sal = new salary();
    sal.showsalary();
    this.setVisible(false);
    sal.setVisible(true);
    
    

             
             // TODO add your handling code here:
         }
catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }                                         

    private void verify(){
      try{
          
     
        
    
        
         }
      catch(Exception e){
          
      }        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtbalanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbalanceMouseClicked
calcBalance();      // TODO add your handling code here:
    }//GEN-LAST:event_txtbalanceMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
this.setVisible(false);
        salary sl = new salary();
sl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void txttotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttotalMouseClicked
calcltime();       // TODO add your handling code here:
    }//GEN-LAST:event_txttotalMouseClicked

    private void txtsalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsalaryMouseClicked
 bringsal();      // TODO add your handling code here:
    }//GEN-LAST:event_txtsalaryMouseClicked

    private void txtdesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdesMouseClicked
calcmin();
        bringsaatlik();
        calcdes();        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesMouseClicked

    private void txtgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtgotMouseClicked
calcmin();        // TODO add your handling code here:
    }//GEN-LAST:event_txtgotMouseClicked

    private void btngoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngoActionPerformed
empstemp empt= new empstemp() ;
this.setVisible(false);
empt.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btngoActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

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
            java.util.logging.Logger.getLogger(paysalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paysalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paysalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paysalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new paysalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnadd;
    private javax.swing.JButton btngo;
    public javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    public com.toedter.calendar.JDateChooser dtdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtbalance;
    public javax.swing.JTextField txtdes;
    public javax.swing.JTextField txtgot;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtname;
    public javax.swing.JTextField txtphone;
    public javax.swing.JTextField txtsalary;
    public javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
