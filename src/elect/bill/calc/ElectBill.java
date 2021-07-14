/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elect.bill.calc;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Afraz
 */
public class ElectBill extends javax.swing.JFrame {

    /**
     * Creates new form ElectBill
     */
    public ElectBill() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cID_cb = new javax.swing.JComboBox<>();
        fName_tf = new javax.swing.JTextField();
        address_tf = new javax.swing.JTextField();
        cType_cb = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tUnits_tf = new javax.swing.JTextField();
        calc_btn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tUnitCh_lbl = new javax.swing.JLabel();
        fuel_lbl = new javax.swing.JLabel();
        fc_lbl = new javax.swing.JLabel();
        totalBill_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ECB Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel10.setText("Customer ID");

        jLabel11.setText("Full Name");

        jLabel12.setText("Addreess");

        jLabel13.setText("Customer Type");

        cID_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Customer's Id --", "1", "2", "3", "4", " " }));
        cID_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cID_cbActionPerformed(evt);
            }
        });

        fName_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fName_tfActionPerformed(evt);
            }
        });

        address_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_tfActionPerformed(evt);
            }
        });

        cType_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Customr Type --", "Domestic", "Business", "Public", " " }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cType_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cID_cb, 0, 213, Short.MAX_VALUE)
                    .addComponent(fName_tf)
                    .addComponent(address_tf))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cID_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fName_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(address_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cType_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bill Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel14.setText("No Of Units");

        calc_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        calc_btn.setText("Calculate Bill Summary");
        calc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calc_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(tUnits_tf))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tUnits_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calc_btn)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ECB Bill Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Total Unit Charges");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Fuel Adjustments");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Fixed Costs");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Total Bill");

        tUnitCh_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tUnitCh_lbl.setText("jLabel19");

        fuel_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fuel_lbl.setText("jLabel20");

        fc_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fc_lbl.setText("jLabel21");

        totalBill_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        totalBill_lbl.setText("jLabel22");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalBill_lbl)
                    .addComponent(fc_lbl)
                    .addComponent(fuel_lbl)
                    .addComponent(tUnitCh_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tUnitCh_lbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(fuel_lbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(fc_lbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(totalBill_lbl))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fName_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fName_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fName_tfActionPerformed

    private void address_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_tfActionPerformed

    private void calc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc_btnActionPerformed
        // TODO add your handling code here:
        if(cType_cb.getSelectedItem().equals("Domestic")){
                int tUnits = parseInt(tUnits_tf.getText());
                float tUnitCharge = tUnits*24.20f;
               
                float fuelAdj = tUnitCharge*0/100;
                float fCost = 540;
                float tBill = tUnitCharge+fuelAdj+fCost;
                
                
               
                tUnitCh_lbl.setText(""+tUnitCharge);
                fuel_lbl.setText("0%");
                fc_lbl.setText(""+fCost); 
                totalBill_lbl.setText(""+tBill);
        }
        else if(cType_cb.getSelectedItem().equals("Business")){
                int tUnits = parseInt(tUnits_tf.getText());
                float tUnitCharge = tUnits*10.80f;
               
                float fuelAdj = tUnitCharge*10/100;
                float fCost = 200;
                float tBill = tUnitCharge+fuelAdj+fCost;
                
                
               
                tUnitCh_lbl.setText(""+tUnitCharge);
                fuel_lbl.setText("10%");
                fc_lbl.setText(""+fCost); 
                totalBill_lbl.setText(""+tBill);
        }
        else if(cType_cb.getSelectedItem().equals("Public")){
                int tUnits = parseInt(tUnits_tf.getText());
                float tUnitCharge = tUnits*12.40f;
               
                float fuelAdj = tUnitCharge*5/100;
                float fCost = 350;
                float tBill = tUnitCharge+fuelAdj+fCost;
                
                
               
                tUnitCh_lbl.setText(""+tUnitCharge);
                fuel_lbl.setText("5%");
                fc_lbl.setText(""+fCost); 
                totalBill_lbl.setText(""+tBill);
        }
        
    }//GEN-LAST:event_calc_btnActionPerformed

    private void cID_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cID_cbActionPerformed
        // TODO add your handling code here:
        if(cID_cb.getSelectedItem().equals("1")){
            fName_tf.setText("Afraj");
            address_tf.setText("123,Main St,Warakapola,Srilanka");
            cType_cb.setSelectedIndex(1);
            
        }
        else if(cID_cb.getSelectedItem().equals("2")){
            fName_tf.setText("Siyaj");
            address_tf.setText("321,Kuliyapitiya,Srilanka");
            cType_cb.setSelectedIndex(3);
            
        }
        
        else if(cID_cb.getSelectedItem().equals("3")){
            fName_tf.setText("Amazir");
            address_tf.setText("Kolpitty,Colombo,Srilanka");
            cType_cb.setSelectedIndex(1);
            
        }
        else if(cID_cb.getSelectedItem().equals("4")){
            fName_tf.setText("Ahshan");
            address_tf.setText("Mawanella,Srilanka");
            cType_cb.setSelectedIndex(2);
            
        }
        
    }//GEN-LAST:event_cID_cbActionPerformed

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
            java.util.logging.Logger.getLogger(ElectBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElectBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElectBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElectBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElectBill().setVisible(true);
            }
        });
    }

    // End of variables declaration    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_tf;
    private javax.swing.JComboBox<String> cID_cb;
    private javax.swing.JComboBox<String> cType_cb;
    private javax.swing.JButton calc_btn;
    private javax.swing.JTextField fName_tf;
    private javax.swing.JLabel fc_lbl;
    private javax.swing.JLabel fuel_lbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel tUnitCh_lbl;
    private javax.swing.JTextField tUnits_tf;
    private javax.swing.JLabel totalBill_lbl;
    // End of variables declaration//GEN-END:variables
}
