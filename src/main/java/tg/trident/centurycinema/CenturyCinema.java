/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tg.trident.centurycinema;

import javax.swing.JFrame;
import tg.trident.centurycinema.admin.AdminPage;
/**
 *
 * @author dagim
 */
public class CenturyCinema {

    public static void main(String[] args) {
        JFrame frame = new AdminPage();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 550);
        frame.setVisible(true);
    }
}
