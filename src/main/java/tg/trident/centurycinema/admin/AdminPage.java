/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tg.trident.centurycinema.admin;

/**
 *
 * @author dagim
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public AdminPage() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        dashboard = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        ticketSellers = new javax.swing.JMenu();
        users = new javax.swing.JMenuItem();
        userAnalytics = new javax.swing.JMenuItem();
        rooms = new javax.swing.JMenu();
        addRoom = new javax.swing.JMenuItem();
        movies = new javax.swing.JMenu();
        addMovie = new javax.swing.JMenuItem();
        settings = new javax.swing.JMenu();
        profile = new javax.swing.JMenuItem();
        password = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(37, 37, 37));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TODAY’S  WACTH LIST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOMORROW’S  WACTH LIST");

        jEditorPane1.setBackground(new java.awt.Color(37, 37, 37));
        jScrollPane2.setViewportView(jEditorPane1);

        jEditorPane2.setBackground(new java.awt.Color(37, 37, 37));
        jScrollPane3.setViewportView(jEditorPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1))
                    .addComponent(jSeparator2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

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

        jMenuBar1.add(dashboard);
        dashboard.getAccessibleContext().setAccessibleName("dashboard");

        ticketSellers.setBackground(new java.awt.Color(37, 37, 37));
        ticketSellers.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ticketSellers.setForeground(new java.awt.Color(255, 255, 255));
        ticketSellers.setText("Ticket Sellers");
        ticketSellers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ticketSellers.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ticketSellers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticketSellers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ticketSellers.setMargin(new java.awt.Insets(3, 10, 3, 6));
        ticketSellers.setPreferredSize(new java.awt.Dimension(100, 23));
        ticketSellers.setRolloverEnabled(false);

        users.setBackground(new java.awt.Color(64, 61, 61));
        users.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        users.setForeground(new java.awt.Color(255, 255, 255));
        users.setText("Users");
        users.setBorder(null);
        users.setBorderPainted(false);
        users.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        users.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        users.setMargin(new java.awt.Insets(0, 10, 0, 6));
        users.setOpaque(true);
        users.setPreferredSize(new java.awt.Dimension(150, 40));
        users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersActionPerformed(evt);
            }
        });
        ticketSellers.add(users);

        userAnalytics.setBackground(new java.awt.Color(64, 61, 61));
        userAnalytics.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        userAnalytics.setForeground(new java.awt.Color(255, 255, 255));
        userAnalytics.setText("User Analytics");
        userAnalytics.setBorder(null);
        userAnalytics.setBorderPainted(false);
        userAnalytics.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userAnalytics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userAnalytics.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userAnalytics.setMargin(new java.awt.Insets(0, 6, 0, 6));
        userAnalytics.setOpaque(true);
        userAnalytics.setPreferredSize(new java.awt.Dimension(150, 40));
        userAnalytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnalyticsActionPerformed(evt);
            }
        });
        ticketSellers.add(userAnalytics);

        jMenuBar1.add(ticketSellers);

        rooms.setBackground(new java.awt.Color(37, 37, 37));
        rooms.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rooms.setForeground(new java.awt.Color(255, 255, 255));
        rooms.setText("Rooms");
        rooms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rooms.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rooms.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rooms.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rooms.setMargin(new java.awt.Insets(3, 10, 3, 6));
        rooms.setPreferredSize(new java.awt.Dimension(75, 23));
        rooms.setRolloverEnabled(false);

        addRoom.setBackground(new java.awt.Color(64, 61, 61));
        addRoom.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        addRoom.setForeground(new java.awt.Color(255, 255, 255));
        addRoom.setText("Add Room");
        addRoom.setBorder(null);
        addRoom.setBorderPainted(false);
        addRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addRoom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addRoom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addRoom.setMargin(new java.awt.Insets(0, 6, 0, 6));
        addRoom.setOpaque(true);
        addRoom.setPreferredSize(new java.awt.Dimension(150, 40));
        addRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomActionPerformed(evt);
            }
        });
        rooms.add(addRoom);

        jMenuBar1.add(rooms);

        movies.setBackground(new java.awt.Color(37, 37, 37));
        movies.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        movies.setForeground(new java.awt.Color(255, 255, 255));
        movies.setText("Movies");
        movies.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movies.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        movies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movies.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        movies.setMargin(new java.awt.Insets(3, 10, 3, 6));
        movies.setPreferredSize(new java.awt.Dimension(75, 23));
        movies.setRolloverEnabled(false);

        addMovie.setBackground(new java.awt.Color(64, 61, 61));
        addMovie.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        addMovie.setForeground(new java.awt.Color(255, 255, 255));
        addMovie.setText("Add Movie");
        addMovie.setBorder(null);
        addMovie.setBorderPainted(false);
        addMovie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMovie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addMovie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addMovie.setMargin(new java.awt.Insets(0, 6, 0, 6));
        addMovie.setOpaque(true);
        addMovie.setPreferredSize(new java.awt.Dimension(150, 40));
        addMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieActionPerformed(evt);
            }
        });
        movies.add(addMovie);

        jMenuBar1.add(movies);

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
        jMenuBar1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usersActionPerformed

    private void userAnalyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnalyticsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userAnalyticsActionPerformed

    private void addRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRoomActionPerformed

    private void addMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMovieActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profileActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addMovie;
    private javax.swing.JMenuItem addRoom;
    private javax.swing.JMenu dashboard;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu movies;
    private javax.swing.JMenuItem password;
    private javax.swing.JMenuItem profile;
    private javax.swing.JMenu rooms;
    private javax.swing.JMenu settings;
    private javax.swing.JMenu ticketSellers;
    private javax.swing.JMenuItem userAnalytics;
    private javax.swing.JMenuItem users;
    // End of variables declaration//GEN-END:variables
}
