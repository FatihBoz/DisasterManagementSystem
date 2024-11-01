/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package swing;

import classes.LandSlide;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gokay
 */
public class LandSlideAdding extends javax.swing.JInternalFrame {

    /**
     * Creates new form LandSlideAdding
     */
    public LandSlideAdding() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jTime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jSeverity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jAdress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLocation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jValleyDepth = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(409, 157));

        jPanel13.setMinimumSize(new java.awt.Dimension(200, 42));
        jPanel13.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel13.setLayout(new java.awt.BorderLayout(4, 4));

        jTime.setMinimumSize(new java.awt.Dimension(64, 35));
        jTime.setPreferredSize(new java.awt.Dimension(64, 27));
        jPanel13.add(jTime, java.awt.BorderLayout.CENTER);

        jLabel4.setText("Time");
        jLabel4.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel4.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 16));
        jPanel13.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPanel15.setMinimumSize(new java.awt.Dimension(200, 42));
        jPanel15.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel15.setLayout(new java.awt.BorderLayout(4, 4));

        jSeverity.setMinimumSize(new java.awt.Dimension(64, 35));
        jSeverity.setPreferredSize(new java.awt.Dimension(64, 27));
        jPanel15.add(jSeverity, java.awt.BorderLayout.CENTER);

        jLabel6.setText("Severity");
        jLabel6.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel6.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 16));
        jPanel15.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        jPanel11.setMinimumSize(new java.awt.Dimension(200, 42));
        jPanel11.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel11.setLayout(new java.awt.BorderLayout(4, 4));

        jTextField6.setMinimumSize(new java.awt.Dimension(64, 35));
        jTextField6.setPreferredSize(new java.awt.Dimension(64, 27));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6emailAdressTextFieldActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField6, java.awt.BorderLayout.CENTER);

        jLabel2.setText("Adress");
        jLabel2.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 16));
        jPanel11.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel12.setMinimumSize(new java.awt.Dimension(200, 42));
        jPanel12.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel12.setLayout(new java.awt.BorderLayout(4, 4));

        jAdress.setMinimumSize(new java.awt.Dimension(64, 35));
        jAdress.setPreferredSize(new java.awt.Dimension(64, 27));
        jAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdressemailAdressTextFieldActionPerformed(evt);
            }
        });
        jPanel12.add(jAdress, java.awt.BorderLayout.CENTER);

        jLabel3.setText("Adress");
        jLabel3.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 16));
        jPanel12.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_END);

        jPanel14.setMinimumSize(new java.awt.Dimension(200, 42));
        jPanel14.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel14.setLayout(new java.awt.BorderLayout(4, 4));

        jLocation.setMinimumSize(new java.awt.Dimension(64, 35));
        jLocation.setPreferredSize(new java.awt.Dimension(64, 27));
        jLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLocationemailAdressTextFieldActionPerformed(evt);
            }
        });
        jPanel14.add(jLocation, java.awt.BorderLayout.CENTER);

        jLabel5.setText("Location");
        jLabel5.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel5.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 16));
        jPanel14.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        jLabel7.setText("List");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel16.setMinimumSize(new java.awt.Dimension(200, 42));
        jPanel16.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel16.setLayout(new java.awt.BorderLayout(4, 4));

        jValleyDepth.setMinimumSize(new java.awt.Dimension(64, 35));
        jValleyDepth.setPreferredSize(new java.awt.Dimension(64, 27));
        jValleyDepth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jValleyDepthemailAdressTextFieldActionPerformed(evt);
            }
        });
        jPanel16.add(jValleyDepth, java.awt.BorderLayout.CENTER);

        jLabel9.setText("ValleyDepth");
        jLabel9.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel9.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel9.setPreferredSize(new java.awt.Dimension(50, 16));
        jPanel16.add(jLabel9, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6emailAdressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6emailAdressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6emailAdressTextFieldActionPerformed

    private void jAdressemailAdressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdressemailAdressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAdressemailAdressTextFieldActionPerformed

    private void jLocationemailAdressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLocationemailAdressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLocationemailAdressTextFieldActionPerformed

    private void jValleyDepthemailAdressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jValleyDepthemailAdressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jValleyDepthemailAdressTextFieldActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) LandSlideTable.jLandSlideTable.getModel();
        
        String adress = jAdress.getText();
        String severity = jSeverity.getText();
        String location = jLocation.getText();
        String time = jTime.getText();
        String valleyDepth = jValleyDepth.getText();
        String type = "LandSlide";
       
        if(adress.isEmpty() ||severity.isEmpty() || location.isEmpty() || time.isEmpty()){
            JOptionPane.showMessageDialog(null, "Empty field");
        }
        else{
            
            
           
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
            
            try{
                LocalDate date = LocalDate.parse(time, formatter);
                 model.addRow(new Object[]{adress,location,time,type,severity,valleyDepth});
                LandSlide e = new LandSlide(adress, Long.valueOf(location), date, type, severity,Integer.parseInt(valleyDepth));
                Ooadproject.incidentList.add(e);
                String filePath = "src\\landslide.txt";
                String s = adress + "," + location + "," + time + "," + type + "," + severity +  "," + valleyDepth + "\n";
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            writer.write(s);
            System.out.println("Successfully written to the file: " + filePath);
                } catch (IOException z) {
            System.err.println("An error occurred while writing to the file: " + z.getMessage());
         }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Date format is not true;");
            }
                
                
                
        
        
        }
        jAdress.setText("");
        jSeverity.setText("");
        jLocation.setText("");
        jTime.setText("");
        jValleyDepth.setText("");
    }//GEN-LAST:event_jPanel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAdress;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLocation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JTextField jSeverity;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTime;
    private javax.swing.JTextField jValleyDepth;
    // End of variables declaration//GEN-END:variables
}
