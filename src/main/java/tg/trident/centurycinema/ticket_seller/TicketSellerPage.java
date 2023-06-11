/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tg.trident.centurycinema.ticket_seller;

import java.awt.Component;


/**
 *
 * @author dagim
 */
public class TicketSellerPage extends javax.swing.JFrame {

    /**
     * Creates new form TicketSeller
     */
    public TicketSellerPage() {
        initComponents();
        changePanel(dashboard1);
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        addReservation1 = new tg.trident.centurycinema.ticket_seller.AddReservation();
        dashboard1 = new tg.trident.centurycinema.ticket_seller.Dashboard();
        settingPassword1 = new tg.trident.centurycinema.ticket_seller.SettingPassword();
        settingProfile1 = new tg.trident.centurycinema.ticket_seller.SettingProfile();
        jMenuBar1 = new javax.swing.JMenuBar();
        dashboard = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        mainTSPage = new javax.swing.JMenuItem();
        reservations = new javax.swing.JMenu();
        addReservation = new javax.swing.JMenuItem();
        settings = new javax.swing.JMenu();
        profile = new javax.swing.JMenuItem();
        password = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(37, 37, 37));
        mainPanel.setLayout(new java.awt.CardLayout());
        mainPanel.add(addReservation1, "card5");

        javax.swing.GroupLayout dashboard1Layout = new javax.swing.GroupLayout(dashboard1);
        dashboard1.setLayout(dashboard1Layout);
        dashboard1Layout.setHorizontalGroup(
            dashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        dashboard1Layout.setVerticalGroup(
            dashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        mainPanel.add(dashboard1, "card8");
        mainPanel.add(settingPassword1, "card6");
        mainPanel.add(settingProfile1, "card7");

        jMenuBar1.setBackground(new java.awt.Color(64, 61, 61));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setAlignmentY(0.5F);
        jMenuBar1.setOpaque(true);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(800, 58));

        dashboard.setBackground(new java.awt.Color(37, 37, 37));
        dashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setText("Dashboard");
        dashboard.setToolTipText("");
        dashboard.setBorderPainted(false);
        dashboard.setContentAreaFilled(false);
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dashboard.setMargin(new java.awt.Insets(0, 200, 0, 0));
        dashboard.setPreferredSize(new java.awt.Dimension(100, 23));
        dashboard.setRequestFocusEnabled(false);
        dashboard.setRolloverEnabled(false);

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logout.setBackground(new java.awt.Color(64, 61, 61));
        logout.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setBorder(null);
        logout.setBorderPainted(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout.setMargin(new java.awt.Insets(0, 0, 0, 0));
        logout.setOpaque(true);
        logout.setPreferredSize(new java.awt.Dimension(150, 40));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        dashboard.add(logout);

        mainTSPage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mainTSPage.setBackground(new java.awt.Color(64, 61, 61));
        mainTSPage.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        mainTSPage.setForeground(new java.awt.Color(255, 255, 255));
        mainTSPage.setText("Main Page");
        mainTSPage.setBorder(null);
        mainTSPage.setBorderPainted(false);
        mainTSPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainTSPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTSPage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainTSPage.setMargin(new java.awt.Insets(0, 0, 0, 0));
        mainTSPage.setOpaque(true);
        mainTSPage.setPreferredSize(new java.awt.Dimension(150, 40));
        mainTSPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainTSPageActionPerformed(evt);
            }
        });
        dashboard.add(mainTSPage);

        jMenuBar1.add(dashboard);

        reservations.setBackground(new java.awt.Color(37, 37, 37));
        reservations.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        reservations.setForeground(new java.awt.Color(255, 255, 255));
        reservations.setText("Reservations");
        reservations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reservations.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        reservations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reservations.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reservations.setMargin(new java.awt.Insets(3, 10, 3, 6));
        reservations.setPreferredSize(new java.awt.Dimension(100, 23));
        reservations.setRolloverEnabled(false);

        addReservation.setBackground(new java.awt.Color(64, 61, 61));
        addReservation.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        addReservation.setForeground(new java.awt.Color(255, 255, 255));
        addReservation.setText("Add Reservation");
        addReservation.setBorder(null);
        addReservation.setBorderPainted(false);
        addReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addReservation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addReservation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addReservation.setMargin(new java.awt.Insets(0, 10, 0, 6));
        addReservation.setOpaque(true);
        addReservation.setPreferredSize(new java.awt.Dimension(150, 40));
        addReservation.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                addReservationComponentShown(evt);
            }
        });
        addReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addReservationActionPerformed(evt);
            }
        });
        reservations.add(addReservation);

        jMenuBar1.add(reservations);

        settings.setBackground(new java.awt.Color(37, 37, 37));
        settings.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        settings.setForeground(new java.awt.Color(255, 255, 255));
        settings.setText("Settings");
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        settings.setMargin(new java.awt.Insets(3, 10, 3, 6));
        settings.setPreferredSize(new java.awt.Dimension(75, 23));
        settings.setRolloverEnabled(false);

        profile.setBackground(new java.awt.Color(64, 61, 61));
        profile.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setText("Profile");
        profile.setBorder(null);
        profile.setBorderPainted(false);
        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profile.setMargin(new java.awt.Insets(0, 6, 0, 6));
        profile.setOpaque(true);
        profile.setPreferredSize(new java.awt.Dimension(150, 40));
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        settings.add(profile);

        password.setBackground(new java.awt.Color(64, 61, 61));
        password.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        password.setBorder(null);
        password.setBorderPainted(false);
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        password.setMargin(new java.awt.Insets(0, 6, 0, 6));
        password.setOpaque(true);
        password.setPreferredSize(new java.awt.Dimension(150, 40));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        settings.add(password);

        jMenuBar1.add(settings);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void addReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addReservationActionPerformed
        changePanel(addReservation1);
    }//GEN-LAST:event_addReservationActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
       changePanel(settingProfile1);
    }//GEN-LAST:event_profileActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        changePanel(settingPassword1);
    }//GEN-LAST:event_passwordActionPerformed

    private void mainTSPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainTSPageActionPerformed
        changePanel(dashboard1);
    }//GEN-LAST:event_mainTSPageActionPerformed

    private void addReservationComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_addReservationComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_addReservationComponentShown

    public void changePanel(Component c){
         mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(c);
        mainPanel.repaint();
        mainPanel.revalidate();
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
            java.util.logging.Logger.getLogger(TicketSellerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketSellerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketSellerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketSellerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketSellerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addReservation;
    private tg.trident.centurycinema.ticket_seller.AddReservation addReservation1;
    private javax.swing.JMenu dashboard;
    private tg.trident.centurycinema.ticket_seller.Dashboard dashboard1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem mainTSPage;
    private javax.swing.JMenuItem password;
    private javax.swing.JMenuItem profile;
    private javax.swing.JMenu reservations;
    private tg.trident.centurycinema.ticket_seller.SettingPassword settingPassword1;
    private tg.trident.centurycinema.ticket_seller.SettingProfile settingProfile1;
    private javax.swing.JMenu settings;
    // End of variables declaration//GEN-END:variables
}
