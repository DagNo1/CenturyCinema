/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tg.trident.centurycinema.ticket_seller;

import Model.CenturyModel;
import java.awt.Component;
import tg.trident.centurycinema.CenturyCinema;


/**
 *
 * @author dagim
 */
public class AddReservation extends javax.swing.JPanel {
    private int progress = 0;
    /**
     * Creates new form AddReservation
     */
    public AddReservation() {
        initComponents();
        changePanel(selectScreening1);
    }
    
    public void changePanel(Component c){
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        jPanel1.add(c);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        next = new tg.trident.centurycinema.buttons.GoldenButton();
        jPanel1 = new javax.swing.JPanel();
        seatSelectionPage1 = new tg.trident.centurycinema.ticket_seller.reservation_panels.SeatSelectionPage();
        selectScreening1 = new tg.trident.centurycinema.ticket_seller.reservation_panels.SelectScreening();
        ticketConfirmationPage1 = new tg.trident.centurycinema.ticket_seller.reservation_panels.TicketConfirmationPage();
        ticketSuccessPage1 = new tg.trident.centurycinema.ticket_seller.reservation_panels.TicketSuccessPage();

        setBackground(new java.awt.Color(37, 37, 37));

        next.setText("Select Screening");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(37, 37, 37));
        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(seatSelectionPage1, "card2");
        jPanel1.add(selectScreening1, "card3");
        jPanel1.add(ticketConfirmationPage1, "card4");
        jPanel1.add(ticketSuccessPage1, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        switch (progress) {
            case 0:
                seatSelectionPage1.setScreening(selectScreening1.getSelectedScreening());
                changePanel(seatSelectionPage1);
                next.setText("Select Seats");
                break;
            case 1:
                ticketConfirmationPage1.setData(
                        seatSelectionPage1.getScreeningId(), 
                        seatSelectionPage1.getSelectedSeats()
                );
                changePanel(ticketConfirmationPage1);
                next.setText("Confirm Ticket");
                break;
            case 2:
                System.out.print("1");
               ticketSuccessPage1.setData(
                        seatSelectionPage1.getScreeningId(), 
                        seatSelectionPage1.getSelectedSeats()
                );
               //make reservation
                CenturyModel.createReservation(seatSelectionPage1.getScreeningId(), CenturyCinema.id, ticketConfirmationPage1.getSelectedSeats());
                
                System.out.print("2");
                changePanel(ticketSuccessPage1);
                next.setText("Finish");
                break;
            case 3:
                seatSelectionPage1.clearData();
                ticketConfirmationPage1.clearData();
                ticketSuccessPage1.clearData();
                changePanel(selectScreening1);
                progress=-1;
                next.setText("Select Screening");
                //TODO: GO TO DASHBOARD
                break;
            default:
                break;
        }
        progress++;
    }//GEN-LAST:event_nextActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private tg.trident.centurycinema.buttons.GoldenButton next;
    private tg.trident.centurycinema.ticket_seller.reservation_panels.SeatSelectionPage seatSelectionPage1;
    private tg.trident.centurycinema.ticket_seller.reservation_panels.SelectScreening selectScreening1;
    private tg.trident.centurycinema.ticket_seller.reservation_panels.TicketConfirmationPage ticketConfirmationPage1;
    private tg.trident.centurycinema.ticket_seller.reservation_panels.TicketSuccessPage ticketSuccessPage1;
    // End of variables declaration//GEN-END:variables
}
