/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hp
 */
public final class employee extends javax.swing.JFrame {
  Connection con= connection.dbcon();
    PreparedStatement ps;
    ResultSet rs;
  
   login lg= new login();  
    String id;
   
    
        
     
     
      
    
    public employee() {
//        this.id = lg.getUser();
       // this.id = lg.txtid.getText();
        initComponents();
         Image ikon= Toolkit.getDefaultToolkit().getImage("F://iconss project//hotel-3245949-2737141.png");
       this.setIconImage(ikon);
        EmpSearch es= new EmpSearch();
      //es.filteremp();
       //  filteremp();
        
        login lg= new login();
       lbltest.setText(roles.logid);
    }

    
     public void filteremp(){
      
         if((roles.role.equals("yardimci"))||(roles.role.equals("kullanici"))){
             
       
         if(this.txtpid.getText().equals(roles.logid)){
             

             try{
                 
                 
                 
                 String sql="select * from calisanlar where kimlik ='"+txtpid.getText()+"'";
                 
                 
                 ps=con.prepareStatement(sql);
                 //ps.setString(1,txtsearch.getText());
                 
                 rs=ps.executeQuery();
                 
                 tblemps.setModel(DbUtils.resultSetToTableModel(rs));
                 
             }
             catch(Exception e){
                 
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
             
             else{
                 JOptionPane.showMessageDialog(null,"Başkasının bilgini arayamazsınız");
             }
         
              
  
    } else{
         
             try{
                 
                 
                 
                 String sql="select * from calisanlar where kimlik ='"+txtpid.getText()+"'";
                 
                 
                 ps=con.prepareStatement(sql);
                 //ps.setString(1,txtsearch.getText());
                 
                 rs=ps.executeQuery();
                 
                 tblemps.setModel(DbUtils.resultSetToTableModel(rs));
                 
             }
             catch(Exception e){
                 
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblemps = new javax.swing.JTable();
        btnpsearch = new javax.swing.JButton();
        txtpid = new javax.swing.JTextField();
        lbltest = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnreport1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblemps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ÇalışanAdı", "TC/Pasport No", "Cinsiyeti", "TelefonNumarası", "İşTipi", "ÇalışsmaSaatleri", "SaatlikMaaşı", "SözleşmeBaşlaması", "SözleşmeBitişi", "AylıkMaaşı"
            }
        ));
        tblemps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblempsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblemps);

        btnpsearch.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnpsearch.setText("Arayın");
        btnpsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpsearchActionPerformed(evt);
            }
        });

        txtpid.setText("TC/Pasport numaranızı giriniz");
        txtpid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpidActionPerformed(evt);
            }
        });

        lbltest.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("KULLANICI:");

        btnreport1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnreport1.setText("Rapor Alın");
        btnreport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreport1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltest, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnreport1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnpsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnreport1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltest, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
this.setVisible(false);
        EmpSearch es = new EmpSearch();
//es.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void btnpsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpsearchActionPerformed
   filteremp();
    }//GEN-LAST:event_btnpsearchActionPerformed

    private void txtpidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpidActionPerformed
        //employee e= new employee();
        // filteremp();
    }//GEN-LAST:event_txtpidActionPerformed

    private void tblempsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblempsMouseClicked
   // TODO add your handling code here:
    }//GEN-LAST:event_tblempsMouseClicked

    private void btnreport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreport1ActionPerformed
   JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Calisanlar Raporu.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();

            try {

                SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");

                String sql ="select * from calisanlar where kimlik='"+txtpid.getText()+"'";

                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(13);
                PdfPTable table1 = new PdfPTable(2);
                myDocument.open();

                float[] columnWidths = new float[] {5,8,7,7,7,5,5,6,7,8,7,8,8};
                table.setWidths(columnWidths);

                float[] columnWidthss = new float[] {7,8};
                table1.setWidths(columnWidthss);

                table.setWidthPercentage(100); //set table width to 100%
                table1.setWidthPercentage(100);
                myDocument.add(new Paragraph("Calisan Listesi",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("                                     "));

                PdfPCell cells = new PdfPCell(new Paragraph("Calisan Bilgisi",FontFactory.getFont(FontFactory.TIMES_ROMAN,16,Font.BOLD,BaseColor.WHITE)));
                cells.setColspan(12);
                cells.setHorizontalAlignment(Element.ALIGN_CENTER);
                cells.setBackgroundColor(BaseColor.GRAY);
                table.addCell(cells);
                //table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.RED))));
                table.addCell(new PdfPCell(new Paragraph("Calisan SN",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));

                table.addCell(new PdfPCell(new Paragraph("Calısan Adi",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Kimlik",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));

                                table.addCell(new PdfPCell(new Paragraph("Cinsiyeti",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Telefonu",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
            table.addCell(new PdfPCell(new Paragraph("Is Tipi",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Calisma Saatleri",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));

                table.addCell(new PdfPCell(new Paragraph("Hadta Sonu",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Saatlik Maasi",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Sozlesme Baslama Zamani",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Sozlesme Bitis Zamani",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Aylik Maasi",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Foto",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));

                //table.addCell(cell);
                while(rs.next())
                {

                    //            String ids= rs.getString(1) ;
                    //            table.addCell(new PdfPCell(new Phrase(ids)));
                    String ids= rs.getString("calisid") ;
                    table.addCell(new PdfPCell(new Phrase(ids)));

                    String cust= rs.getString("calisadi") ;
                    table.addCell(new PdfPCell(new Phrase(cust)));

             

                    String addd= rs.getString("kimlik") ;
                    table.addCell(new PdfPCell(new Phrase(addd)));
                    
                           String costs= rs.getString("cinsiyeti") ;
                    table.addCell(new PdfPCell(new Phrase(costs)));

                    String tt= rs.getString("telefon") ;
                    table.addCell(new PdfPCell(new Phrase(tt)));

                    String qt= rs.getString("istipi") ;
                    table.addCell(new PdfPCell(new Phrase(qt)));

                    String dts= rs.getString("calismasaat") ;
                    table.addCell(new PdfPCell(new Phrase(dts)));

                    String wrk= rs.getString("haftasonu") ;
                    table.addCell(new PdfPCell(new Phrase(wrk)));

                    String ds= rs.getString("saatlikmaas") ;
                    table.addCell(new PdfPCell(new Phrase(ds)));

                    String dtp= rs.getString("sozbasla") ;
                    table.addCell(new PdfPCell(new Phrase(dtp)));

                    String bl= rs.getString("sozbitis") ;
                    table.addCell(new PdfPCell(new Phrase(bl)));

                
                    
                     String ft= rs.getString("maasi") ;
                    table.addCell(new PdfPCell(new Phrase(ft)));

                }

                myDocument.add(table);
                myDocument.add(new Paragraph("                                     "));
                myDocument.add(new Paragraph("                                     "));

             
                myDocument.add(table1);
                myDocument.add(new Paragraph("                                     "));
                myDocument.add(new Paragraph("                                     "));
                myDocument.add(new Paragraph("                                     "));
                myDocument.add(new Paragraph("                                     "));
                myDocument.add(new Paragraph("                                     "));
                myDocument.add(new Paragraph("                                     "));
                myDocument.add(new Paragraph("         Imza :______________________                            "));

                myDocument.close();
                JOptionPane.showMessageDialog(null,"Rapor başarıyla oluşturuldu");

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);

            }
            finally {

                try{
                    rs.close();
                    ps.close();

                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);

                }
            }}        // TODO add your handling code here:
    }//GEN-LAST:event_btnreport1ActionPerformed

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
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpsearch;
    private javax.swing.JButton btnreport1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltest;
    public javax.swing.JTable tblemps;
    public javax.swing.JTextField txtpid;
    // End of variables declaration//GEN-END:variables
}
