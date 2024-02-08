/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.petsponsor.view;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class FrmFoodAndRoll extends javax.swing.JFrame {

    /**
     * Creates new form FrmPetSponsor
     */
    public FrmFoodAndRoll() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFoodandRoll = new javax.swing.JMenu();
        itmExit = new javax.swing.JMenuItem();
        itmLogOut = new javax.swing.JMenuItem();
        itmRegisterPets = new javax.swing.JMenu();
        itmRegisterChef = new javax.swing.JMenuItem();
        mnuSponsors = new javax.swing.JMenu();
        itmRegisterCustomer = new javax.swing.JMenuItem();
        itmViewPlates = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnuContributions = new javax.swing.JMenu();
        itmPayByCreditCard = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuFoodandRoll.setText("Food and Roll Menu");

        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        mnuFoodandRoll.add(itmExit);

        itmLogOut.setText("Log Out");
        itmLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLogOutActionPerformed(evt);
            }
        });
        mnuFoodandRoll.add(itmLogOut);

        jMenuBar1.add(mnuFoodandRoll);

        itmRegisterPets.setText("Chef");

        itmRegisterChef.setText("Register");
        itmRegisterChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegisterChefActionPerformed(evt);
            }
        });
        itmRegisterPets.add(itmRegisterChef);

        jMenuBar1.add(itmRegisterPets);

        mnuSponsors.setText("Customer");

        itmRegisterCustomer.setText("Register");
        itmRegisterCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegisterCustomerActionPerformed(evt);
            }
        });
        mnuSponsors.add(itmRegisterCustomer);

        itmViewPlates.setText("View Plates");
        itmViewPlates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmViewPlatesActionPerformed(evt);
            }
        });
        mnuSponsors.add(itmViewPlates);

        jMenuBar1.add(mnuSponsors);

        jMenu2.setText("Manager");

        jMenuItem3.setText("Register");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Manage Plates");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        mnuContributions.setText("Contributions");

        itmPayByCreditCard.setText("Credits");
        itmPayByCreditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPayByCreditCardActionPerformed(evt);
            }
        });
        mnuContributions.add(itmPayByCreditCard);

        jMenuBar1.add(mnuContributions);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmViewPlatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmViewPlatesActionPerformed
        FrmViewPlates frmViewPlates = new FrmViewPlates();
        this.setVisible(false);
        frmViewPlates.setVisible(true);
    }//GEN-LAST:event_itmViewPlatesActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrmViewPlates frmViewPlates = new FrmViewPlates();
        this.setVisible(false);
        frmViewPlates.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void itmRegisterChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegisterChefActionPerformed
        FrmChef frmChef = new FrmChef();
        this.setVisible(false);
        frmChef.setVisible(true);
        
    }//GEN-LAST:event_itmRegisterChefActionPerformed

    private void itmRegisterCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegisterCustomerActionPerformed
        FrmCustomer frmCustomer = new FrmCustomer();
        this.setVisible(false);
        frmCustomer.setVisible(true);
    }//GEN-LAST:event_itmRegisterCustomerActionPerformed

    private void itmLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLogOutActionPerformed
        int selection;
        selection = JOptionPane.showConfirmDialog(rootPane, "Are you sure?","LogOut", JOptionPane.YES_NO_OPTION);
        if(selection ==JOptionPane.YES_OPTION){
            FrmLogin frmLogin = new FrmLogin();
            this.setVisible(false);
            frmLogin.setVisible(true);
        }
    }//GEN-LAST:event_itmLogOutActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FrmManager frmManager = new FrmManager();
        this.setVisible(false);
        frmManager.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void itmPayByCreditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPayByCreditCardActionPerformed
        FrmFoodAndRollSplash frmFoodAndRollSplash = new FrmFoodAndRollSplash();
        this.setVisible(false);
        frmFoodAndRollSplash.setVisible(true);
    }//GEN-LAST:event_itmPayByCreditCardActionPerformed

    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
         System.exit(0);
    }//GEN-LAST:event_itmExitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmFoodAndRoll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFoodAndRoll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFoodAndRoll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFoodAndRoll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFoodAndRoll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmLogOut;
    private javax.swing.JMenuItem itmPayByCreditCard;
    private javax.swing.JMenuItem itmRegisterChef;
    private javax.swing.JMenuItem itmRegisterCustomer;
    private javax.swing.JMenu itmRegisterPets;
    private javax.swing.JMenuItem itmViewPlates;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu mnuContributions;
    private javax.swing.JMenu mnuFoodandRoll;
    private javax.swing.JMenu mnuSponsors;
    // End of variables declaration//GEN-END:variables
}