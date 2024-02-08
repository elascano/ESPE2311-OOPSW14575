package ec.edu.espe.organivent.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

/**
 *
 * @author Frederick
 */
public class FrmActorMenu extends javax.swing.JFrame {
    
    private Color btnDefaultColor = new Color(116,179,237);
    private Color btnHoverColor = new Color(63,115,193);
    private Font pressedFont = new Font("Inter SemiBold", Font.PLAIN, 20);
    private Font defaultFont = new Font("Inter", Font.PLAIN, 20);
    
    /**
     * Creates new form FrmOrganiventMenu
     */
    public FrmActorMenu() {
        initComponents();
    }
    
    private void showPanel(JPanel p){
        p.setSize(390, 375);
        p.setLocation(0, 0);
        
        pnlContent.removeAll();
        pnlContent.add(p, BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        pnlMainMenuBar = new javax.swing.JPanel();
        btnActor = new javax.swing.JPanel();
        txtActorbtn = new javax.swing.JLabel();
        btnStaff = new javax.swing.JPanel();
        txtUpdatebtn = new javax.swing.JLabel();
        btnInsert = new javax.swing.JPanel();
        txtInsertbtn = new javax.swing.JLabel();
        btnDelete = new javax.swing.JPanel();
        txtDeletebtn = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Organivent");
        setLocationByPlatform(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMainMenuBar.setBackground(new java.awt.Color(116, 179, 237));
        pnlMainMenuBar.setPreferredSize(new java.awt.Dimension(158, 375));
        pnlMainMenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActor.setBackground(new java.awt.Color(116, 179, 237));
        btnActor.setPreferredSize(new java.awt.Dimension(158, 56));

        txtActorbtn.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        txtActorbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtActorbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtActorbtn.setText("Read");
        txtActorbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtActorbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtActorbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtActorbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtActorbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnActorLayout = new javax.swing.GroupLayout(btnActor);
        btnActor.setLayout(btnActorLayout);
        btnActorLayout.setHorizontalGroup(
            btnActorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtActorbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnActorLayout.setVerticalGroup(
            btnActorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtActorbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainMenuBar.add(btnActor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        btnStaff.setBackground(new java.awt.Color(116, 179, 237));
        btnStaff.setPreferredSize(new java.awt.Dimension(158, 56));

        txtUpdatebtn.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        txtUpdatebtn.setForeground(new java.awt.Color(255, 255, 255));
        txtUpdatebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUpdatebtn.setText("Update");
        txtUpdatebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtUpdatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUpdatebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtUpdatebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtUpdatebtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnStaffLayout = new javax.swing.GroupLayout(btnStaff);
        btnStaff.setLayout(btnStaffLayout);
        btnStaffLayout.setHorizontalGroup(
            btnStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnStaffLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtUpdatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnStaffLayout.setVerticalGroup(
            btnStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnStaffLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtUpdatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainMenuBar.add(btnStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        btnInsert.setBackground(new java.awt.Color(116, 179, 237));
        btnInsert.setPreferredSize(new java.awt.Dimension(158, 56));

        txtInsertbtn.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        txtInsertbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtInsertbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInsertbtn.setText("Insert");
        txtInsertbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtInsertbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtInsertbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtInsertbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtInsertbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnInsertLayout = new javax.swing.GroupLayout(btnInsert);
        btnInsert.setLayout(btnInsertLayout);
        btnInsertLayout.setHorizontalGroup(
            btnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInsertLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtInsertbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnInsertLayout.setVerticalGroup(
            btnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInsertLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtInsertbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainMenuBar.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        btnDelete.setBackground(new java.awt.Color(116, 179, 237));
        btnDelete.setPreferredSize(new java.awt.Dimension(158, 56));

        txtDeletebtn.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        txtDeletebtn.setForeground(new java.awt.Color(255, 255, 255));
        txtDeletebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDeletebtn.setText("Delete");
        txtDeletebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtDeletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDeletebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDeletebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDeletebtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDeleteLayout = new javax.swing.GroupLayout(btnDelete);
        btnDelete.setLayout(btnDeleteLayout);
        btnDeleteLayout.setHorizontalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtDeletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnDeleteLayout.setVerticalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtDeletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainMenuBar.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        background.add(pnlMainMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlContent.setPreferredSize(new java.awt.Dimension(390, 375));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("ACTORS");

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel1)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        background.add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtActorbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtActorbtnMouseEntered
    }//GEN-LAST:event_txtActorbtnMouseEntered

    private void txtActorbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtActorbtnMouseExited
       
    }//GEN-LAST:event_txtActorbtnMouseExited

    private void txtActorbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtActorbtnMouseClicked
        FrmReadActor frmReadActor = new FrmReadActor();
        frmReadActor.setVisible(true);
    }//GEN-LAST:event_txtActorbtnMouseClicked

    private void txtUpdatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUpdatebtnMouseClicked
       
    }//GEN-LAST:event_txtUpdatebtnMouseClicked

    private void txtUpdatebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUpdatebtnMouseEntered
    }//GEN-LAST:event_txtUpdatebtnMouseEntered

    private void txtUpdatebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUpdatebtnMouseExited
        
    }//GEN-LAST:event_txtUpdatebtnMouseExited

    private void txtInsertbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInsertbtnMouseClicked
        
    }//GEN-LAST:event_txtInsertbtnMouseClicked

    private void txtInsertbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInsertbtnMouseEntered
    }//GEN-LAST:event_txtInsertbtnMouseEntered

    private void txtInsertbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInsertbtnMouseExited
       
    }//GEN-LAST:event_txtInsertbtnMouseExited

    private void txtDeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeletebtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeletebtnMouseClicked

    private void txtDeletebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeletebtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeletebtnMouseEntered

    private void txtDeletebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeletebtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeletebtnMouseExited

    
    private void resetButtonColors(){
        btnActor.setBackground(btnDefaultColor);
    }
    
    private void resetFontFormat(){
        txtActorbtn.setFont(defaultFont);
    }
    
    
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
            java.util.logging.Logger.getLogger(FrmActorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmActorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmActorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmActorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmActorMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnActor;
    private javax.swing.JPanel btnDelete;
    private javax.swing.JPanel btnInsert;
    private javax.swing.JPanel btnStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlMainMenuBar;
    private javax.swing.JLabel txtActorbtn;
    private javax.swing.JLabel txtDeletebtn;
    private javax.swing.JLabel txtInsertbtn;
    private javax.swing.JLabel txtUpdatebtn;
    // End of variables declaration//GEN-END:variables
}