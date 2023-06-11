/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tg.trident.centurycinema;

import Model.Admin;
import Model.CenturyModel;
import Model.Movie;
import javax.swing.JFrame;
import tg.trident.centurycinema.ticket_seller.TicketSellerPage;
/**
 *
 * @author dagim
 */
public class CenturyCinema {
    public static int id = 1;// used to get current signed in user of any type

    public static void main(String[] args) {
        JFrame frame = new TicketSellerPage();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 550);
        frame.setVisible(true);
        
        
    }
}
